package com.Syaru.CyborgMod.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class OpenPrecisionWorkbenchGuiPacket {
    public OpenPrecisionWorkbenchGuiPacket() {}

    public static void encode(OpenPrecisionWorkbenchGuiPacket msg, FriendlyByteBuf buf) {}

    public static OpenPrecisionWorkbenchGuiPacket decode(FriendlyByteBuf buf) {
        return new OpenPrecisionWorkbenchGuiPacket();
    }

    public static void handle(OpenPrecisionWorkbenchGuiPacket msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            // クライアントでGUIを開くコードをここに追加
            // Minecraft.getInstance().setScreen(new PrecisionWorkbenchGui(...));
        });
        ctx.get().setPacketHandled(true);
    }
}
