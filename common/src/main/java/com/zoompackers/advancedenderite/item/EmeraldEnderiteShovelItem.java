
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public class EmeraldEnderiteShovelItem extends ShovelItem {
	public EmeraldEnderiteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 24;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.EMERALD_ENDERITE_INGOT.get()));
			}
		}, 1, -2.8f, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
	}
}
