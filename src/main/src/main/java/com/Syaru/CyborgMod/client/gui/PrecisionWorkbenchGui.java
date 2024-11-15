package com.Syaru.CyborgMod.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.Syaru.CyborgMod.block.menu.PrecisionWorkbenchMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;

public class PrecisionWorkbenchGui extends AbstractContainerScreen<PrecisionWorkbenchMenu> {
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("cyborgmod", "textures/gui/precision_workbench.png");

    public PrecisionWorkbenchGui(PrecisionWorkbenchMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        this.blit(this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderTooltip(mouseX, mouseY);
    }
}
