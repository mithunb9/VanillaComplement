package avi.mods.vanillacomplement.mixin;

import avi.mods.vanillacomplement.common.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    @Final
    @Shadow
    protected static Map<Block, Block> STRIPPED_BLOCKS;

    @Inject(method = "useOnBlock", at = @At("HEAD"))
    public void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();

        if (STRIPPED_BLOCKS.containsKey(world.getBlockState(blockPos).getBlock())) {
            Block.dropStack(world, blockPos, new ItemStack(ItemRegistry.BARK_ITEM));
        }
    }
}
