
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zoompackers.advancedenderite.init;

import com.zoompackers.advancedenderite.AdvancedEnderite;
import com.zoompackers.advancedenderite.block.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;


public class AdvancedenderiteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(AdvancedEnderite.MOD_ID, Registries.BLOCK);
	public static final RegistrySupplier<Block> NETHERITE_ENDERITE_BLOCK = REGISTRY.register("netherite_enderite_block", () -> new NetheriteEnderiteBlockBlock());
	public static final RegistrySupplier<Block> IRON_ENDERITE_BLOCK = REGISTRY.register("iron_enderite_block", () -> new IronEnderiteBlockBlock());
	public static final RegistrySupplier<Block> GOLD_ENDERITE_BLOCK = REGISTRY.register("gold_enderite_block", () -> new GoldEnderiteBlockBlock());
	public static final RegistrySupplier<Block> EMERALD_ENDERITE_BLOCK = REGISTRY.register("emerald_enderite_block", () -> new EmeraldEnderiteBlockBlock());
	public static final RegistrySupplier<Block> DIAMOND_ENDERITE_BLOCK = REGISTRY.register("diamond_enderite_block", () -> new DiamondEnderiteBlockBlock());
	public static final RegistrySupplier<Block> AMETHYST_ENDERITE_BLOCK = REGISTRY.register("amethyst_enderite_block", () -> new AmethystEnderiteBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks

	public static void bootstrap() {
		REGISTRY.register();
	}
}
