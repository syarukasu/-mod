package com.Syaru.CyborgMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MonitoringCameraBlock extends Block {
    public MonitoringCameraBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.STONE));
    }
}
