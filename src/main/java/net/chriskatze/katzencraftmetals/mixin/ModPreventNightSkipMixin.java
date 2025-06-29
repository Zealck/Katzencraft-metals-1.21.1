package net.chriskatze.katzencraftmetals.mixin;

import net.minecraft.server.world.SleepManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.List;

@Mixin(SleepManager.class)
public class ModPreventNightSkipMixin {

    @Inject(method = "canResetTime", at = @At("HEAD"), cancellable = true)
    private void katzencraft$preventNightSkip(int percentage, List players, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false); // Prevent night from skipping by always returning false here
    }
}