package com.Syaru.CyborgMod.regi;

import com.Syaru.CyborgMod.main.CyborgMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModBlocks {

    // ブロックの登録
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CyborgMod.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CyborgMod.MOD_ID);

    // ブロックのプロパティを定義するメソッド
    private static BlockBehaviour.Properties createBlockProperties(float strength) {
        return BlockBehaviour.Properties.of().strength(strength).requiresCorrectToolForDrops();
    }

    // ブロックの登録
    public static final RegistryObject<Block> FOUNDATION_SURGICAL_TABLE = registerBlock("foundation_surgical_table", 5.0f);
    public static final RegistryObject<Block> CULTIVATION_SURGICAL_TABLE = registerBlock("cultivation_surgical_table", 5.0f);
    public static final RegistryObject<Block> MASTERY_SURGICAL_TABLE = registerBlock("mastery_surgical_table", 5.0f);
    public static final RegistryObject<Block> ZENITH_SURGICAL_TABLE = registerBlock("zenith_surgical_table", 5.0f);

    public static final RegistryObject<Block> FOUNDATION_MEDICAL_EQUIPMENT = registerBlock("foundation_medical_equipment", 5.0f);
    public static final RegistryObject<Block> CULTIVATION_MEDICAL_EQUIPMENT = registerBlock("cultivation_medical_equipment", 5.0f);
    public static final RegistryObject<Block> MASTERY_MEDICAL_EQUIPMENT = registerBlock("mastery_medical_equipment", 5.0f);
    public static final RegistryObject<Block> ZENITH_MEDICAL_EQUIPMENT = registerBlock("zenith_medical_equipment", 5.0f);

    public static final RegistryObject<Block> FOUNDATION_CASING = registerBlock("foundation_casing", 5.0f);
    public static final RegistryObject<Block> CULTIVATION_CASING = registerBlock("cultivation_casing", 5.0f);
    public static final RegistryObject<Block> MASTERY_CASING = registerBlock("mastery_casing", 5.0f);
    public static final RegistryObject<Block> ZENITH_CASING = registerBlock("zenith_casing", 5.0f);

    public static final RegistryObject<Block> LIGHT_BLOCK = registerLightBlock("light_block", 1.5f);
    public static final RegistryObject<Block> CONSOLE_BLOCK = registerBlock("console_block", 3.5f);
    public static final RegistryObject<Block> ENERGY_SUPPLY_BLOCK = registerBlock("energy_supply_block", 5.0f);
    public static final RegistryObject<Block> OXYGEN_SUPPLY_DEVICE = registerBlock("oxygen_supply_device", 5.0f);
    public static final RegistryObject<Block> DISINFECTION_STATION = registerBlock("disinfection_station", 5.0f);
    public static final RegistryObject<Block> MONITORING_CAMERA_BLOCK = registerBlock("monitoring_camera_block", 3.0f);
    public static final RegistryObject<Block> AIR_CONDITIONING_SYSTEM = registerBlock("air_conditioning_system", 5.0f);
    public static final RegistryObject<Block> CLEAN_ROOM_GATE = registerBlock("clean_room_gate", 5.0f);

    // ブロックを登録する共通メソッド
    private static RegistryObject<Block> registerBlock(String name, float strength) {
        return BLOCKS.register(name, () -> new Block(createBlockProperties(strength)));
    }

    // 光ブロックの登録
    private static RegistryObject<Block> registerLightBlock(String name, float strength) {
        return BLOCKS.register(name, () -> new Block(createBlockProperties(strength).lightLevel(state -> 15)));
    }

    // アイテムとしてブロックを登録するメソッド
    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
        return BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // イベントバスにブロックを登録
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        BLOCK_ITEMS.register(bus);
        registerBlockItems();

    }

    // 各ブロックをアイテムとして登録するメソッド
    private static void registerBlockItems() {
        registerBlockItem("foundation_surgical_table", FOUNDATION_SURGICAL_TABLE);
        registerBlockItem("cultivation_surgical_table", CULTIVATION_SURGICAL_TABLE);
        registerBlockItem("mastery_surgical_table", MASTERY_SURGICAL_TABLE);
        registerBlockItem("zenith_surgical_table", ZENITH_SURGICAL_TABLE);
        registerBlockItem("foundation_medical_equipment", FOUNDATION_MEDICAL_EQUIPMENT);
        registerBlockItem("cultivation_medical_equipment", CULTIVATION_MEDICAL_EQUIPMENT);
        registerBlockItem("mastery_medical_equipment", MASTERY_MEDICAL_EQUIPMENT);
        registerBlockItem("zenith_medical_equipment", ZENITH_MEDICAL_EQUIPMENT);
        registerBlockItem("foundation_casing", FOUNDATION_CASING);
        registerBlockItem("cultivation_casing", CULTIVATION_CASING);
        registerBlockItem("mastery_casing", MASTERY_CASING);
        registerBlockItem("zenith_casing", ZENITH_CASING);
        registerBlockItem("light_block", LIGHT_BLOCK);
        registerBlockItem("console_block", CONSOLE_BLOCK);
        registerBlockItem("energy_supply_block", ENERGY_SUPPLY_BLOCK);
        registerBlockItem("oxygen_supply_device", OXYGEN_SUPPLY_DEVICE);
        registerBlockItem("disinfection_station", DISINFECTION_STATION);
        registerBlockItem("monitoring_camera_block", MONITORING_CAMERA_BLOCK);
        registerBlockItem("air_conditioning_system", AIR_CONDITIONING_SYSTEM);
        registerBlockItem("clean_room_gate", CLEAN_ROOM_GATE);
    }
}
