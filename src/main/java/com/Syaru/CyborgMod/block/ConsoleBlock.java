package com.Syaru.CyborgMod.block;

import com.Syaru.CyborgMod.block.entity.ConsoleBlockEntity; // ConsoleBlockEntityをインポート
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.network.chat.Component;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class ConsoleBlock extends BaseEntityBlock {

    public ConsoleBlock() {
        super(Properties.of().strength(5.0F, 750.0F).lightLevel((a) -> 10));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ConsoleBlockEntity(pos, state); // ConsoleBlockEntityを返す
    }
}
