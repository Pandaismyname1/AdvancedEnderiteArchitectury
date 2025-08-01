package com.zoompackers.advancedenderite.item.v2;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;


public class Tiers {
    public static Tier AMETHYST_ENDERITE = CreateTier(4,
        8000,
        19f,
        13f,
        26,
        Ingredient.of(AdvancedenderiteModItems.AMETHYST_ENDERITE_INGOT.get()));

    public static Tier DIAMOND_ENDERITE = CreateTier(4,
            7000,
            18f,
            12f,
            25,
            Ingredient.of(AdvancedenderiteModItems.DIAMOND_ENDERITE_INGOT.get()));

    public static Tier EMERALD_ENDERITE = CreateTier(4,
            6000,
            17f,
            11f,
            24,
            Ingredient.of(AdvancedenderiteModItems.EMERALD_ENDERITE_INGOT.get()));

    public static Tier GOLD_ENDERITE = CreateTier(4,
            5500,
            16.5f,
            10.5f,
            23,
            Ingredient.of(AdvancedenderiteModItems.GOLD_ENDERITE_INGOT.get()));

    public static Tier IRON_ENDERITE = CreateTier(4,
            5000,
            16f,
            10f,
            22,
            Ingredient.of(AdvancedenderiteModItems.IRON_ENDERITE_INGOT.get()));

    public static Tier NETHERITE_ENDERITE = CreateTier(4,
            4500,
            15.5f,
            9.5f,
            21,
            Ingredient.of(AdvancedenderiteModItems.NETHERITE_ENDERITE_INGOT.get()));

    private static Tier CreateTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Ingredient repairIngredient) {
        return new Tier() {
            @Override
            public int getUses() {
                return uses;
            }

            @Override
            public float getSpeed() {
                return speed;
            }

            @Override
            public float getAttackDamageBonus() {
                return attackDamageBonus;
            }

            @Override
            public TagKey<Block> getIncorrectBlocksForDrops() {
                return null;
            }

            @Override
            public int getEnchantmentValue() {
                return enchantmentValue;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return repairIngredient;
            }
        };
    }
}
