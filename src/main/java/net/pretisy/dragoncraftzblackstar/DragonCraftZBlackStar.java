package net.pretisy.dragoncraftzblackstar;

import net.fabricmc.api.ModInitializer;

import net.pretisy.dragoncraftzblackstar.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonCraftZBlackStar implements ModInitializer {
	public static String MOD_ID = "dragoncraftzblackstar";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}