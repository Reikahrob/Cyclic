/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (C) 2014-2018 Sam Bassett (aka Lothrazar)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.lothrazar.cyclic.enchant;

import java.util.ArrayList;
import java.util.List;
import com.lothrazar.cyclic.base.EnchantBase;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EnchantAutoSmelt extends EnchantBase {

  public EnchantAutoSmelt(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
    super(rarityIn, typeIn, slots);
  }

  @Override
  public int getMaxLevel() {
    return 1;
  }

  @Override
  public boolean canApplyTogether(Enchantment ench) {
    return ench != Enchantments.SILK_TOUCH && ench != Enchantments.FORTUNE && super.canApplyTogether(ench);
  }

  @SubscribeEvent(priority = EventPriority.HIGHEST) // // i almost tried this for the compat bugs
  public void onHarvestDrops(HarvestDropsEvent event) {
    if (event.getHarvester() == null) {
      return;
    }
    PlayerEntity player = event.getHarvester();
    World world = event.getHarvester().world;
    int level = 1;//getCurrentLevelTool(event.getHarvester());
    if (level <= 0) {
      return;
    }
    if (event.isSilkTouching()) {
      return;
    } //it should be incompabile but check anyway ya
    List<ItemStack> drops = event.getDrops();
    List<ItemStack> dropsCopy = new ArrayList<ItemStack>();
    //  Collections.copy(dropsCopy, drops);//fails
    for (ItemStack drop : drops) {
      dropsCopy.add(drop.copy());//manual deep-clone
    }
    //erase list of drops and rebuild it
    drops.clear();//works since byref
    for (ItemStack drop : dropsCopy) {
      FurnaceBlock x;
      FurnaceTileEntity c = new FurnaceTileEntity();
      c.setInventorySlotContents(0, drop);
      IRecipe<?> irecipe = world.getRecipeManager().getRecipe(IRecipeType.SMELTING, c, world).orElse(null);
      if (irecipe != null) {
        //then
        ItemStack fromSmelted = irecipe.getRecipeOutput().copy();
        if (!fromSmelted.isEmpty()) {
          if (fromSmelted.getCount() == 0) { //wtf!?!?! why how does this happen? idk whatever fixed
            fromSmelted.setCount(1);
          }
          drops.add(fromSmelted);//smelt it up yo!
        }
      }
      else {//recipe is null
        drops.add(drop);//same as without enchant
      }
    }
  }
}
