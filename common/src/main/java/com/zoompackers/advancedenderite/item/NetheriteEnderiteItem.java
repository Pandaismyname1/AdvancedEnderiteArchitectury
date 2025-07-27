
package com.zoompackers.advancedenderite.item;


import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public abstract class NetheriteEnderiteItem extends ArmorItem {
	public NetheriteEnderiteItem(Type type, Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 72;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{5, 8, 10, 5}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("advancedenderite:advanced_endedire_sounds"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.NETHERITE_ENDERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "netherite_enderite";
			}

			@Override
			public float getToughness() {
				return 4.25f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.11f;
			}
		}, type, properties);
	}

	public static class Helmet extends NetheriteEnderiteItem {
		public Helmet() {
			super(Type.HELMET, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/netherite_enderite_layer_1.png";
//		}
	}

	public static class Chestplate extends NetheriteEnderiteItem {
		public Chestplate() {
			super(Type.CHESTPLATE, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/netherite_enderite_layer_1.png";
//		}
	}

	public static class Leggings extends NetheriteEnderiteItem {
		public Leggings() {
			super(Type.LEGGINGS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/netherite_enderite_layer_2.png";
//		}
	}

	public static class Boots extends NetheriteEnderiteItem {
		public Boots() {
			super(Type.BOOTS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/netherite_enderite_layer_1.png";
//		}
	}
}
