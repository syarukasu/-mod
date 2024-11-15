package com.Syaru.CyborgMod.block;

import com.Syaru.CyborgMod.block.entity.ConsoleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import net.minecraft.world.level.block.entity.BlockEntity;

public class ConsoleBlock extends Block implements EntityBlock {

    public ConsoleBlock() {
        super(Properties.of().strength(4.0F, 12.0F).requiresCorrectToolForDrops());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ConsoleBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, ServerPlayer player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide) {
            MenuProvider menuProvider = this.getMenuProvider(state, world, pos);
            if (menuProvider != null) {
                NetworkHooks.openScreen(player, menuProvider, pos);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
