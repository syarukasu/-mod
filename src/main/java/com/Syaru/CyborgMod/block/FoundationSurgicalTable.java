package com.Syaru.CyborgMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class FoundationSurgicalTable extends Block {
    public FoundationSurgicalTable() {
        super(BlockBehaviour.Properties.copy(Blocks.STONE));
    }
}
