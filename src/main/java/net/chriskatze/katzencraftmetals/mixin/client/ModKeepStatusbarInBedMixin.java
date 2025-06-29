package net.chriskatze.katzencraftmetals.mixin.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud; // class_329
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class ModKeepStatusbarInBedMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(DrawContext drawContext, RenderTickCounter tickCounter, CallbackInfo ci) {
    }

}