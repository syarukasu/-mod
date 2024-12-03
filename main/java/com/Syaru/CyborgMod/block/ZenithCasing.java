package com.Syaru.CyborgMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ZenithCasing extends Block {
    public ZenithCasing() {
        super(BlockBehaviour.Properties.of()
                .strength(5.0F, 150.0F)
                .requiresCorrectToolForDrops()
        );
    }
}
