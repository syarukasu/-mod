package com.Syaru.CyborgMod;

import com.Syaru.CyborgMod.block.menu.PrecisionWorkbenchMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "cyborgmod");

    public static final RegistryObject<MenuType<PrecisionWorkbenchMenu>> PRECISION_WORKBENCH = MENUS.register("precision_workbench",
            () -> IForgeMenuType.create((id, inventory, data) ->
                    new PrecisionWorkbenchMenu(id, inventory, null, null))
    );
}
