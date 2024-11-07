package com.Syaru.CyborgMod.regi.tab;

import com.Syaru.CyborgMod.main.CyborgMod;
import com.Syaru.CyborgMod.regi.CyborgModBlocks;
import com.Syaru.CyborgMod.regi.CyborgModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModTabs {

    // タブのDeferredRegister
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CyborgMod.MOD_ID);

    // MOD用クリエイティブタブ
    public static final RegistryObject<CreativeModeTab> CYBORG_MOD = TABS.register("cyborg_main",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CyborgModItems.BASIC_MODULE_BASE.get())) // アイコンをMODのアイテムに設定
                    .title(Component.translatable("itemGroup.cyborg_main")) // タブのタイトル
                    .displayItems((param, output) -> {
                        // CyborgModItemsのアイテムを追加
                        for (RegistryObject<Item> item : CyborgModItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                        // CyborgModBlocksのブロックアイテムを追加
                        for (RegistryObject<Item> blockItem : CyborgModBlocks.BLOCK_ITEMS.getEntries()) {
                            output.accept(blockItem.get());
                        }
                    })
                    .build()
    );
}
