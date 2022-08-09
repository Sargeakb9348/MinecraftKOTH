package com.kybit.minecraftkoth.command.utils;

import java.util.Optional;
import java.util.UUID;
import com.kybit.minecraftkoth.utils.ServerUtils;
import com.mojang.authlib.GameProfile;

/**
 * Provides the capacity to switch between the name and the UUID of a player.
 *
 * @author BrokenSwing
 *
 */
public class UUIDHelper {

    /**
     * Retrieves the {@link UUID} of a player from hs name.
     *
     * @param playerName
     *            The name of the player
     * @return the UUID of the player
     */
    public static UUID getUUIDOf(final String playerName) {
        final Optional<GameProfile> profile = ServerUtils.getServer().getProfileCache().get(playerName);
        if (profile.isPresent()) {  //warning?
            return profile.get().getId();
        }else{
            return null;
        }
    }

    /**
     * Retrieves the name of a player from his {@link UUID}.
     *
     * @param uuid
     *            The UUID of the player
     * @return the name of the player
     */
    public static String getNameOf(final UUID uuid) {
        final Optional<GameProfile> profile = ServerUtils.getServer().getProfileCache().get(uuid);
        if (profile.isPresent()) { //warning?
            return profile.get().getName();
        }else{
            return null;
        }
    }

}