package com.Syaru.CyborgMod.regi;

import com.Syaru.CyborgMod.main.CyborgMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CyborgModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CyborgMod.MOD_ID);

    // モジュールベース
    public static final RegistryObject<Item> BASIC_MODULE_BASE =
            ITEMS.register("basic_module_base", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPENED_MODULE_BASE =
            ITEMS.register("deepened_module_base", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBTLE_MODULE_BASE =
            ITEMS.register("subtle_module_base", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZENITH_MODULE_BASE =
            ITEMS.register("zenith_module_base", () -> new Item(new Item.Properties()));

    // アイテム
    public static final RegistryObject<Item> ENERGY_CONDENSER =
            ITEMS.register("energy_condenser", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NANOFIBER =
            ITEMS.register("nanofiber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MICROPROCESSOR =
            ITEMS.register("microprocessor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPACT_RESISTANT_MATERIAL =
            ITEMS.register("impact_resistant_material", () -> new Item(new Item.Properties()));

    // ティア素材
    public static final RegistryObject<Item> BASIC_TIER_MATERIAL =
            ITEMS.register("basic_tier_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPENED_TIER_MATERIAL =
            ITEMS.register("deepened_tier_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBTLE_TIER_MATERIAL =
            ITEMS.register("subtle_tier_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZENITH_TIER_MATERIAL =
            ITEMS.register("zenith_tier_material", () -> new Item(new Item.Properties()));

    // エネルギーコア
    public static final RegistryObject<Item> BASIC_ENERGY_CORE =
            ITEMS.register("basic_energy_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPENED_ENERGY_CORE =
            ITEMS.register("deepened_energy_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBTLE_ENERGY_CORE =
            ITEMS.register("subtle_energy_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZENITH_ENERGY_CORE =
            ITEMS.register("zenith_energy_core", () -> new Item(new Item.Properties()));

    // 採掘強化モジュール
    public static final RegistryObject<Item> MINING_ENHANCEMENT_MODULE =
            ITEMS.register("mining_enhancement_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AREA_MINING_MODULE =
            ITEMS.register("area_mining_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXPLOSIVE_MINING_MODULE =
            ITEMS.register("explosive_mining_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRENGTH_ENHANCEMENT_MODULE =
            ITEMS.register("strength_enhancement_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_HAND_MODULE =
            ITEMS.register("magic_hand_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEG_STRENGTH_MODULE =
            ITEMS.register("leg_strength_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRECISION_WORK_MODULE =
            ITEMS.register("precision_work_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VISION_ENHANCEMENT_MODULE =
            ITEMS.register("vision_enhancement_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SENSE_ENHANCEMENT_MODULE =
            ITEMS.register("sense_enhancement_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AUTO_REPAIR_MODULE =
            ITEMS.register("auto_repair_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMOR_ENHANCEMENT_MODULE =
            ITEMS.register("armor_enhancement_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEFIBRILLATOR_MODULE =
            ITEMS.register("defibrillator_module", () -> new Item(new Item.Properties()));

    // その他のモジュール
    public static final RegistryObject<Item> ADRENALINE_BOOST_MODULE =
            ITEMS.register("adrenaline_boost_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENHANCED_REGENERATION_MODULE =
            ITEMS.register("enhanced_regeneration_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISON_RESISTANCE_MODULE =
            ITEMS.register("poison_resistance_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OXYGEN_CIRCULATION_MODULE =
            ITEMS.register("oxygen_circulation_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLD_HEAT_RESISTANCE_MODULE =
            ITEMS.register("cold_heat_resistance_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMMUNE_SYSTEM_MODULE =
            ITEMS.register("immune_system_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGENERATION_MODULE =
            ITEMS.register("regeneration_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAMELEON_MODULE =
            ITEMS.register("chameleon_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISON_LIQUID_MODULE =
            ITEMS.register("poison_liquid_module", () -> new Item(new Item.Properties()));

    // オーバークロック関連
    public static final RegistryObject<Item> OVERCLOCK_SYSTEM_CONTROL_MODULE =
            ITEMS.register("overclock_system_control_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OVERCLOCK_MODULE =
            ITEMS.register("overclock_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUBLE_JUMP_MODULE =
            ITEMS.register("double_jump_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WALL_JUMP_MODULE =
            ITEMS.register("wall_jump_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WALL_RUN_MODULE =
            ITEMS.register("wall_run_module", () -> new Item(new Item.Properties()));

    // ハイパードリル関連
    public static final RegistryObject<Item> HYPER_DRILL_MODULE =
            ITEMS.register("hyper_drill_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OMNI_PUNCH_MODULE =
            ITEMS.register("omni_punch_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEALTH_ASSASSIN_MODULE =
            ITEMS.register("stealth_assassin_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMBAT_MASTER_MODULE =
            ITEMS.register("combat_master_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGENERATORS_EX_MODULE =
            ITEMS.register("regenerators_ex_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGY_SINK_MODULE =
            ITEMS.register("energy_sink_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIELD_CONTROLLER_MODULE =
            ITEMS.register("field_controller_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ULTRA_VISION_MODULE =
            ITEMS.register("ultra_vision_module", () -> new Item(new Item.Properties()));

    // クールダウントリガー
    public static final RegistryObject<Item> BASIC_COOLDOWN_TRIGGER =
            ITEMS.register("basic_cooldown_trigger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPENED_COOLDOWN_TRIGGER =
            ITEMS.register("deepened_cooldown_trigger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBTLE_COOLDOWN_TRIGGER =
            ITEMS.register("subtle_cooldown_trigger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZENITH_COOLDOWN_TRIGGER =
            ITEMS.register("zenith_cooldown_trigger", () -> new Item(new Item.Properties()));

    // その他のアイテム
    public static final RegistryObject<Item> SELF_REPAIRING_COIL =
            ITEMS.register("self_repairing_coil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SIGNAL_AMP =
            ITEMS.register("signal_amp", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAPTIVE_NANOMATERIAL =
            ITEMS.register("adaptive_nanomaterial", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABILIZER_CHIP =
            ITEMS.register("stabilizer_chip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DATA_PROCESSOR =
            ITEMS.register("data_processor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NANORELAY =
            ITEMS.register("nanorelay", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIQUE_MODULE =
            ITEMS.register("antique_module", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
