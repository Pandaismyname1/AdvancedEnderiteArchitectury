package com.zoompackers.advancedenderite.item.v2;

import com.zoompackers.advancedenderite.AdvancedEnderite;
import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;
import com.zoompackers.advancedenderite.init.AdvancedenderiteModSounds;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> REGISTRY =
            DeferredRegister.create(AdvancedEnderite.MOD_ID, Registries.ARMOR_MATERIAL);
    public static RegistrySupplier<ArmorMaterial> AMETHYST_ENDERITE = CreateMaterial("amethyst_enderite",
            new int[]{10,13,15,10},
            6f,
            0.2f,
            26,
            () -> Ingredient.of(AdvancedenderiteModItems.AMETHYST_ENDERITE_INGOT.get()));
            
    public static RegistrySupplier<ArmorMaterial> DIAMOND_ENDERITE = CreateMaterial("diamond_enderite",
            new int[]{9,12,14,9},
            5.5f,
            0.18f,
            25,
            () -> Ingredient.of(AdvancedenderiteModItems.DIAMOND_ENDERITE_INGOT.get()));
            
    public static RegistrySupplier<ArmorMaterial> EMERALD_ENDERITE = CreateMaterial("emerald_enderite",
            new int[]{8,11,13,8},
            5f,
            0.16f,
            24,
            () -> Ingredient.of(AdvancedenderiteModItems.EMERALD_ENDERITE_INGOT.get()));
            
    public static RegistrySupplier<ArmorMaterial> GOLD_ENDERITE = CreateMaterial("gold_enderite",
            new int[]{7,10,12,7},
            4.5f,
            0.14f,
            23,
            () -> Ingredient.of(AdvancedenderiteModItems.GOLD_ENDERITE_INGOT.get()));
            
    public static RegistrySupplier<ArmorMaterial> IRON_ENDERITE = CreateMaterial("iron_enderite",
            new int[]{6,9,11,6},
            4f,
            0.12f,
            22,
            () -> Ingredient.of(AdvancedenderiteModItems.IRON_ENDERITE_INGOT.get()));
            
    public static RegistrySupplier<ArmorMaterial> NETHERITE_ENDERITE = CreateMaterial("netherite_enderite",
            new int[]{5,8,10,5},
            3.5f,
            0.1f,
            21,
            () -> Ingredient.of(AdvancedenderiteModItems.NETHERITE_ENDERITE_INGOT.get()));

    private static RegistrySupplier<ArmorMaterial> CreateMaterial(String name, int[] setDefense, float toughness, float knockbackResistance, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        var enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        enumMap.put(ArmorItem.Type.BOOTS, setDefense[0]);
        enumMap.put(ArmorItem.Type.LEGGINGS, setDefense[1]);
        enumMap.put(ArmorItem.Type.CHESTPLATE, setDefense[2]);
        enumMap.put(ArmorItem.Type.HELMET, setDefense[3]);
        enumMap.put(ArmorItem.Type.BODY, 0);
        return REGISTRY.register(name, () -> new ArmorMaterial(enumMap,
                enchantmentValue,
                AdvancedenderiteModSounds.ADVANCED_ENDEDIRE_SOUNDS,
                repairIngredient,
                List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedEnderite.MOD_ID, name))),
                toughness,
                knockbackResistance)
        );
    }

    public static void bootstrap() {
        REGISTRY.register();
    }
}