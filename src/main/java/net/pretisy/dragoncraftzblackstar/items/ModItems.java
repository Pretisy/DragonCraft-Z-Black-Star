package net.pretisy.dragoncraftzblackstar.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.pretisy.dragoncraftzblackstar.DragonCraftZBlackStar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MINOR_SENZU_BEAN = registerItem("minor_senzu_bean", new Item(new FabricItemSettings()));
    public static final Item GREATER_SENZU_BEAN = registerItem("greater_senzu_bean", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MINOR_SENZU_BEAN);
        entries.add(GREATER_SENZU_BEAN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DragonCraftZBlackStar.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DragonCraftZBlackStar.LOGGER.info("Registering Mod Items for " + DragonCraftZBlackStar.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
