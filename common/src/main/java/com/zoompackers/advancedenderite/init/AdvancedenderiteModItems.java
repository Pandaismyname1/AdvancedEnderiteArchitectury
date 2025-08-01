
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zoompackers.advancedenderite.init;

import com.zoompackers.advancedenderite.item.v2.ArmorMaterials;
import com.zoompackers.advancedenderite.item.v2.SetUtils;
import com.zoompackers.advancedenderite.item.v2.Tiers;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.zoompackers.advancedenderite.AdvancedEnderite;

import java.util.List;

public class AdvancedenderiteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(AdvancedEnderite.MOD_ID, Registries.ITEM);
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.NETHERITE_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> IRON_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.IRON_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> GOLD_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.GOLD_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.EMERALD_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.DIAMOND_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.AMETHYST_ENDERITE_BLOCK);

	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_INGOT = REGISTRY.register("netherite_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));
	public static final RegistrySupplier<Item> IRON_ENDERITE_INGOT = REGISTRY.register("iron_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));
	public static final RegistrySupplier<Item> GOLD_ENDERITE_INGOT = REGISTRY.register("gold_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_INGOT = REGISTRY.register("emerald_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_INGOT = REGISTRY.register("diamond_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_INGOT = REGISTRY.register("amethyst_enderite_ingot", () -> SetUtils.CreateIngot(Rarity.EPIC));

	public static final List<RegistrySupplier<Item>> AMETHYST_SET_ITEMS =
			SetUtils.CreateSet(REGISTRY, "amethyst_enderite", Tiers.AMETHYST_ENDERITE,
					ArmorMaterials.AMETHYST_ENDERITE,
					Rarity.EPIC,
					138);
	public static final List<RegistrySupplier<Item>> DIAMOND_SET_ITEMS =
			SetUtils.CreateSet(REGISTRY, "diamond_enderite", Tiers.DIAMOND_ENDERITE,
					ArmorMaterials.DIAMOND_ENDERITE,
					Rarity.EPIC,
					121);
	public static final List<RegistrySupplier<Item>> EMERALD_SET_ITEMS =
			SetUtils.CreateSet(REGISTRY, "emerald_enderite", Tiers.EMERALD_ENDERITE,
					ArmorMaterials.EMERALD_ENDERITE,
					Rarity.EPIC,
					104);
	public static final List<RegistrySupplier<Item>> GOLD_SET_ITEMS	=
			SetUtils.CreateSet(REGISTRY, "gold_enderite", Tiers.GOLD_ENDERITE,
					ArmorMaterials.GOLD_ENDERITE,
					Rarity.EPIC,
					95);
	public static final List<RegistrySupplier<Item>> IRON_SET_ITEMS =
			SetUtils.CreateSet(REGISTRY, "iron_enderite", Tiers.IRON_ENDERITE,
					ArmorMaterials.IRON_ENDERITE,
					Rarity.EPIC,
					86);
	public static final List<RegistrySupplier<Item>> NETHERITE_SET_ITEMS =
			SetUtils.CreateSet(REGISTRY, "netherite_enderite", Tiers.NETHERITE_ENDERITE,
					ArmorMaterials.NETHERITE_ENDERITE,
					Rarity.EPIC,
					78);

	private static RegistrySupplier<Item> block(RegistrySupplier<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE)));
	}


	public static void bootstrap() {
		REGISTRY.register();
	}
}
