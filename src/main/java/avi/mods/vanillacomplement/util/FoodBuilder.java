package avi.mods.vanillacomplement.util;

import net.minecraft.item.FoodComponent;

public class FoodBuilder {
    public static FoodComponent.Builder build(int hunger, float saturation) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(saturation);
    }
}


