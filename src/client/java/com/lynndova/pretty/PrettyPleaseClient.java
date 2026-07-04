package com.lynndova.pretty;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class PrettyPleaseClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
			.register((tab) -> {
				tab.accept(PrettyPleaseBlocks.PRISMARINE_TILES);
				tab.accept(PrettyPleaseBlocks.PRISMARINE_TILE_STAIRS);
				tab.accept(PrettyPleaseBlocks.PRISMARINE_TILE_SLAB);
				tab.accept(PrettyPleaseBlocks.PRISMARINE_TILE_WALL);

				tab.accept(PrettyPleaseBlocks.SANDSTONE_TILES);
				tab.accept(PrettyPleaseBlocks.SANDSTONE_TILE_STAIRS);
				tab.accept(PrettyPleaseBlocks.SANDSTONE_TILE_SLAB);
				tab.accept(PrettyPleaseBlocks.SANDSTONE_TILE_WALL);

				tab.accept(PrettyPleaseBlocks.RED_SANDSTONE_TILES);
				tab.accept(PrettyPleaseBlocks.RED_SANDSTONE_TILE_STAIRS);
				tab.accept(PrettyPleaseBlocks.RED_SANDSTONE_TILE_SLAB);
				tab.accept(PrettyPleaseBlocks.RED_SANDSTONE_TILE_WALL);

				tab.accept(PrettyPleaseBlocks.ANDESITE_BRICKS);
				tab.accept(PrettyPleaseBlocks.ANDESITE_BRICK_STAIRS);
				tab.accept(PrettyPleaseBlocks.ANDESITE_BRICK_SLAB);
				tab.accept(PrettyPleaseBlocks.ANDESITE_BRICK_WALL);

				tab.accept(PrettyPleaseBlocks.DIORITE_BRICKS);
				tab.accept(PrettyPleaseBlocks.DIORITE_BRICK_STAIRS);
				tab.accept(PrettyPleaseBlocks.DIORITE_BRICK_SLAB);
				tab.accept(PrettyPleaseBlocks.DIORITE_BRICK_WALL);

				tab.accept(PrettyPleaseBlocks.GRANITE_BRICKS);
				tab.accept(PrettyPleaseBlocks.GRANITE_BRICK_STAIRS);
				tab.accept(PrettyPleaseBlocks.GRANITE_BRICK_SLAB);
				tab.accept(PrettyPleaseBlocks.GRANITE_BRICK_WALL);
			});
	}
}
