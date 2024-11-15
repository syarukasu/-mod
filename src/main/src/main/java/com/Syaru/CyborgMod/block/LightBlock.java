package com.Syaru.CyborgMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LightBlock extends Block {
    public LightBlock() {
        super(BlockBehaviour.Properties.of()
                .strength(5.0F, 150.0F)
                .lightLevel((a) -> 15)
                .requiresCorrectToolForDrops()
        );
    }
}