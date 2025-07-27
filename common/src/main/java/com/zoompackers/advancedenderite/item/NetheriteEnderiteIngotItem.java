
package com.zoompackers.advancedenderite.item;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteEnderiteIngotItem extends Item {
	public NetheriteEnderiteIngotItem() {
		super(new Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
