package com.lynndova.pretty;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrettyPlease implements ModInitializer {
    public static final String MODID = "pretty";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
		// register blocks
		PrettyPleaseBlocks.init();

    }

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MODID, path);
	}
}
