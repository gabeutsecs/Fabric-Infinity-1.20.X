package net.mark.infinitymod;

import net.fabricmc.api.ModInitializer;

import net.mark.infinitymod.block.ModBlocks;
import net.mark.infinitymod.item.ModItemGroups;
import net.mark.infinitymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityMod implements ModInitializer {
	public static final String MOD_ID = "infinitymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}