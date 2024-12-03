package com.Syaru.CyborgMod.block.menu;

import com.Syaru.CyborgMod.CyborgModMenus;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class PrecisionWorkbenchMenu extends AbstractContainerMenu {

    private final Container container;
    private final ContainerLevelAccess access;

    public PrecisionWorkbenchMenu(int id, Inventory playerInventory, Container container, ContainerLevelAccess access) {
        super(CyborgModMenus.PRECISION_WORKBENCH.get(), id);
        this.container = container;
        this.access = access;

        // コンテナスロットの設定 (例: ワークベンチ固有のスロット)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.addSlot(new Slot(container, j + i * 3, 62 + j * 18, 17 + i * 18));
            }
        }

        // プレイヤーインベントリのスロット設定
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }

    @Override
    public boolean stillValid(Player player) {
        // ワークベンチ周囲でのアクセスを許可
        return this.access.evaluate((world, pos) -> true, true);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            if (index < 9) { // コンテナスロット
                if (!this.moveItemStackTo(itemstack1, 9, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, 9, false)) { // プレイヤーインベントリ
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }
}
