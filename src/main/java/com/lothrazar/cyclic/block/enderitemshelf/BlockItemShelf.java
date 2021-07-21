package com.lothrazar.cyclic.block.enderitemshelf;

import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.base.BlockBase;
import com.lothrazar.cyclic.block.cable.CableWrench;
import com.lothrazar.cyclic.block.endershelf.BlockEnderShelf;
import com.lothrazar.cyclic.registry.TileRegistry;
import com.lothrazar.cyclic.util.UtilBlockstates;
import com.lothrazar.cyclic.util.UtilItemStack;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class BlockItemShelf extends BlockBase {

  public BlockItemShelf(Properties properties) {
    super(properties.hardnessAndResistance(1.8F));
  }

  @Override
  @OnlyIn(Dist.CLIENT)
  public void registerClient() {
    ClientRegistry.bindTileEntityRenderer(TileRegistry.ENDER_ITEM_SHELF.get(), ItemShelfRenderer::new);
  }

  @Override
  protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    builder.add(BlockStateProperties.HORIZONTAL_FACING);
  }

  @Override
  public boolean hasTileEntity(BlockState state) {
    return true;
  }

  @Override
  public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    return new TileItemShelf();
  }

  @Override
  public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
    if (state.hasTileEntity() && (!state.isIn(newState.getBlock()) || !newState.hasTileEntity())) {
      worldIn.removeTileEntity(pos);
    }
  }

  @Override
  public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
    ItemStack heldItem = player.getHeldItem(hand);
    if (hand != Hand.MAIN_HAND && heldItem.isEmpty()) {
      //if your hand is empty, dont process if its the OFF hand
      //otherwise: main hand inserts, off hand takes out right away
      return ActionResultType.PASS;
    }
    TileItemShelf shelf = getTileEntity(world, pos);
    if (heldItem.getItem().isIn(CableWrench.WRENCH)) {
      //wrench tag
      shelf.toggleShowText();
      player.swingArm(hand);
      return ActionResultType.PASS;
    }
    Direction face = hit.getFace();
    Vector3d hitVec = hit.getHitVec();
    int slot = BlockEnderShelf.getSlotFromHitVec(pos, face, hitVec);
    if (hit.getFace() == state.get(BlockStateProperties.HORIZONTAL_FACING)) {
      //
      // single shelf
      //
      if (!heldItem.isEmpty()) {
        //try to insert 
        //        if (!world.isRemote) {
        ModCyclic.LOGGER.info("insert " + slot);
        ItemStack remaining = shelf.inventory.insertItem(slot, heldItem, false);
        ModCyclic.LOGGER.info("remain " + remaining);
        if (remaining.getCount() != shelf.inventory.getStackInSlot(slot).getCount()) {
          player.setHeldItem(hand, remaining);
          player.swingArm(hand);
          return ActionResultType.CONSUME;
        }
        //        }
      }
      else { // if (heldItem.isEmpty()) {
        //try to withdraw 
        ModCyclic.LOGGER.info("withdraw  " + slot);
        int q = player.isCrouching() ? 1 : 64;
        ItemStack retrieved = shelf.inventory.extractItem(slot, q, false);
        player.setHeldItem(hand, retrieved);
        player.swingArm(hand);
        return ActionResultType.PASS;
      }
    }
    return ActionResultType.PASS;
  }

  public TileItemShelf getTileEntity(World world, BlockPos pos) {
    return (TileItemShelf) world.getTileEntity(pos);
  }

  @Override
  public List<ItemStack> getDrops(BlockState state, net.minecraft.loot.LootContext.Builder builder) {
    // because harvestBlock manually forces a drop, we must do this to dodge that
    return new ArrayList<>();
  }

  @Override
  public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
    if (entity != null) {
      //facing state if needed 
      world.setBlockState(pos, state.with(BlockStateProperties.HORIZONTAL_FACING, UtilBlockstates.getFacingFromEntityHorizontal(pos, entity)), 2);
    }
    TileEntity tileentity = world.getTileEntity(pos);
    TileItemShelf shelf = (TileItemShelf) tileentity;
    if (stack.getTag() != null) {
      //to tile from tag 
      shelf.inventory.deserializeNBT(stack.getTag());
    }
  }

  @Override
  public void harvestBlock(World world, PlayerEntity player, BlockPos pos, BlockState state, TileEntity tileentity, ItemStack stackToolUsed) {
    super.harvestBlock(world, player, pos, state, tileentity, stackToolUsed);
    ItemStack newStack = new ItemStack(this);
    if (tileentity instanceof TileItemShelf) {
      TileItemShelf shelf = (TileItemShelf) tileentity;
      CompoundNBT tileData = shelf.inventory.serializeNBT();
      //read from tile, write to itemstack 
      newStack.setTag(tileData);
    }
    UtilItemStack.drop(world, pos, newStack);
  }
}
