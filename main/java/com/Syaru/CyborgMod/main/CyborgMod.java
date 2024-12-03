package com.Syaru.CyborgMod.main;

import com.Syaru.CyborgMod.CyborgModMenus;
import com.Syaru.CyborgMod.block.entity.CyborgModEntityTypes;
import com.Syaru.CyborgMod.regi.CyborgModItems;
import com.Syaru.CyborgMod.regi.tab.CyborgModTabs;
import com.Syaru.CyborgMod.regi.CyborgModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cyborgmod")
public class CyborgMod {

    public static final String MOD_ID = "cyborgmod";

    public CyborgMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // アイテム、ブロック、タブの登録
        CyborgModBlocks.register(bus);
        CyborgModEntityTypes.BLOCK_ENTITY_TYPES.register(bus);
        CyborgModItems.ITEMS.register(bus);
        CyborgModTabs.TABS.register(bus);
        CyborgModMenus.MENUS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLClientSetupEvent event) {
        // クライアントサイドのセットアップ
    }
}
