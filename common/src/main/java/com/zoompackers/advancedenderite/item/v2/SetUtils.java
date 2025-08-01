package com.zoompackers.advancedenderite.item.v2;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.*;

import java.util.ArrayList;
import java.util.List;

public class SetUtils {

    private static AxeItem CreateAxe(Tier tier, Rarity rarity) {
        return new AxeItem(tier, new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    private static HoeItem CreateHoe(Tier tier, Rarity rarity) {
        return new HoeItem(tier, new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    public static Item CreateIngot(Rarity rarity) {
        return new Item(new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    private static PickaxeItem CreatePickaxe(Tier tier, Rarity rarity) {
        return new PickaxeItem(tier, new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    private static ShovelItem CreateShovel(Tier tier, Rarity rarity) {
        return new ShovelItem(tier, new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    private static SwordItem CreateSword(Tier tier, Rarity rarity) {
        return new SwordItem(tier, new Item.Properties().arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    private static ArmorItem CreateArmorItem(ArmorItem.Type type, RegistrySupplier<ArmorMaterial> material, Rarity rarity, int durability) {
        return new ArmorItem(material, type, new Item.Properties().durability(durability).arch$tab(AdvancedenderiteModTabs.ADVANCED_ENDERITE).fireResistant().rarity(rarity));
    }

    public static List<RegistrySupplier<Item>> CreateSet(DeferredRegister<Item> registry, String prefix, Tier tier, RegistrySupplier<ArmorMaterial> material, Rarity rarity, int armorDurabilityMultiplier) {
        var result = new ArrayList<RegistrySupplier<Item>>();
        result.add(registry.register(prefix + "_axe", () -> CreateAxe(tier, rarity)));
        result.add(registry.register(prefix + "_hoe", () -> CreateHoe(tier, rarity)));
        result.add(registry.register(prefix + "_pickaxe", () -> CreatePickaxe(tier, rarity)));
        result.add(registry.register(prefix + "_sword", () -> CreateSword(tier, rarity)));
        result.add(registry.register(prefix + "_shovel", () -> CreateShovel(tier, rarity)));
        
        
        result.add(registry.register(prefix + "_boots", () -> CreateArmorItem(ArmorItem.Type.BOOTS, material, rarity, 13 *  armorDurabilityMultiplier)));
        result.add(registry.register(prefix + "_leggings", () -> CreateArmorItem(ArmorItem.Type.LEGGINGS, material, rarity, 15 * armorDurabilityMultiplier)));
        result.add(registry.register(prefix + "_chestplate", () -> CreateArmorItem(ArmorItem.Type.CHESTPLATE, material, rarity, 16 * armorDurabilityMultiplier)));
        result.add(registry.register(prefix + "_helmet", () -> CreateArmorItem(ArmorItem.Type.HELMET, material, rarity, 11 * armorDurabilityMultiplier)));

        return result;
    }
}
