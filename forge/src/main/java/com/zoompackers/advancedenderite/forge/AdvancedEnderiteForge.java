package com.zoompackers.advancedenderite.forge;

import com.zoompackers.advancedenderite.AdvancedEnderite;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(AdvancedEnderite.MOD_ID)
public final class AdvancedEnderiteForge {
    public AdvancedEnderiteForge(IEventBus eventBus, ModContainer modContainer) {
        AdvancedEnderite.init();
    }
}
