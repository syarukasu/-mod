package com.Syaru.CyborgMod.block.entity;

import com.Syaru.CyborgMod.main.CyborgMod;
import com.Syaru.CyborgMod.regi.CyborgModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CyborgMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ConsoleBlockEntity>> CONSOLE_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("console_block",
                    () -> set(ConsoleBlockEntity::new, CyborgModBlocks.CONSOLE_BLOCK.get()));

    private static <T extends BlockEntity> BlockEntityType<T> set(
            BlockEntityType.BlockEntitySupplier<T> entity, Block block) {
        return BlockEntityType.Builder.of(entity, block).build(null);
    }
}
