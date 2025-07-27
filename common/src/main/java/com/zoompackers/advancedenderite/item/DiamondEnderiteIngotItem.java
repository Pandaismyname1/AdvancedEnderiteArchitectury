
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondEnderiteIngotItem extends Item {
	public DiamondEnderiteIngotItem() {
		super(new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
