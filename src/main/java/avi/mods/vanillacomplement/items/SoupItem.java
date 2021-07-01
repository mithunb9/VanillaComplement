package avi.mods.vanillacomplement.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import avi.mods.vanillacomplement.util.FoodBuilder;

public class SoupItem extends Item {
    public SoupItem() {
        super(new Settings().group(ItemGroup.FOOD).food(FoodBuilder.build(2,3.0f).build()));
    }
}