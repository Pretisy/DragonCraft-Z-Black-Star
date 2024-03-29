package net.pretisy.dragoncraftzblackstar.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pretisy.dragoncraftzblackstar.DragonCraftZBlackStar;
import net.pretisy.dragoncraftzblackstar.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SENZU_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DragonCraftZBlackStar.MOD_ID, "dragoncraftzblackstartab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dragoncraftzblackstartab"))
                    .icon(() -> new ItemStack(ModItems.LESSER_SENZU_BEAN)).entries((displayContext, entries) -> {

                        ///Consumables

                        entries.add(ModItems.LESSER_SENZU_BEAN);
                        entries.add(ModItems.GREATER_SENZU_BEAN);
                        entries.add(ModItems.DARK_SENZU_BEAN);
                        entries.add(ModItems.ULTRA_DIVINE_WATER);
                        entries.add(ModItems.A_LA_PLANETAISE);
                        entries.add(ModItems.CANDY);
                        entries.add(ModItems.PUDDING);
                        entries.add(ModItems.CHOCOLATE);
                        entries.add(ModItems.ENSENJI);
                        entries.add(ModItems.PARADISE_HERB);
                        entries.add(ModItems.SLEEPY_GRASS);
                        entries.add(ModItems.FRUIT_OF_THE_TREE_OF_MIGHT);
                        entries.add(ModItems.DEMON_REALM_ENHANCED_FRUIT_OF_THE_TREE_OF_MIGHT);
                        entries.add(ModItems.PP_CANDY);

                        //Items

                        entries.add(ModItems.DRAGON_RADAR);

                        //Blocks

                        entries.add(ModBlocks.AMBER_BLOCK);
                        entries.add(ModBlocks.BLACK_BLOCK);
                        entries.add(ModBlocks.BLUE_BLOCK);
                        entries.add(ModBlocks.CHARTREUSE_BLOCK);
                        entries.add(ModBlocks.GREEN_BLOCK);
                        entries.add(ModBlocks.MAGENTA_BLOCK);
                        entries.add(ModBlocks.ORANGE_BLOCK);
                        entries.add(ModBlocks.PURPLE_BLOCK);
                        entries.add(ModBlocks.RED_BLOCK);
                        entries.add(ModBlocks.TEAL_BLOCK);
                        entries.add(ModBlocks.VERMILLION_BLOCK);
                        entries.add(ModBlocks.VIOLET_BLOCK);
                        entries.add(ModBlocks.WHITE_BLOCK);
                        entries.add(ModBlocks.YELLOW_BLOCK);

                        //Usable Blocks

                        entries.add(ModBlocks.DRAGON_SHRINE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        DragonCraftZBlackStar.LOGGER.info("Registering Item Groups for " + DragonCraftZBlackStar.MOD_ID);
    }
}