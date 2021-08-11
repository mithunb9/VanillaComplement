package avi.mods.vanillacomplement.common;

import avi.mods.vanillacomplement.VanillaComplementMod;
import avi.mods.vanillacomplement.blocks.MonsterBoxBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block CHARCOAL_BLOCK = register("charcoal_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)));
    public static final Block BLAZE_BLOCK = register("blaze_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)));
    public static final Block MONSTER_BOX_BLOCK = register("monster_box_block", new MonsterBoxBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));

        public static Block register(String name, Block block) {
            return Registry.register(Registry.BLOCK, new Identifier(VanillaComplementMod.MODID, name), block);
        }

        public static void registerBlockItem(String name, Block block, Item.Settings settings) {
            Registry.register(Registry.ITEM, new Identifier(VanillaComplementMod.MODID, name), new BlockItem(block, settings.group(VanillaComplementMod.VC_GROUP)));
        }

        public static void init() {
            registerBlockItem("charcoal_block", CHARCOAL_BLOCK, new FabricItemSettings());
            registerBlockItem("blaze_block", BLAZE_BLOCK, new FabricItemSettings());
            registerBlockItem("monster_box_block", MONSTER_BOX_BLOCK, new FabricItemSettings());
        }
}
