package com.zoompackers.advancedenderitearchitectury.forge;

import com.zoompackers.advancedenderitearchitectury.AdvancedEnderite;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdvancedEnderite.MOD_ID)
public final class AdvancedEnderiteForge {
    public AdvancedEnderiteForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(AdvancedEnderite.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        AdvancedEnderite.init();
    }
}
