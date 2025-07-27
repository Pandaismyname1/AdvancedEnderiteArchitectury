
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public class GoldEnderiteSwordItem extends SwordItem {
	public GoldEnderiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5500;
			}

			public float getSpeed() {
				return 16.5f;
			}

			public float getAttackDamageBonus() {
				return 5.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.GOLD_ENDERITE_INGOT.get()));
			}
		}, 3, -2.25f, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
	}
}
