package com.lynndova.pretty.world.level.block;

import com.google.common.collect.Lists;
import com.lynndova.pretty.PrettyPlease;
import com.lynndova.pretty.world.level.BlockFamily;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
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

	public static final BlockFamily PRISMARINE_TILE_FAMILY = new BlockFamily(
		PRISMARINE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Prismarine Tile %s")
			.cartographiate()
	)
		.add(
			PRISMARINE_TILES, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Prismarine Tiles")
				.cartographiate()
		)
		.add(PRISMARINE_TILE_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(PRISMARINE_TILE_SLAB, BlockFamily.MemberType.SLAB)
		.add(PRISMARINE_TILE_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.PRISMARINE_BRICK_SLAB);

	public static final Block SANDSTONE_TILES = register(
		"sandstone_tiles",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
	);
	public static final Block SANDSTONE_TILE_STAIRS = registerStairsOf("sandstone_tile_stairs", SANDSTONE_TILES);
	public static final Block SANDSTONE_TILE_SLAB = registerSlabOf("sandstone_tile_slab", SANDSTONE_TILES);
	public static final Block SANDSTONE_TILE_WALL = registerWallOf("sandstone_tile_wall", SANDSTONE_TILES);

	public static final BlockFamily SANDSTONE_TILE_FAMILY = new BlockFamily(
		SANDSTONE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Sandstone Tile %s")
			.cartographiate()
	)
		.add(
			SANDSTONE_TILES, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Sandstone Tiles")
				.cartographiate()
		)
		.add(SANDSTONE_TILE_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(SANDSTONE_TILE_SLAB, BlockFamily.MemberType.SLAB)
		.add(SANDSTONE_TILE_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.CUT_STANDSTONE_SLAB);

	public static final Block RED_SANDSTONE_TILES = register(
		"red_sandstone_tiles",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
	);
	public static final Block RED_SANDSTONE_TILE_STAIRS = registerStairsOf("red_sandstone_tile_stairs", RED_SANDSTONE_TILES);
	public static final Block RED_SANDSTONE_TILE_SLAB = registerSlabOf("red_sandstone_tile_slab", RED_SANDSTONE_TILES);
	public static final Block RED_SANDSTONE_TILE_WALL = registerWallOf("red_sandstone_tile_wall", RED_SANDSTONE_TILES);

	public static final BlockFamily RED_SANDSTONE_TILE_FAMILY = new BlockFamily(
		RED_SANDSTONE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Red Sandstone Tile %s")
			.cartographiate()
	)
		.add(
			RED_SANDSTONE_TILES, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Red Sandstone Tiles")
				.cartographiate()
		)
		.add(RED_SANDSTONE_TILE_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(RED_SANDSTONE_TILE_SLAB, BlockFamily.MemberType.SLAB)
		.add(RED_SANDSTONE_TILE_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.CUT_RED_SANDSTONE_SLAB);
	// endregion

	// region bricks
	public static final Block ANDESITE_BRICKS = register(
		"andesite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block ANDESITE_BRICK_STAIRS = registerStairsOf("andesite_brick_stairs", ANDESITE_BRICKS);
	public static final Block ANDESITE_BRICK_SLAB = registerSlabOf("andesite_brick_slab", ANDESITE_BRICKS);
	public static final Block ANDESITE_BRICK_WALL = registerWallOf("andesite_brick_wall", ANDESITE_BRICKS);

	public static final BlockFamily ANDESITE_BRICK_FAMILY = new BlockFamily(
		ANDESITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Andesite Brick %s")
			.cartographiate()
	)
		.add(
			ANDESITE_BRICKS, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Andesite Bricks")
				.cartographiate()
		)
		.add(ANDESITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(ANDESITE_BRICK_SLAB, BlockFamily.MemberType.SLAB)
		.add(ANDESITE_BRICK_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_ANDESITE_SLAB);

	public static final Block DIORITE_BRICKS = register(
		"diorite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block DIORITE_BRICK_STAIRS = registerStairsOf("diorite_brick_stairs", DIORITE_BRICKS);
	public static final Block DIORITE_BRICK_SLAB = registerSlabOf("diorite_brick_slab", DIORITE_BRICKS);
	public static final Block DIORITE_BRICK_WALL = registerWallOf("diorite_brick_wall", DIORITE_BRICKS);

	public static final BlockFamily DIORITE_BRICK_FAMILY = new BlockFamily(
		DIORITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Diorite Brick %s")
			.cartographiate()
	)
		.add(
			DIORITE_BRICKS, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Diorite Bricks")
				.cartographiate()
		)
		.add(DIORITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(DIORITE_BRICK_SLAB, BlockFamily.MemberType.SLAB)
		.add(DIORITE_BRICK_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_DIORITE_SLAB);

	public static final Block GRANITE_BRICKS = register(
		"granite_bricks",
		Block::new,
		BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
	);
	public static final Block GRANITE_BRICK_STAIRS = registerStairsOf("granite_brick_stairs", GRANITE_BRICKS);
	public static final Block GRANITE_BRICK_SLAB = registerSlabOf("granite_brick_slab", GRANITE_BRICKS);
	public static final Block GRANITE_BRICK_WALL = registerWallOf("granite_brick_wall", GRANITE_BRICKS);

	public static final BlockFamily GRANITE_BRICK_FAMILY = new BlockFamily(
		GRANITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Granite Brick %s")
			.cartographiate()
	)
		.add(
			GRANITE_BRICKS, BlockFamily.MemberType.BASE, new BlockFamily.StringMapMaker()
				.add("en_us", "Granite Bricks")
				.cartographiate()
		)
		.add(GRANITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS)
		.add(GRANITE_BRICK_SLAB, BlockFamily.MemberType.SLAB)
		.add(GRANITE_BRICK_WALL, BlockFamily.MemberType.WALL)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_GRANITE_SLAB);
	// endregion

	public static final List<BlockFamily> ALL_FAMILIES = Arrays.asList(
		// tiles
		PRISMARINE_TILE_FAMILY,
		SANDSTONE_TILE_FAMILY,
		RED_SANDSTONE_TILE_FAMILY,
		// bricks
		ANDESITE_BRICK_FAMILY,
		DIORITE_BRICK_FAMILY,
		GRANITE_BRICK_FAMILY
	);

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
