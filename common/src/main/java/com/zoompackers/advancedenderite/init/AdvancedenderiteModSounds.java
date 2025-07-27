
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zoompackers.advancedenderite.init;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.zoompackers.advancedenderite.AdvancedEnderite;

public class AdvancedenderiteModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(AdvancedEnderite.MOD_ID, Registries.SOUND_EVENT);
	public static final RegistrySupplier<SoundEvent> ADVANCED_ENDEDIRE_SOUNDS = REGISTRY.register("advanced_endedire_sounds", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("advancedenderite", "advanced_endedire_sounds")));


	public static void bootstrap() {
		REGISTRY.register();
	}
}
