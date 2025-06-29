package net.chriskatze.katzencraftmetals.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public abstract class ModHealWhileSleepingMixin {

    @Unique
    private int katzencraft$sleepTicks = 0;

    private static final int HEAL_INTERVAL_TICKS = 60; // every 3 seconds
    private static final float HEAL_AMOUNT = 2.0F;     // heal 1 heart

    @Inject(method = "tick", at = @At("HEAD"))
    private void healWhileSleeping(CallbackInfo info) {
        ServerPlayerEntity player = (ServerPlayerEntity) (Object) this;

        if (player.isSleeping()) {
            katzencraft$sleepTicks++;

            if (katzencraft$sleepTicks % HEAL_INTERVAL_TICKS == 0) {
                float health = player.getHealth();
                float maxHealth = player.getMaxHealth();

                if (health < maxHealth) {
                    float effectiveHeal = Math.min(HEAL_AMOUNT, maxHealth - health);
                    if (effectiveHeal > 0) {
                        player.heal(effectiveHeal);
                    }
                }
            }
        } else {
            katzencraft$sleepTicks = 0; // reset counter when not sleeping
        }
    }
}