
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;

public class IronEnderiteHoeItem extends HoeItem {
	public IronEnderiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdvancedenderiteModItems.IRON_ENDERITE_INGOT.get()));
			}
		}, 0, 0.1f, new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant());
	}
}
