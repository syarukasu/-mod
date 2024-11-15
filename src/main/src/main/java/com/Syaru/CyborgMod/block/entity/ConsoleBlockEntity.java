package com.Syaru.CyborgMod.block.entity;

import com.Syaru.CyborgMod.block.menu.ConsoleBlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ConsoleBlockEntity extends BlockEntity implements MenuProvider {

    public ConsoleBlockEntity(BlockPos pos, BlockState state) {
        super(CyborgModEntityTypes.CONSOLE_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public Component getDisplayName() {
        // 最新のComponent.literalを使用
        return Component.literal("コンソールブロック");
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory playerInventory, Player player) {
        // ConsoleBlockMenuを作成
        return new ConsoleBlockMenu(id, playerInventory, ContainerLevelAccess.create(this.level, this.worldPosition));
    }
}
