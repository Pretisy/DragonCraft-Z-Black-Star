package net.pretisy.dragoncraftzblackstar.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent LESSER_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent GREATER_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(20)
            .saturationModifier(20)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 10), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20, 2), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent DARK_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 5), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent ULTRA_DIVINE_WATER = new FoodComponent.Builder()
            .hunger(-10)
            .saturationModifier(-10)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 10), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent A_LA_PLANETAISE = new FoodComponent.Builder()
            .hunger(12)
            .saturationModifier(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 400, 5), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent CANDY = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent PUDDING = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(8)
            .snack()
            .build();

    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(3)
            .snack()
            .build();

    public static final FoodComponent ENSENJI = new FoodComponent.Builder()
            .hunger(20)
            .saturationModifier(20)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 10), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent PARADISE_HERB = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 10), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent SLEEPY_GRASS = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 1000, 10, false, true), 1.0F)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent FRUIT_OF_THE_TREE_OF_MIGHT = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 3), 1.0f)
            .alwaysEdible()
            .build();
}