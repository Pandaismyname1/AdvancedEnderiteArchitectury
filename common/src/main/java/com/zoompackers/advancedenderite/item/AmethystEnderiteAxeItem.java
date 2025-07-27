
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public class AmethystEnderiteAxeItem extends AxeItem {
	public AmethystEnderiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 8000;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 26;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.AMETHYST_ENDERITE_INGOT.get()));
			}
		}, 1, -2.6f, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
	}
}
