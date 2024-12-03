package com.Syaru.CyborgMod.MultiBolck;

import com.Syaru.CyborgMod.regi.CyborgModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class SurgeryRoomGenerator {

    // ティア1の定義
    private static final int TIER1_WIDTH = 3;
    private static final int TIER1_HEIGHT = 3;
    private static final BlockState TIER1_CASING = CyborgModBlocks.FOUNDATION_CASING.get().defaultBlockState();
    private static final BlockState GLASS_BLOCK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:glass")).defaultBlockState();

    // ティア2の定義
    private static final int TIER2_WIDTH = 5;
    private static final int TIER2_HEIGHT = 4;
    private static final BlockState TIER2_CASING = CyborgModBlocks.CULTIVATION_CASING.get().defaultBlockState();

    // ティア3の定義
    private static final int TIER3_WIDTH = 7;
    private static final int TIER3_HEIGHT = 5;
    private static final BlockState TIER3_CASING = CyborgModBlocks.MASTERY_CASING.get().defaultBlockState();

    // ティア4の定義
    private static final int TIER4_WIDTH = 9;
    private static final int TIER4_HEIGHT = 6;
    private static final BlockState TIER4_CASING = CyborgModBlocks.ZENITH_CASING.get().defaultBlockState();

    public static void generateTier1Room(ServerLevel level, BlockPos pos) {
        if (checkFacilityIntegrity(level, pos, TIER1_WIDTH, TIER1_HEIGHT, TIER1_CASING)) {
            createCasing(level, pos, TIER1_WIDTH, TIER1_HEIGHT, TIER1_CASING);
            placeTier1Blocks(level, pos);
            placeConsoleBlock(level, pos); // ConsoleBlock を配置
            openConsoleGui(level, pos); // GUIを開く
        }
    }

    public static void generateTier2Room(ServerLevel level, BlockPos pos) {
        if (checkFacilityIntegrity(level, pos, TIER2_WIDTH, TIER2_HEIGHT, TIER2_CASING)) {
            createCasing(level, pos, TIER2_WIDTH, TIER2_HEIGHT, TIER2_CASING);
            placeTier2Blocks(level, pos);
            placeConsoleBlock(level, pos); // ConsoleBlock を配置
            openConsoleGui(level, pos); // GUIを開く
        }
    }

    public static void generateTier3Room(ServerLevel level, BlockPos pos) {
        if (checkFacilityIntegrity(level, pos, TIER3_WIDTH, TIER3_HEIGHT, TIER3_CASING)) {
            createCasing(level, pos, TIER3_WIDTH, TIER3_HEIGHT, TIER3_CASING);
            placeTier3Blocks(level, pos);
            placeConsoleBlock(level, pos); // ConsoleBlock を配置
            openConsoleGui(level, pos); // GUIを開く
        }
    }

    public static void generateTier4Room(ServerLevel level, BlockPos pos) {
        if (checkFacilityIntegrity(level, pos, TIER4_WIDTH, TIER4_HEIGHT, TIER4_CASING)) {
            createCasing(level, pos, TIER4_WIDTH, TIER4_HEIGHT, TIER4_CASING);
            placeTier4Blocks(level, pos);
            placeConsoleBlock(level, pos); // ConsoleBlock を配置
            openConsoleGui(level, pos); // GUIを開く
        }
    }

    // 整合性チェックのメソッド
    private static boolean checkFacilityIntegrity(ServerLevel level, BlockPos pos, int width, int height, BlockState casingBlock) {
        boolean hasConsoleBlock = false;

        // 指定された位置に ConsoleBlock が存在するかチェック
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                for (int z = 0; z < width; z++) {
                    BlockPos currentPos = pos.offset(x, y, z);
                    BlockState state = level.getBlockState(currentPos);
                    // ConsoleBlock が存在するか確認
                    if (state.is(CyborgModBlocks.CONSOLE_BLOCK.get())) {
                        hasConsoleBlock = true;
                    }
                }
            }
        }

        // ConsoleBlock が存在しない場合は整合性チェック失敗
        if (!hasConsoleBlock) {
            return false;
        }

        // ケーシングブロックが存在するかチェック
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                for (int z = 0; z < width; z++) {
                    BlockPos currentPos = pos.offset(x, y, z);
                    BlockState state = level.getBlockState(currentPos);
                    if ((x == 0 || x == width - 1 || y == 0 || y == height - 1 || z == 0 || z == width - 1) && !state.is(casingBlock.getBlock())) {
                        return false; // 不整合があった場合
                    }
                }
            }
        }
        return true; // 整合性が確認できた場合
    }

    // 各ティアのブロック配置を行うメソッド
    private static void placeTier1Blocks(ServerLevel level, BlockPos pos) {
        level.setBlock(pos.offset(1, 0, 1), CyborgModBlocks.FOUNDATION_SURGICAL_TABLE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 0, 1), CyborgModBlocks.CONSOLE_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 0, 2), CyborgModBlocks.FOUNDATION_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 2, 1), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
    }

    private static void placeTier2Blocks(ServerLevel level, BlockPos pos) {
        level.setBlock(pos.offset(2, 0, 2), CyborgModBlocks.CULTIVATION_SURGICAL_TABLE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 0, 2), CyborgModBlocks.CONSOLE_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 0, 2), CyborgModBlocks.CULTIVATION_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 0, 3), CyborgModBlocks.CULTIVATION_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 3, 1), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 3, 1), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 0, 0), CyborgModBlocks.STERILIZATION_STATION.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(0, 0, 0), CyborgModBlocks.CLEAN_ROOM_GATE.get().defaultBlockState(), 3);
    }

    private static void placeTier3Blocks(ServerLevel level, BlockPos pos) {
        level.setBlock(pos.offset(3, 0, 3), CyborgModBlocks.MASTERY_SURGICAL_TABLE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 0, 3), CyborgModBlocks.CONSOLE_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 0, 3), CyborgModBlocks.MASTERY_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 0, 2), CyborgModBlocks.MASTERY_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 0, 4), CyborgModBlocks.MASTERY_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 4, 2), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 4, 4), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 4, 2), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 0, 0), CyborgModBlocks.CLEAN_ROOM_GATE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(2, 0, 1), CyborgModBlocks.STERILIZATION_STATION.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 0, 1), CyborgModBlocks.OXYGEN_SUPPLY_UNIT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(0, 0, 0), CyborgModBlocks.ENERGY_SUPPLY_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(5, 1, 5), CyborgModBlocks.AIR_CONDITIONING_SYSTEM.get().defaultBlockState(), 3);
    }

    private static void placeTier4Blocks(ServerLevel level, BlockPos pos) {
        level.setBlock(pos.offset(4, 0, 4), CyborgModBlocks.ZENITH_SURGICAL_TABLE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(5, 0, 4), CyborgModBlocks.CONSOLE_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 0, 4), CyborgModBlocks.ZENITH_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 0, 3), CyborgModBlocks.ZENITH_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 0, 5), CyborgModBlocks.ZENITH_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(5, 0, 5), CyborgModBlocks.ZENITH_MEDICAL_EQUIPMENT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 5, 3), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(3, 5, 5), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(5, 5, 3), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(5, 5, 5), CyborgModBlocks.LIGHT_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(0, 0, 0), CyborgModBlocks.CLEAN_ROOM_GATE.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 0, 0), CyborgModBlocks.STERILIZATION_STATION.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 0, 1), CyborgModBlocks.OXYGEN_SUPPLY_UNIT.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(1, 0, 0), CyborgModBlocks.ENERGY_SUPPLY_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(8, 0, 8), CyborgModBlocks.ENERGY_SUPPLY_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(4, 1, 1), CyborgModBlocks.AIR_CONDITIONING_SYSTEM.get().defaultBlockState(), 3);
        level.setBlock(pos.offset(7, 5, 7), CyborgModBlocks.AIR_CONDITIONING_SYSTEM.get().defaultBlockState(), 3);
    }

    // 外枠をケーシングブロックで囲む共通メソッド
    private static void createCasing(ServerLevel level, BlockPos pos, int width, int height, BlockState casingBlock) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                for (int z = 0; z < width; z++) {
                    if (x == 0 || x == width - 1 || y == 0 || y == height - 1 || z == 0 || z == width - 1) {
                        // ガラスブロックを使用
                        level.setBlock(pos.offset(x, y, z), GLASS_BLOCK, 3);
                    }
                }
            }
        }
    }

    // ConsoleBlock を配置するメソッド
    private static void placeConsoleBlock(ServerLevel level, BlockPos pos) {
        BlockPos consolePos = pos.offset(1, 1, 1); // ConsoleBlock の位置を決定
        level.setBlock(consolePos, CyborgModBlocks.CONSOLE_BLOCK.get().defaultBlockState(), 3);
    }

    // GUIを開くためのメソッド（未実装）
    private static void openConsoleGui(ServerLevel level, BlockPos pos) {
        // GUIを開くためのロジックを実装する必要があります
    }
}
