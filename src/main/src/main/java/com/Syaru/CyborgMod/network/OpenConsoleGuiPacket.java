package com.Syaru.CyborgMod.network;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class OpenConsoleGuiPacket {
    public OpenConsoleGuiPacket() {
        // コンストラクタ
    }

    public static void encode(OpenConsoleGuiPacket msg, FriendlyByteBuf buf) {
        // 必要に応じてデータをエンコード
    }

    public static OpenConsoleGuiPacket decode(FriendlyByteBuf buf) {
        return new OpenConsoleGuiPacket();
    }

    public static void handle(OpenConsoleGuiPacket msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            // クライアント専用処理の実行
            DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> () -> {
                Minecraft.getInstance().setScreen(new ConsoleGui());
            });
        });
        ctx.get().setPacketHandled(true);
    }
}
