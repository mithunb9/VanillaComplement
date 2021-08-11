package avi.mods.vanillacomplement.common;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtList;

import static avi.mods.vanillacomplement.util.Util.randomInRange;

public class GlassShardDrop {

    public static void init() {
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, entity) -> {
            NbtList mainHandStackEnchantments = player.getMainHandStack().getEnchantments();

            if (!player.isCreative() && !hasSilkTouch(mainHandStackEnchantments)) {
                Block brokenBlock = state.getBlock();

                if (brokenBlock.equals(Blocks.GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GLASS_SHARD,randomInRange(1,3)));
                }

                if (brokenBlock.equals(Blocks.TINTED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.TINTED_GLASS_SHARD, randomInRange(3,8)));
                }

                if (brokenBlock.equals(Blocks.BLACK_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BLACK_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.WHITE_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.WHITE_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.ORANGE_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.ORANGE_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.MAGENTA_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.MAGENTA_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.PURPLE_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.PURPLE_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.LIGHT_BLUE_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIGHT_BLUE_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.BLUE_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BLUE_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.YELLOW_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.YELLOW_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.RED_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.RED_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.GRAY_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GRAY_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.LIGHT_GRAY_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIGHT_GRAY_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.GREEN_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GREEN_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.LIME_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIME_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.CYAN_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.CYAN_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.PINK_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.PINK_GLASS_SHARD,randomInRange(3,8)));
                }
                if (brokenBlock.equals(Blocks.BROWN_STAINED_GLASS)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BROWN_GLASS_SHARD,randomInRange(3,8)));
                }

                if (brokenBlock.equals(Blocks.BLACK_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BLACK_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.WHITE_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.WHITE_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.ORANGE_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.ORANGE_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.MAGENTA_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.MAGENTA_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.PURPLE_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.PURPLE_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIGHT_BLUE_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.BLUE_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BLUE_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.YELLOW_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.YELLOW_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.RED_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.RED_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.GRAY_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GRAY_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIGHT_GRAY_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.GREEN_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.GREEN_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.LIME_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.LIME_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.CYAN_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.CYAN_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.PINK_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.PINK_GLASS_SHARD,randomInRange(1,3)));
                }
                if (brokenBlock.equals(Blocks.BROWN_STAINED_GLASS_PANE)) {
                    Block.dropStack(world, pos, new ItemStack(ItemRegistry.BROWN_GLASS_SHARD,randomInRange(1,3)));
                }
            }
        });
    }

    public static Boolean hasSilkTouch(NbtList list) {
        boolean hasSilkTouch = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.getString(i).equals("{id:\"minecraft:silk_touch\",lvl:1s}")) {
                hasSilkTouch = true;
            }
        }

        return hasSilkTouch;
    }

}
