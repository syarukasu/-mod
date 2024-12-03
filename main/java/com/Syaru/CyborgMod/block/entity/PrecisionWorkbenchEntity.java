package com.Syaru.CyborgMod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class PrecisionWorkbenchEntity extends BlockEntity {

    public PrecisionWorkbenchEntity( BlockPos pos, BlockState state) {
        super(CyborgModEntityTypes.PRECISION_WORKBENCH.get(), pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
    }
}
