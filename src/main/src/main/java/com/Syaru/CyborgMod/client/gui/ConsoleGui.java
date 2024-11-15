package com.Syaru.CyborgMod.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public class ConsoleGui extends Screen {

    // 背景画像のリソース
    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(CyborgMod.MODID, "textures/gui/console_gui.png");
    private final int imageWidth = 176;
    private final int imageHeight = 166;
    private final Player player;

    public ConsoleGui(Player player) {
        super(Component.literal("Console"));
        this.player = player;
    }

    @Override
    protected void init() {
        super.init();
        int centerX = (this.width - imageWidth) / 2;
        int centerY = (this.height - imageHeight) / 2;

        // ボタンの追加 (例)
        this.addRenderableWidget(new Button(centerX + 50, centerY + 70, 80, 20, Component.literal("Activate"), button -> {
            // ボタンをクリックしたときのアクション
            player.sendSystemMessage(Component.literal("Console activated!"));
        }));
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        RenderSystem.setShaderTexture(0, BACKGROUND_TEXTURE);
        int centerX = (this.width - imageWidth) / 2;
        int centerY = (this.height - imageHeight) / 2;
        blit(centerX, centerY, 0, 0, imageWidth, imageHeight);

        // GUI タイトルの表示
        Font font = Minecraft.getInstance().font;
        drawCenteredString(font, this.title.getString(), this.width / 2, centerY + 10, 0xFFFFFF);

        // その他の要素の描画
        super.render(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean isPauseScreen() {
        return false; // この GUI を開いたときにポーズをかけない
    }
}
