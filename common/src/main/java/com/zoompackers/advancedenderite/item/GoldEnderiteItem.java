
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

public abstract class GoldEnderiteItem extends ArmorItem {
	public GoldEnderiteItem(Type type, Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 102;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{6, 9, 11, 6}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 23;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("advancedenderite:advanced_endedire_sounds"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.GOLD_ENDERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "gold_enderite";
			}

			@Override
			public float getToughness() {
				return 4.75f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.13f;
			}
		}, type, properties);
	}

	public static class Helmet extends GoldEnderiteItem {
		public Helmet() {
			super(Type.HELMET, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/gold_enderite_layer_1.png";
//		}
	}

	public static class Chestplate extends GoldEnderiteItem {
		public Chestplate() {
			super(Type.CHESTPLATE, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/gold_enderite_layer_1.png";
//		}
	}

	public static class Leggings extends GoldEnderiteItem {
		public Leggings() {
			super(Type.LEGGINGS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/gold_enderite_layer_2.png";
//		}
	}

	public static class Boots extends GoldEnderiteItem {
		public Boots() {
			super(Type.BOOTS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/gold_enderite_layer_1.png";
//		}
	}
}
