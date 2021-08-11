package avi.mods.vanillacomplement.items;

import avi.mods.vanillacomplement.common.ItemRegistry;
import avi.mods.vanillacomplement.mixin.AxeItemAccessor;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.Map;

import static avi.mods.vanillacomplement.util.Util.invertMap;

public class BarkItem extends Item {
    public BarkItem(Settings settings) {
        super(settings);
    }

    private static final Map<Block, Block> STRIPPED_BLOCKS = AxeItemAccessor.getStrippedBlocks();
    private static final Map<Block, Block> REVERSE_STRIPPED_BLOCKS = invertMap(STRIPPED_BLOCKS);

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Block block = world.getBlockState(blockPos).getBlock();
        PlayerEntity player = context.getPlayer();

        if (STRIPPED_BLOCKS.containsValue(block)) {
            world.setBlockState(blockPos, REVERSE_STRIPPED_BLOCKS.get(block).getDefaultState());
            world.playSound(player, blockPos, SoundEvents.BLOCK_WOOD_STEP, SoundCategory.BLOCKS, 1.0F, 1.0F);
           player.getInventory().removeStack(player.getInventory().getSlotWithStack(new ItemStack(ItemRegistry.BARK_ITEM)),1);
        }

        return super.useOnBlock(context);
    }
}
