package avi.mods.vanillacomplement.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static avi.mods.vanillacomplement.util.Util.spawnLootItems;
import static avi.mods.vanillacomplement.util.Util.spawnMobSwarm;

public class MonsterBoxBlock extends Block {
    private Item[] lootItems = {Items.IRON_INGOT, Items.REDSTONE};
    private Item[] rareItems = {Items.DIAMOND, Items.EMERALD};

    public MonsterBoxBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        int difficultyId = world.getDifficulty().getId();

        if (!player.isCreative()) {
            spawnMobSwarm(world, player, pos, difficultyId);

            if (difficultyId >= 1) {
                spawnLootItems(world, pos, lootItems, rareItems, difficultyId-1);
            }

        }
        super.onBreak(world, pos, state, player);
    }
}
