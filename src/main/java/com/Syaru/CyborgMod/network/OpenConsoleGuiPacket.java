package com.Syaru.CyborgMod.network;

import net.minecraft.network.FriendlyByteBuf;
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
            // クライアント側でGUIを開く処理
            // Minecraft.getInstance().setScreen(new ConsoleGui());
        });
        ctx.get().setPacketHandled(true);
    }
}
