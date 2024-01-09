package net.pretisy.dragoncraftzblackstar.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pretisy.dragoncraftzblackstar.DragonCraftZBlackStar;

public class ModBlocks {

    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block CHARTREUSE_BLOCK = registerBlock("chartreuse_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block RED_BLOCK = registerBlock("red_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block TEAL_BLOCK = registerBlock("teal_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block VERMILLION_BLOCK = registerBlock("vermillion_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block VIOLET_BLOCK = registerBlock("violet_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block WHITE_BLOCK = registerBlock("white_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DragonCraftZBlackStar.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(DragonCraftZBlackStar.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {

        DragonCraftZBlackStar.LOGGER.info("Registering ModBlocks for " + DragonCraftZBlackStar.MOD_ID);

    }
}
