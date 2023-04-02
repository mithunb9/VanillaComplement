package avi.mods.vanillacomplement.common;

import avi.mods.vanillacomplement.VanillaComplementMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class BlockRegistry {
    public static final Block CHARCOAL_BLOCK = register("charcoal_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)));
    public static final Block BLAZE_BLOCK = register("blaze_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)));

        public static Block register(String name, Block block) {
            return Registry.register(Registries.BLOCK, new Identifier(VanillaComplementMod.MODID, name), block);
        }

        public static void registerBlockItem(String name, Block block, Item.Settings settings) {
            BlockItem blockItem = new BlockItem(block, settings);

            ItemGroupEvents.modifyEntriesEvent(VanillaComplementMod.VC_GROUP).register(content -> content.add(blockItem));
            Registry.register(Registries.ITEM, new Identifier(VanillaComplementMod.MODID, name), blockItem);
        }

        public static void registerBlockItem(String name, Block block, Item.Settings settings, int burnTime) {
            BlockItem blockItem = new BlockItem(block, settings);
            registerFuelBlock(blockItem, burnTime);

            ItemGroupEvents.modifyEntriesEvent(VanillaComplementMod.VC_GROUP).register(content -> content.add(blockItem));
            Registry.register(Registries.ITEM, new Identifier(VanillaComplementMod.MODID, name), blockItem);
        }

        private static void registerFuelBlock(BlockItem blockItem, int burnTime) {
            FuelRegistry.INSTANCE.add(blockItem, burnTime);
        }

        public static void init() {
            registerBlockItem("charcoal_block", CHARCOAL_BLOCK, new FabricItemSettings(), 16000);
            registerBlockItem("blaze_block", BLAZE_BLOCK, new FabricItemSettings(), 21600);
        }
}
