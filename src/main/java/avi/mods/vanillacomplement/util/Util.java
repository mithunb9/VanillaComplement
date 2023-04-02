package avi.mods.vanillacomplement.util;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class Util {
    private static final EntityType[] MOB_LIST = {EntityType.ZOMBIE, EntityType.SKELETON, EntityType.WITCH};

    // Random Number Generation
    public static int randomInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Reverse Map into Hash Map
    public static <A, B> Map<B, A> invertMap(Map<A, B> map) {
        HashMap<B, A> reverseMap = new HashMap<>();
        for (Map.Entry<A, B> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        return reverseMap;
    }

    public static void spawnLootItems(World world, BlockPos pos, Item[] items, Item[] rareItems, int rareChance) {
        Block.dropStack(world, pos, new ItemStack(items[randomInRange(0,items.length)],randomInRange(1,9)));

        if (randomInRange(1,4)<=rareChance) {
            Block.dropStack(world, pos, new ItemStack(rareItems[randomInRange(0,rareItems.length)],randomInRange(1,2)));
        }
    }
}
