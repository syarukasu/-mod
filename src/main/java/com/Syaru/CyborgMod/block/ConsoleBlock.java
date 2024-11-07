package com.Syaru.CyborgMod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.BlockHitResult;

public class ConsoleBlock extends Block {

    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");

    public ConsoleBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(ACTIVE, false));
    }

 //   @Override
    public void onPlace(BlockState state, ServerLevel level, BlockPos pos, BlockState oldState, boolean isMoving) {
        // 初期化や整合性チェックを行う
        checkFacilityIntegrity(level, pos);
    }

 //   @Override
    public boolean use(BlockState state, ServerLevel level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            // GUIを開く
            openGui(player, pos);
        }
        return true;
    }

    private void openGui(Player player, BlockPos pos) {
        // GUIを開く処理を実装
        // 例: player.openMenu(new SimpleMenuProvider(...));
    }

    private void checkFacilityIntegrity(ServerLevel level, BlockPos pos) {
        // 整合性チェックのロジックを実装
        boolean isValid = true;

        // チェックロジックの例
        // if (...) { isValid = false; }

        if (!isValid) {
            // 不整合があった場合の処理
            // 例: player.sendMessage(new TextComponent("不整合があります！"), player.getUUID());
        }
    }
}
