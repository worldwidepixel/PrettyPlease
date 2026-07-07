package com.lynndova.pretty.world.level.block;

import com.lynndova.pretty.world.level.BlockFamily;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;

public class PrettyPleaseBlockFamilies {
	// region tiles
	public static final BlockFamily PRISMARINE_TILE_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.PRISMARINE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Prismarine Tile %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.PRISMARINE_TILES,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Prismarine Tiles")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.PRISMARINE_TILE_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.PRISMARINE_TILE_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.PRISMARINE_TILE_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.PRISMARINE_BRICK_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);

	public static final BlockFamily SANDSTONE_TILE_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.SANDSTONE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Sandstone Tile %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.SANDSTONE_TILES,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Sandstone Tiles")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.SANDSTONE_TILE_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.SANDSTONE_TILE_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.SANDSTONE_TILE_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.CUT_STANDSTONE_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);

	public static final BlockFamily RED_SANDSTONE_TILE_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.RED_SANDSTONE_TILES,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Red Sandstone Tile %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.RED_SANDSTONE_TILES,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Red Sandstone Tiles")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.RED_SANDSTONE_TILE_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.RED_SANDSTONE_TILE_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.RED_SANDSTONE_TILE_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.CUT_RED_SANDSTONE_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);
	// endregion tiles

	// region bricks
	public static final BlockFamily ANDESITE_BRICK_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.ANDESITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Andesite Brick %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.ANDESITE_BRICKS,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Andesite Bricks")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.ANDESITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.ANDESITE_BRICK_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.ANDESITE_BRICK_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_ANDESITE_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);

	public static final BlockFamily DIORITE_BRICK_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.DIORITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Diorite Brick %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.DIORITE_BRICKS,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Diorite Bricks")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.DIORITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.DIORITE_BRICK_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.DIORITE_BRICK_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_DIORITE_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);

	public static final BlockFamily GRANITE_BRICK_FAMILY = new BlockFamily(
		PrettyPleaseBlocks.GRANITE_BRICKS,
		new BlockFamily.StringMapMaker()
			.add("en_us", "Granite Brick %s")
			.cartographiate()
	)
		.add(
			PrettyPleaseBlocks.GRANITE_BRICKS,
			BlockFamily.MemberType.BASE,
			BlockFamily.MemberLootType.SELF,
			new BlockFamily.StringMapMaker()
				.add("en_us", "Granite Bricks")
				.cartographiate()
		)
		.add(PrettyPleaseBlocks.GRANITE_BRICK_STAIRS, BlockFamily.MemberType.STAIRS, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.GRANITE_BRICK_SLAB, BlockFamily.MemberType.SLAB, BlockFamily.MemberLootType.SELF)
		.add(PrettyPleaseBlocks.GRANITE_BRICK_WALL, BlockFamily.MemberType.WALL, BlockFamily.MemberLootType.SELF)
		.addCreativeTab(CreativeModeTabs.BUILDING_BLOCKS, Items.POLISHED_GRANITE_SLAB)
		.addFamilyTag(BlockTags.MINEABLE_WITH_PICKAXE);
	// endregion bricks

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
}
