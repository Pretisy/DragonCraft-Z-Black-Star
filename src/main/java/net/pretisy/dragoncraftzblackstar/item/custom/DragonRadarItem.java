package net.pretisy.dragoncraftzblackstar.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class DragonRadarItem extends Item {

    public DragonRadarItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            List<BlockPos> valuableBlockPositions = new ArrayList<>();

            for (int x = -50; x <= 50; x++) {
                for (int y = -255; y <= 255; y++) {
                    for (int z = -50; z <= 50; z++) {
                        BlockPos blockPos = positionClicked.add(x, -y, z);
                        BlockState state = context.getWorld().getBlockState(blockPos);

                        if (isValuableBlock(state)) {
                            valuableBlockPositions.add(blockPos);
                        }
                    }
                }
            }

            if (!valuableBlockPositions.isEmpty()) {
                outputValuableCoordinates(valuableBlockPositions, player, context.getWorld().getBlockState(valuableBlockPositions.get(0)).getBlock());
            } else {
                player.sendMessage(Text.of("No Dragon Balls Found!"));
            }
        }

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(List<BlockPos> blockPositions, PlayerEntity player, Block block) {
        player.sendMessage(Text.of("Found " + block.asItem().getName().getString() + " at:"));

        for (BlockPos blockPos : blockPositions) {
            player.sendMessage(Text.of("(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"));
        }
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isOf(Blocks.DIAMOND_ORE) || state.isOf(Blocks.DIAMOND_BLOCK);
    }
}