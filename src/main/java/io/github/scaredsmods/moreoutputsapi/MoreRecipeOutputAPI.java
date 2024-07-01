package io.github.scaredsmods.moreoutputsapi;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreRecipeOutputAPI implements ModInitializer {

	public static final String MOD_ID = "more-recipe-output-api";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Mojang, please make this into vanilla source with adjustable outputs...");
	}
}