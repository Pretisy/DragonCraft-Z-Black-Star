package net.pretisy.dragoncraftzblackstar.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pretisy.dragoncraftzblackstar.DragonCraftZBlackStar;
import net.pretisy.dragoncraftzblackstar.item.custom.DragonRadarItem;

public class ModItems {

    public static final Item LESSER_SENZU_BEAN = registerItem("lesser_senzu_bean", new Item(new FabricItemSettings().food(ModFoodComponents.LESSER_SENZU_BEAN)));
    public static final Item GREATER_SENZU_BEAN = registerItem("greater_senzu_bean", new Item(new FabricItemSettings().food(ModFoodComponents.GREATER_SENZU_BEAN)));
    public static final Item DARK_SENZU_BEAN = registerItem("dark_senzu_bean", new Item(new FabricItemSettings().food(ModFoodComponents.DARK_SENZU_BEAN)));

    public static final Item DRAGON_RADAR = registerItem("dragon_radar", new DragonRadarItem(new FabricItemSettings()));

    public static final Item ULTRA_DIVINE_WATER = registerItem("ultra_divine_water", new Item(new FabricItemSettings().food(ModFoodComponents.ULTRA_DIVINE_WATER)));

    public static final Item A_LA_PLANETAISE= registerItem("a_la_planetaise", new Item(new FabricItemSettings().food(ModFoodComponents.A_LA_PLANETAISE)));

    private static void addItemsToIngrediantsItemGroup(FabricItemGroupEntries entries) {
        entries.add(LESSER_SENZU_BEAN);
        entries.add(GREATER_SENZU_BEAN);
        entries.add(DARK_SENZU_BEAN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DragonCraftZBlackStar.MOD_ID, name), item);
    }

    public static void registerModItems(){

        DragonCraftZBlackStar.LOGGER.info("Registering Mod Items for "+DragonCraftZBlackStar.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(ModItems::addItemsToIngrediantsItemGroup);

    }
}
