package avi.mods.vanillacomplement;

import avi.mods.vanillacomplement.common.BlockRegistry;
import avi.mods.vanillacomplement.common.GlassShardDrop;
import avi.mods.vanillacomplement.common.ItemRegistry;

import avi.mods.vanillacomplement.enchantments.LevitateEnchantment;
import avi.mods.vanillacomplement.enchantments.VenomousEnchantment;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import java.util.ArrayList;

public class VanillaComplementMod implements ModInitializer {
	public static final String MODID = "vanillacomplement";

	public static final Enchantment LEVITATE = Registry.register(Registries.ENCHANTMENT, new Identifier(MODID, "levitate"), new LevitateEnchantment());
	public static final Enchantment VENOMOUS = Registry.register(Registries.ENCHANTMENT, new Identifier(MODID, "venomous"), new VenomousEnchantment());

	public static ArrayList<BlockState> canBePlacedOn = new ArrayList<BlockState>();

	public static void main(String[] args) {
		canBePlacedOn.add(Blocks.STONE.getDefaultState());
		canBePlacedOn.add(Blocks.DEEPSLATE.getDefaultState());
	}

	public static final ItemGroup VC_GROUP = FabricItemGroup.builder(new Identifier(MODID, "main"))
			.icon(() -> new ItemStack(ItemRegistry.BARK_ITEM))
			.build();

	public static Identifier prefixPath(Identifier identifier, String prefix) {
		return new Identifier(identifier.getNamespace(), prefix + '/' + identifier.getPath());
	}

	@Override
	public void onInitialize() {
		ItemRegistry.init();
		BlockRegistry.init();

		GlassShardDrop.init();

		System.out.println("Vanilla Complement Initialized");
	}
}
