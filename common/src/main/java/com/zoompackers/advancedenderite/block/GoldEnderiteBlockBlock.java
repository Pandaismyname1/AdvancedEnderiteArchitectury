
package com.zoompackers.advancedenderite.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class GoldEnderiteBlockBlock extends Block {
	public GoldEnderiteBlockBlock() {
		super(Properties.of().requiresCorrectToolForDrops().sound(SoundType.METAL).strength(5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
