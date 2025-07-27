
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public class DiamondEnderiteShovelItem extends ShovelItem {
	public DiamondEnderiteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 7000;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 8.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.DIAMOND_ENDERITE_INGOT.get()));
			}
		}, 1, -2.7f, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
	}
}
