package com.kybit.minecraftkoth.utils;

import java.util.UUID;

import net.minecraft.server.MinecraftServer;
//import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.level.ServerPlayer;//was EntityPlayerMP
//import net.minecraft.profiler.Profiler;
import net.minecraft.util.profiling.ProfilerFiller;
//import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.server.ServerLifecycleHooks;

/**
 * Contains usefull methods relatives to the {@link MinecraftServer}.
 *
 * @author BrokenSwing
 *
 */
public class ServerUtils {

    private static MinecraftServer server;
    private static ProfilerFiller profiler;

    public static void init() {
        server = ServerLifecycleHooks.getCurrentServer();
        profiler = server.getProfiler();
    }

    /**
     * Returns the instance of the Minecraft server.
     *
     * @return the instance of the server
     */
    public static MinecraftServer getServer() {
        return server;
    }

    /**
     * Returns the player with the given {@link UUID}
     *
     * @param uuid
     *            The UUID
     * @return the player
     */
    public static ServerPlayer getPlayer(final UUID uuid) {

        return getServer().getPlayerList().getPlayer(uuid);
    }

    /**
     * Returns the profiler of the server.
     *
     * @return the profiler
     */
    public static ProfilerFiller getProfiler() {
        return profiler;
    }

}