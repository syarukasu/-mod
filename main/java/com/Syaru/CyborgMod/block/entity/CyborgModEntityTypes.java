package com.Syaru.CyborgMod.block.entity;

import com.Syaru.CyborgMod.main.CyborgMod;
import com.Syaru.CyborgMod.regi.CyborgModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModEntityTypes {

    // BlockEntityTypeのDeferredRegister
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CyborgMod.MOD_ID);

    // Precision WorkbenchのBlockEntityType登録
    public static final RegistryObject<BlockEntityType<PrecisionWorkbenchEntity>> PRECISION_WORKBENCH =
            BLOCK_ENTITY_TYPES.register("precision_workbench",
                    () -> BlockEntityType.Builder.of(PrecisionWorkbenchEntity::new, CyborgModBlocks.PRECISION_WORKBENCH.get()).build(null));

    public static final RegistryObject<BlockEntityType<ConsoleBlockEntity>> CONSOLE_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("console_block_entity",
                    () -> BlockEntityType.Builder.of(ConsoleBlockEntity::new, CyborgModBlocks.CONSOLE_BLOCK.get()).build(null));

    // イベントバスに登録するメソッド
    public static void register(IEventBus bus) {
        BLOCK_ENTITY_TYPES.register(bus);
    }
}
