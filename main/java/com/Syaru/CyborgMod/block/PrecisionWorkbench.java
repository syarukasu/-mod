package com.Syaru.CyborgMod.block;

import com.Syaru.CyborgMod.block.entity.PrecisionWorkbenchEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class PrecisionWorkbench extends BaseEntityBlock {

    public PrecisionWorkbench() {
        super(Properties.of().strength(4.0F, 1200.0F)
                .lightLevel((a)->15));
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState blockState, boolean bool) {
        super.onRemove(state, world, pos, blockState, bool);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PrecisionWorkbenchEntity(pos, state);
    }
    @Override
    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }


}
