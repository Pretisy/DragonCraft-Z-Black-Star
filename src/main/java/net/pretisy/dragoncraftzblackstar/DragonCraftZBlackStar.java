package net.pretisy.dragoncraftzblackstar;

import net.fabricmc.api.ModInitializer;

import net.pretisy.dragoncraftzblackstar.block.ModBlocks;
import net.pretisy.dragoncraftzblackstar.item.ModItemGroups;
import net.pretisy.dragoncraftzblackstar.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonCraftZBlackStar implements ModInitializer {
	public static final String MOD_ID = "dragoncraftzblackstar";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}