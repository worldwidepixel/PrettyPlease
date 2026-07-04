package com.lynndova.pretty.world.level.block;

import com.lynndova.pretty.PrettyPlease;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PrettyPleaseBlocks {
	// region tiles
	public static final Block PRISMARINE_TILES = register(
		"prismarine_tiles",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
	);
	public static final Block PRISMARINE_TILE_STAIRS = registerStairsOf("prismarine_tile_stairs", PRISMARINE_TILES);
	public static final Block PRISMARINE_TILE_SLAB = registerSlabOf("prismarine_tile_slab", PRISMARINE_TILES);
	public static final Block PRISMARINE_TILE_WALL = registerWallOf("prismarine_tile_wall", PRISMARINE_TILES);

	public static final Block SANDSTONE_TILES = register(
		"sandstone_tiles",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
	);
	public static final Block SANDSTONE_TILE_STAIRS = registerStairsOf("sandstone_tile_stairs", SANDSTONE_TILES);
	public static final Block SANDSTONE_TILE_SLAB = registerSlabOf("sandstone_tile_slab", SANDSTONE_TILES);
	public static final Block SANDSTONE_TILE_WALL = registerWallOf("sandstone_tile_wall", SANDSTONE_TILES);

	public static final Block RED_SANDSTONE_TILES = register(
		"red_sandstone_tiles",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
	);
	public static final Block RED_SANDSTONE_TILE_STAIRS = registerStairsOf("red_sandstone_tile_stairs", RED_SANDSTONE_TILES);
	public static final Block RED_SANDSTONE_TILE_SLAB = registerSlabOf("red_sandstone_tile_slab", RED_SANDSTONE_TILES);
	public static final Block RED_SANDSTONE_TILE_WALL = registerWallOf("red_sandstone_tile_wall", RED_SANDSTONE_TILES);
	// endregion

	// region bricks
	public static final Block ANDESITE_BRICKS = register(
		"andesite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block ANDESITE_BRICK_STAIRS = registerStairsOf("andesite_brick_stairs", ANDESITE_BRICKS);
	public static final Block ANDESITE_BRICK_SLAB = registerStairsOf("andesite_brick_slab", ANDESITE_BRICKS);
	public static final Block ANDESITE_BRICK_WALL = registerStairsOf("andesite_brick_wall", ANDESITE_BRICKS);

	public static final Block DIORITE_BRICKS = register(
		"diorite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block DIORITE_BRICK_STAIRS = registerStairsOf("diorite_brick_stairs", DIORITE_BRICKS);
	public static final Block DIORITE_BRICK_SLAB = registerStairsOf("diorite_brick_slab", DIORITE_BRICKS);
	public static final Block DIORITE_BRICK_WALL = registerStairsOf("diorite_brick_wall", DIORITE_BRICKS);

	public static final Block GRANITE_BRICKS = register(
		"granite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block GRANITE_BRICK_STAIRS = registerStairsOf("granite_brick_stairs", GRANITE_BRICKS);
	public static final Block GRANITE_BRICK_SLAB = registerStairsOf("granite_brick_slab", GRANITE_BRICKS);
	public static final Block GRANITE_BRICK_WALL = registerStairsOf("granite_brick_wall", GRANITE_BRICKS);
	// endregion

	// region lovely boilerplate
	public static <T extends Block> T register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings, @Nullable BiFunction<Block, Item.Properties, ? extends BlockItem> blockItemConstructor) {
		T block = factory.apply(settings.setId(key));

		if (blockItemConstructor != null) {
			ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, key.identifier());
			Item.Properties itemSettings = new Item.Properties().setId(itemKey).useBlockDescriptionPrefix();
			BlockItem blockItem = blockItemConstructor.apply(block, itemSettings);
			Registry.register(
				BuiltInRegistries.ITEM,
				itemKey,
				blockItem
			);
			blockItem.registerBlocks(Item.BY_BLOCK, blockItem);
		}

		return Registry.register(BuiltInRegistries.BLOCK, key, block);
	}

	public static <T extends Block> T register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings, boolean item) {
		return register(key, factory, settings, item ? BlockItem::new : null);
	}

	private static <T extends Block> T register(String id, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings, boolean item) {
		return register(keyOf(id), factory, settings, item);
	}

	private static <T extends Block> T register(String id, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings, @Nullable BiFunction<Block, Item.Properties, ? extends BlockItem> blockItemConstructor) {
		return register(keyOf(id), factory, settings, blockItemConstructor);
	}

	private static <T extends Block> T register(String id, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings) {
		return register(keyOf(id), factory, settings, true);
	}

	private static Block registerStairsOf(String id, Block block) {
		return register(id, settings -> new StairBlock(block.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(block));
	}

	private static Block registerSlabOf(String id, Block block) {
		return register(id, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(block));
	}

	private static Block registerWallOf(String id, Block block) {
		return register(id, WallBlock::new, BlockBehaviour.Properties.ofFullCopy(block).forceSolidOn());
	}

	private static ResourceKey<Block> keyOf(String id) {
		return ResourceKey.create(Registries.BLOCK, PrettyPlease.id(id));
	}

	public static void init() {
		// yeah, empty sorry
	}
	// endregion
}
