package avi.mods.vanillacomplement;

import avi.mods.vanillacomplement.common.BlockRegistry;
import avi.mods.vanillacomplement.common.GlassShardDrop;
import avi.mods.vanillacomplement.common.ItemRegistry;

import avi.mods.vanillacomplement.enchantments.LevitateEnchantment;
import avi.mods.vanillacomplement.enchantments.VenomousEnchantment;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import static net.devtech.arrp.json.blockstate.JState.state;
import static net.devtech.arrp.json.blockstate.JState.variant;
import static net.devtech.arrp.json.models.JModel.model;
import static net.devtech.arrp.json.models.JModel.textures;

import net.devtech.arrp.json.blockstate.JState;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class VanillaComplementMod implements ModInitializer {
	public static final String MODID = "vanillacomplement";

	public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create(MODID+":main");

	public static final Enchantment LEVITATE = Registry.register(Registry.ENCHANTMENT, new Identifier(MODID, "levitate"), new LevitateEnchantment());
	public static final Enchantment VENOMOUS = Registry.register(Registry.ENCHANTMENT, new Identifier(MODID, "venomous"), new VenomousEnchantment());

	public static ArrayList<BlockState> canBePlacedOn = new ArrayList<BlockState>();

	public static void main(String[] args) {
		canBePlacedOn.add(Blocks.STONE.getDefaultState());
		canBePlacedOn.add(Blocks.DEEPSLATE.getDefaultState());
	}

	public static final ItemGroup VC_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "main"),
			() -> new ItemStack(ItemRegistry.BARK_ITEM)
	);

	public static Identifier prefixPath(Identifier identifier, String prefix) {
		return new Identifier(identifier.getNamespace(), prefix + '/' + identifier.getPath());
	}

	@Override
	public void onInitialize() {
		ItemRegistry.init();
		BlockRegistry.init();

		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.MONSTER_BOX_BLOCK, RenderLayer.getCutout());

		GlassShardDrop.init();
		RESOURCE_PACK.addBlockState(state(variant(JState.model(prefixPath(new Identifier(MODID, "charcoal_block"), "block").toString()))), new Identifier(MODID, "charcoal_block"));
		Identifier prefix = prefixPath(new Identifier(MODID, "charcoal_block"), "block");
		RESOURCE_PACK.addModel(model("block/cube_all").textures(textures().var("all", prefix.toString())), prefix);

	    RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));

		System.out.println("Vanilla Complement Initialized");
	}
}
