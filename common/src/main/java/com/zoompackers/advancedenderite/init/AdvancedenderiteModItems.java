
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zoompackers.advancedenderite.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.zoompackers.advancedenderite.item.NetheriteEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderiteItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.NetheriteEnderiteAxeItem;
import com.zoompackers.advancedenderite.item.IronEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.IronEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.IronEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.IronEnderiteItem;
import com.zoompackers.advancedenderite.item.IronEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.IronEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.IronEnderiteAxeItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.GoldEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.GoldEnderiteAxeItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.EmeraldEnderiteAxeItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.DiamondEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.DiamondEnderiteAxeItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteSwordItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteShovelItem;
import com.zoompackers.advancedenderite.item.AmethystEnderitePickaxeItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteIngotItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteHoeItem;
import com.zoompackers.advancedenderite.item.AmethystEnderiteAxeItem;
import com.zoompackers.advancedenderite.AdvancedEnderite;

public class AdvancedenderiteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(AdvancedEnderite.MOD_ID, Registries.ITEM);
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_SWORD = REGISTRY.register("netherite_enderite_sword", () -> new NetheriteEnderiteSwordItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_AXE = REGISTRY.register("netherite_enderite_axe", () -> new NetheriteEnderiteAxeItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_PICKAXE = REGISTRY.register("netherite_enderite_pickaxe", () -> new NetheriteEnderitePickaxeItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_SHOVEL = REGISTRY.register("netherite_enderite_shovel", () -> new NetheriteEnderiteShovelItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_HOE = REGISTRY.register("netherite_enderite_hoe", () -> new NetheriteEnderiteHoeItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_INGOT = REGISTRY.register("netherite_enderite_ingot", () -> new NetheriteEnderiteIngotItem());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_HELMET = REGISTRY.register("netherite_enderite_helmet", () -> new NetheriteEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_CHESTPLATE = REGISTRY.register("netherite_enderite_chestplate", () -> new NetheriteEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_LEGGINGS = REGISTRY.register("netherite_enderite_leggings", () -> new NetheriteEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_BOOTS = REGISTRY.register("netherite_enderite_boots", () -> new NetheriteEnderiteItem.Boots());
	public static final RegistrySupplier<Item> IRON_ENDERITE_SWORD = REGISTRY.register("iron_enderite_sword", () -> new IronEnderiteSwordItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_AXE = REGISTRY.register("iron_enderite_axe", () -> new IronEnderiteAxeItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_PICKAXE = REGISTRY.register("iron_enderite_pickaxe", () -> new IronEnderitePickaxeItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_SHOVEL = REGISTRY.register("iron_enderite_shovel", () -> new IronEnderiteShovelItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_HOE = REGISTRY.register("iron_enderite_hoe", () -> new IronEnderiteHoeItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_INGOT = REGISTRY.register("iron_enderite_ingot", () -> new IronEnderiteIngotItem());
	public static final RegistrySupplier<Item> IRON_ENDERITE_HELMET = REGISTRY.register("iron_enderite_helmet", () -> new IronEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> IRON_ENDERITE_CHESTPLATE = REGISTRY.register("iron_enderite_chestplate", () -> new IronEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> IRON_ENDERITE_LEGGINGS = REGISTRY.register("iron_enderite_leggings", () -> new IronEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> IRON_ENDERITE_BOOTS = REGISTRY.register("iron_enderite_boots", () -> new IronEnderiteItem.Boots());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_SWORD = REGISTRY.register("gold_enderite_sword", () -> new GoldEnderiteSwordItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_AXE = REGISTRY.register("gold_enderite_axe", () -> new GoldEnderiteAxeItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_PICKAXE = REGISTRY.register("gold_enderite_pickaxe", () -> new GoldEnderitePickaxeItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_SHOVEL = REGISTRY.register("gold_enderite_shovel", () -> new GoldEnderiteShovelItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_HOE = REGISTRY.register("gold_enderite_hoe", () -> new GoldEnderiteHoeItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_INGOT = REGISTRY.register("gold_enderite_ingot", () -> new GoldEnderiteIngotItem());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_HELMET = REGISTRY.register("gold_enderite_helmet", () -> new GoldEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_CHESTPLATE = REGISTRY.register("gold_enderite_chestplate", () -> new GoldEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_LEGGINGS = REGISTRY.register("gold_enderite_leggings", () -> new GoldEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> GOLD_ENDERITE_BOOTS = REGISTRY.register("gold_enderite_boots", () -> new GoldEnderiteItem.Boots());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_SWORD = REGISTRY.register("emerald_enderite_sword", () -> new EmeraldEnderiteSwordItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_AXE = REGISTRY.register("emerald_enderite_axe", () -> new EmeraldEnderiteAxeItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_PICKAXE = REGISTRY.register("emerald_enderite_pickaxe", () -> new EmeraldEnderitePickaxeItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_SHOVEL = REGISTRY.register("emerald_enderite_shovel", () -> new EmeraldEnderiteShovelItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_HOE = REGISTRY.register("emerald_enderite_hoe", () -> new EmeraldEnderiteHoeItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_INGOT = REGISTRY.register("emerald_enderite_ingot", () -> new EmeraldEnderiteIngotItem());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_HELMET = REGISTRY.register("emerald_enderite_helmet", () -> new EmeraldEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_CHESTPLATE = REGISTRY.register("emerald_enderite_chestplate", () -> new EmeraldEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_LEGGINGS = REGISTRY.register("emerald_enderite_leggings", () -> new EmeraldEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_BOOTS = REGISTRY.register("emerald_enderite_boots", () -> new EmeraldEnderiteItem.Boots());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_SWORD = REGISTRY.register("diamond_enderite_sword", () -> new DiamondEnderiteSwordItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_AXE = REGISTRY.register("diamond_enderite_axe", () -> new DiamondEnderiteAxeItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_PICKAXE = REGISTRY.register("diamond_enderite_pickaxe", () -> new DiamondEnderitePickaxeItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_SHOVEL = REGISTRY.register("diamond_enderite_shovel", () -> new DiamondEnderiteShovelItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_HOE = REGISTRY.register("diamond_enderite_hoe", () -> new DiamondEnderiteHoeItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_INGOT = REGISTRY.register("diamond_enderite_ingot", () -> new DiamondEnderiteIngotItem());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_HELMET = REGISTRY.register("diamond_enderite_helmet", () -> new DiamondEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_CHESTPLATE = REGISTRY.register("diamond_enderite_chestplate", () -> new DiamondEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_LEGGINGS = REGISTRY.register("diamond_enderite_leggings", () -> new DiamondEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_BOOTS = REGISTRY.register("diamond_enderite_boots", () -> new DiamondEnderiteItem.Boots());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_SWORD = REGISTRY.register("amethyst_enderite_sword", () -> new AmethystEnderiteSwordItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_AXE = REGISTRY.register("amethyst_enderite_axe", () -> new AmethystEnderiteAxeItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_PICKAXE = REGISTRY.register("amethyst_enderite_pickaxe", () -> new AmethystEnderitePickaxeItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_SHOVEL = REGISTRY.register("amethyst_enderite_shovel", () -> new AmethystEnderiteShovelItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_HOE = REGISTRY.register("amethyst_enderite_hoe", () -> new AmethystEnderiteHoeItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_INGOT = REGISTRY.register("amethyst_enderite_ingot", () -> new AmethystEnderiteIngotItem());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_HELMET = REGISTRY.register("amethyst_enderite_helmet", () -> new AmethystEnderiteItem.Helmet());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_CHESTPLATE = REGISTRY.register("amethyst_enderite_chestplate", () -> new AmethystEnderiteItem.Chestplate());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_LEGGINGS = REGISTRY.register("amethyst_enderite_leggings", () -> new AmethystEnderiteItem.Leggings());
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_BOOTS = REGISTRY.register("amethyst_enderite_boots", () -> new AmethystEnderiteItem.Boots());
	public static final RegistrySupplier<Item> NETHERITE_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.NETHERITE_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> IRON_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.IRON_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> GOLD_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.GOLD_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> EMERALD_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.EMERALD_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> DIAMOND_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.DIAMOND_ENDERITE_BLOCK);
	public static final RegistrySupplier<Item> AMETHYST_ENDERITE_BLOCK = block(AdvancedenderiteModBlocks.AMETHYST_ENDERITE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistrySupplier<Item> block(RegistrySupplier<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE)));
	}


	public static void bootstrap() {
		REGISTRY.register();
	}
}
