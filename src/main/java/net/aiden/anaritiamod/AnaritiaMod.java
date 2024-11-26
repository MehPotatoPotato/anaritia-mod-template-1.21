package net.aiden.anaritiamod;

import net.aiden.anaritiamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnaritiaMod implements ModInitializer {
	public static final String MOD_ID = "anaritiamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}