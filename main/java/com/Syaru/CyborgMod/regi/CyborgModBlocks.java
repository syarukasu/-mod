package com.Syaru.CyborgMod.regi;

import com.Syaru.CyborgMod.block.*;
import com.Syaru.CyborgMod.block.ConsoleBlock;
import com.Syaru.CyborgMod.main.CyborgMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class CyborgModBlocks {

    // ブロックとアイテムの遅延登録を定義
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CyborgMod.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CyborgMod.MOD_ID);

    // 各ブロックの登録
    public static final RegistryObject<Block> FOUNDATION_SURGICAL_TABLE = BLOCKS.
            register("foundation_surgical_table", FoundationSurgicalTable::new);
    // 基礎手術台
    public static final RegistryObject<Block> CULTIVATION_SURGICAL_TABLE = BLOCKS.
            register("cultivation_surgical_table", CultivationSurgicalTable::new);
    // 深化手術台
    public static final RegistryObject<Block> MASTERY_SURGICAL_TABLE = BLOCKS.
            register("mastery_surgical_table", MasterySurgicalTable::new);
    // 精妙手術台
    public static final RegistryObject<Block> ZENITH_SURGICAL_TABLE = BLOCKS.
            register("zenith_surgical_table", ZenithSurgicalTable::new);
    // 境地手術台

    public static final RegistryObject<Block> FOUNDATION_MEDICAL_EQUIPMENT = BLOCKS.
            register("foundation_medical_equipment", FoundationMedicalEquipment::new);
    // 基礎医療機器
    public static final RegistryObject<Block> CULTIVATION_MEDICAL_EQUIPMENT = BLOCKS.
            register("cultivation_medical_equipment", CultivationMedicalEquipment::new);
    // 深化医療機器
    public static final RegistryObject<Block> MASTERY_MEDICAL_EQUIPMENT = BLOCKS.
            register("mastery_medical_equipment", MasteryMedicalEquipment::new);
    // 精妙医療機器
    public static final RegistryObject<Block> ZENITH_MEDICAL_EQUIPMENT = BLOCKS.
            register("zenith_medical_equipment", ZenithMedicalEquipment::new);
    // 境地医療機器

    public static final RegistryObject<Block> FOUNDATION_CASING = BLOCKS.
            register("foundation_casing", FoundationCasing::new);
    // 基礎ケーシング
    public static final RegistryObject<Block> CULTIVATION_CASING = BLOCKS.
            register("cultivation_casing", CultivationCasing::new);
    // 深化ケーシング
    public static final RegistryObject<Block> MASTERY_CASING = BLOCKS.
            register("mastery_casing", MasteryCasing::new);
    // 精妙ケーシング
    public static final RegistryObject<Block> ZENITH_CASING = BLOCKS.
            register("zenith_casing", ZenithCasing::new);
    // 境地ケーシング

    public static final RegistryObject<Block> LIGHT_BLOCK = BLOCKS.
            register("light_block", LightBlock::new);
    // ライトブロック
    public static final RegistryObject<Block> CONSOLE_BLOCK = BLOCKS.
            register("console_block", ConsoleBlock::new);
    // コンソールブロック
    public static final RegistryObject<Block> ENERGY_SUPPLY_BLOCK = BLOCKS.
            register("energy_supply_block", EnergySupplyBlock::new);
    // エネルギー供給ブロック
    public static final RegistryObject<Block> OXYGEN_SUPPLY_UNIT = BLOCKS.
            register("oxygen_supply_unit", OxygenSupplyUnit::new);
    // 酸素供給装置
    public static final RegistryObject<Block> STERILIZATION_STATION = BLOCKS.
            register("sterilization_station", SterilizationStation::new);
    // 消毒ステーション
    public static final RegistryObject<Block> AIR_CONDITIONING_SYSTEM = BLOCKS.
            register("air_conditioning_system", AirConditioningSystem::new);
    // 空調システム
    public static final RegistryObject<Block> CLEAN_ROOM_GATE = BLOCKS.
            register("clean_room_gate", CleanRoomGate::new);
    // クリーンルームゲート
    public static final RegistryObject<Block> PRECISION_WORKBENCH = BLOCKS.
            register("precision_workbench", PrecisionWorkbench::new);
    //精密作業台
    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
        return BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // 各ブロックに対応するブロックアイテムを登録する
    private static void registerBlockItems() {
        // 手術台系のブロックアイテム登録
        registerBlockItem("foundation_surgical_table", FOUNDATION_SURGICAL_TABLE);
        // 基礎手術台
        registerBlockItem("cultivation_surgical_table", CULTIVATION_SURGICAL_TABLE);
        // 深化手術台
        registerBlockItem("mastery_surgical_table", MASTERY_SURGICAL_TABLE);
        // 精妙手術台
        registerBlockItem("zenith_surgical_table", ZENITH_SURGICAL_TABLE);
        // 境地手術台

// 医療機器系のブロックアイテム登録
        registerBlockItem("foundation_medical_equipment", FOUNDATION_MEDICAL_EQUIPMENT);
        // 基礎医療機器
        registerBlockItem("cultivation_medical_equipment", CULTIVATION_MEDICAL_EQUIPMENT);
        // 深化医療機器
        registerBlockItem("mastery_medical_equipment", MASTERY_MEDICAL_EQUIPMENT);
        // 精妙医療機器
        registerBlockItem("zenith_medical_equipment", ZENITH_MEDICAL_EQUIPMENT);
        // 境地医療機器

// ケーシング系のブロックアイテム登録
        registerBlockItem("foundation_casing", FOUNDATION_CASING);
        // 基礎ケーシング
        registerBlockItem("cultivation_casing", CULTIVATION_CASING);
        // 深化ケーシング
        registerBlockItem("mastery_casing", MASTERY_CASING);
        // 精妙ケーシング
        registerBlockItem("zenith_casing", ZENITH_CASING);
        // 境地ケーシング

// その他のブロックアイテム登録
        registerBlockItem("light_block", LIGHT_BLOCK);
        // ライトブロック
        registerBlockItem("console_block", CONSOLE_BLOCK);
        // コンソールブロック
        registerBlockItem("energy_supply_block", ENERGY_SUPPLY_BLOCK);
        // エネルギー供給ブロック
        registerBlockItem("oxygen_supply_unit", OXYGEN_SUPPLY_UNIT);
        // 酸素供給装置
        registerBlockItem("sterilization_station", STERILIZATION_STATION);
        // 消毒ステーション
        registerBlockItem("air_conditioning_system", AIR_CONDITIONING_SYSTEM);
        // 空調システム
        registerBlockItem("clean_room_gate", CLEAN_ROOM_GATE);
        // クリーンルームゲート
        registerBlockItem("precision_workbench", PRECISION_WORKBENCH);
        //精密作業台
    }

    // 登録メソッド
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        BLOCK_ITEMS.register(bus);
        registerBlockItems();
    }
}
