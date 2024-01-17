package net.pretisy.dragoncraftzblackstar.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent LESSER_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 2), 1.0F)
            .build();

    public static final FoodComponent GREATER_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 5), 1.0F)
            .build();

    public static final FoodComponent DARK_SENZU_BEAN = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 5), 1.0F)
            .build();
}