package de.philcraft.mcrapi.Managers;

import org.bukkit.Bukkit;

public class ErrorManager {

    public static void giveError(Integer errorCode) {
        Bukkit.getLogger().warning("Error: " + errorCode);
    }

}
