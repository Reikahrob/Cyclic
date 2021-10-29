package com.lothrazar.cyclic.block;

import java.util.List;
import java.util.Random;
import com.lothrazar.cyclic.base.BlockBase;
import com.lothrazar.cyclic.util.UtilShape;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class LavaSpongeBlock extends BlockBase {

  public static final int RADIUS = 6; // TODO: config i guess

  public LavaSpongeBlock(Properties properties) {
    super(properties.randomTicks().strength(0.7F));
  }

  @SuppressWarnings("deprecation")
  @Override
  public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
    super.randomTick(state, world, pos, random);
    List<BlockPos> around = UtilShape.cubeSquareBase(pos.below(RADIUS / 2), RADIUS, RADIUS);
    final int max = world.random.nextInt(10) + around.size() / 3;
    int current = 0;
    for (BlockPos posSide : around) {
      if (current > max) {
        break;
      }
      if (posSide.equals(pos)) {
        continue;
      }
      BlockState blockHere = world.getBlockState(posSide);
      FluidState fluidHere = blockHere.getFluidState();
      if (Fluids.LAVA == fluidHere.getType()) { // this check does source only, not flowing
        //      if (fluidHere.getType().is(FluidTags.LAVA)) { // tag does flowing AND source
        //only lava and only flowing
        boolean success = world.setBlock(posSide, Blocks.AIR.defaultBlockState(), 3);
        if (success) {
          current++;
        }
        //TODO: on eat lava count up blockstate . at full do something 
      }
    }
  }
}
