package avi.mods.vanillacomplement.common;

import avi.mods.vanillacomplement.VanillaComplementMod;
import avi.mods.vanillacomplement.items.BarkItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final Item COAL_NUGGET = register("coal_nugget", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item CHARCOAL_NUGGET = register("charcoal_nugget", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));

    public static final Item GLASS_SHARD = register("glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item TINTED_GLASS_SHARD = register("tinted_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item WHITE_GLASS_SHARD = register("white_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item ORANGE_GLASS_SHARD = register("orange_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item MAGENTA_GLASS_SHARD = register("magenta_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item LIGHT_BLUE_GLASS_SHARD = register("light_blue_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item YELLOW_GLASS_SHARD = register("yellow_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item LIME_GLASS_SHARD = register("lime_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item PINK_GLASS_SHARD = register("pink_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item GRAY_GLASS_SHARD = register("gray_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item LIGHT_GRAY_GLASS_SHARD = register("light_gray_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item CYAN_GLASS_SHARD = register("cyan_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item PURPLE_GLASS_SHARD = register("purple_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item BLUE_GLASS_SHARD = register("blue_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item BROWN_GLASS_SHARD = register("brown_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item GREEN_GLASS_SHARD = register("green_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item RED_GLASS_SHARD = register("red_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));
    public static final Item BLACK_GLASS_SHARD = register("black_glass_shard", new Item(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));

    public static final Item BARK_ITEM = register("bark", new BarkItem(new FabricItemSettings().group(VanillaComplementMod.VC_GROUP)));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaComplementMod.MODID, name), item);
    }

    private static void registerFuels() {
        FuelRegistry.INSTANCE.add(COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(CHARCOAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(BARK_ITEM, 200);
    }

    public static void init() {
        registerFuels();
    }
}
