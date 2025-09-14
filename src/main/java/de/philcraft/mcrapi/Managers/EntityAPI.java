package de.philcraft.mcrapi.Managers;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class EntityAPI {

    public static void kill(Entity entity) {
        if (!(entity == null)) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.setHealth(0);
            } else {
                ErrorManager.giveError(181);
            }
        } else {
            ErrorManager.giveError(179);
        }
    }

}
