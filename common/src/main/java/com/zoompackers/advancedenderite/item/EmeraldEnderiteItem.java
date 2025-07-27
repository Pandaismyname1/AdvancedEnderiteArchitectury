
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

public abstract class EmeraldEnderiteItem extends ArmorItem {
	public EmeraldEnderiteItem(Type type, Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 114;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{8, 11, 13, 8}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 24;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("advancedenderite:advanced_endedire_sounds"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.EMERALD_ENDERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "emerald_enderite";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.15f;
			}
		}, type, properties);
	}

	public static class Helmet extends EmeraldEnderiteItem {
		public Helmet() {
			super(Type.HELMET, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/emerald_enderite_layer_1.png";
//		}
	}

	public static class Chestplate extends EmeraldEnderiteItem {
		public Chestplate() {
			super(Type.CHESTPLATE, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/emerald_enderite_layer_1.png";
//		}
	}

	public static class Leggings extends EmeraldEnderiteItem {
		public Leggings() {
			super(Type.LEGGINGS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/emerald_enderite_layer_2.png";
//		}
	}

	public static class Boots extends EmeraldEnderiteItem {
		public Boots() {
			super(Type.BOOTS, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
		}

//		@Override
//		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//			return "advancedenderite:textures/models/armor/emerald_enderite_layer_1.png";
//		}
	}
}
