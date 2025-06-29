package net.chriskatze.katzencraftmetals.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerEntity.class)
public abstract class AllowDaySleepMixin {
    @Inject(method = "trySleep", at = @At("HEAD"), cancellable = true)
    private void allowSleepAnytime(BlockPos pos, CallbackInfoReturnable<ActionResult> cir) {
        cir.setReturnValue(ActionResult.SUCCESS);
    }
}
