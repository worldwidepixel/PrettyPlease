package com.lynndova.pretty.datagen;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import org.jspecify.annotations.NonNull;

public class PrettyPleaseModelProvider extends FabricModelProvider {

	public PrettyPleaseModelProvider(FabricPackOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators blockModelGenerator) {
		// region tiles
		blockModelGenerator.family(PrettyPleaseBlocks.PRISMARINE_TILES)
			.stairs(PrettyPleaseBlocks.PRISMARINE_TILE_STAIRS)
			.slab(PrettyPleaseBlocks.PRISMARINE_TILE_SLAB)
			.wall(PrettyPleaseBlocks.PRISMARINE_TILE_WALL);

		blockModelGenerator.family(PrettyPleaseBlocks.SANDSTONE_TILES)
			.stairs(PrettyPleaseBlocks.SANDSTONE_TILE_STAIRS)
			.slab(PrettyPleaseBlocks.SANDSTONE_TILE_SLAB)
			.wall(PrettyPleaseBlocks.SANDSTONE_TILE_WALL);

		blockModelGenerator.family(PrettyPleaseBlocks.RED_SANDSTONE_TILES)
			.stairs(PrettyPleaseBlocks.RED_SANDSTONE_TILE_STAIRS)
			.slab(PrettyPleaseBlocks.RED_SANDSTONE_TILE_SLAB)
			.wall(PrettyPleaseBlocks.RED_SANDSTONE_TILE_WALL);
	// endregion

	// region bricks
		blockModelGenerator.family(PrettyPleaseBlocks.ANDESITE_BRICKS)
			.stairs(PrettyPleaseBlocks.ANDESITE_BRICK_STAIRS)
			.slab(PrettyPleaseBlocks.ANDESITE_BRICK_SLAB)
			.wall(PrettyPleaseBlocks.ANDESITE_BRICK_WALL);

		blockModelGenerator.family(PrettyPleaseBlocks.DIORITE_BRICKS)
			.stairs(PrettyPleaseBlocks.DIORITE_BRICK_STAIRS)
			.slab(PrettyPleaseBlocks.DIORITE_BRICK_SLAB)
			.wall(PrettyPleaseBlocks.DIORITE_BRICK_WALL);

		blockModelGenerator.family(PrettyPleaseBlocks.GRANITE_BRICKS)
			.stairs(PrettyPleaseBlocks.GRANITE_BRICK_STAIRS)
			.slab(PrettyPleaseBlocks.GRANITE_BRICK_SLAB)
			.wall(PrettyPleaseBlocks.GRANITE_BRICK_WALL);
	// endregion
	}

	@Override
	public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerator) {
	}
}
