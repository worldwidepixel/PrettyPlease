package com.lynndova.pretty.datagen.lang;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class PrettyPleaseEnglishLanguagesProvider {

	public static class UnitedStatesProvider extends FabricLanguageProvider {

		public UnitedStatesProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
			super(packOutput, "en_us", registryLookup);
		}

		@Override
		public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, @NonNull TranslationBuilder translationBuilder) {
			// region tiles
			new EnglishBlockTrifectaBuilder(translationBuilder, "Prismarine Tiles", "Prismarine Tile")
				.base(PrettyPleaseBlocks.PRISMARINE_TILES)
				.stairs(PrettyPleaseBlocks.PRISMARINE_TILE_STAIRS)
				.slab(PrettyPleaseBlocks.PRISMARINE_TILE_SLAB)
				.wall(PrettyPleaseBlocks.PRISMARINE_TILE_WALL)
				.omgYouDidItYay();

			new EnglishBlockTrifectaBuilder(translationBuilder, "Sandstone Tiles", "Sandstone Tile")
				.base(PrettyPleaseBlocks.SANDSTONE_TILES)
				.stairs(PrettyPleaseBlocks.SANDSTONE_TILE_STAIRS)
				.slab(PrettyPleaseBlocks.SANDSTONE_TILE_SLAB)
				.wall(PrettyPleaseBlocks.SANDSTONE_TILE_WALL)
				.omgYouDidItYay();

			new EnglishBlockTrifectaBuilder(translationBuilder, "Red Sandstone Tiles", "Red Sandstone Tile")
				.base(PrettyPleaseBlocks.RED_SANDSTONE_TILES)
				.stairs(PrettyPleaseBlocks.RED_SANDSTONE_TILE_STAIRS)
				.slab(PrettyPleaseBlocks.RED_SANDSTONE_TILE_SLAB)
				.wall(PrettyPleaseBlocks.RED_SANDSTONE_TILE_WALL)
				.omgYouDidItYay();
			// endregion

			// region bricks
			new EnglishBlockTrifectaBuilder(translationBuilder, "Andesite Bricks", "Andesite Brick")
				.base(PrettyPleaseBlocks.ANDESITE_BRICKS)
				.stairs(PrettyPleaseBlocks.ANDESITE_BRICK_STAIRS)
				.slab(PrettyPleaseBlocks.ANDESITE_BRICK_SLAB)
				.wall(PrettyPleaseBlocks.ANDESITE_BRICK_WALL)
				.omgYouDidItYay();

			new EnglishBlockTrifectaBuilder(translationBuilder, "Diorite Bricks", "Diorite Brick")
				.base(PrettyPleaseBlocks.DIORITE_BRICKS)
				.stairs(PrettyPleaseBlocks.DIORITE_BRICK_STAIRS)
				.slab(PrettyPleaseBlocks.DIORITE_BRICK_SLAB)
				.wall(PrettyPleaseBlocks.DIORITE_BRICK_WALL)
				.omgYouDidItYay();

			new EnglishBlockTrifectaBuilder(translationBuilder, "Granite Bricks", "Granite Brick")
				.base(PrettyPleaseBlocks.GRANITE_BRICKS)
				.stairs(PrettyPleaseBlocks.GRANITE_BRICK_STAIRS)
				.slab(PrettyPleaseBlocks.GRANITE_BRICK_SLAB)
				.wall(PrettyPleaseBlocks.GRANITE_BRICK_WALL)
				.omgYouDidItYay();
			// endregion
		}
	}

	private static class EnglishBlockTrifectaBuilder {
		private final FabricLanguageProvider.TranslationBuilder translationBuilder;
		private final String materialName;

		private boolean useChildrenPrefix = false;
		private String childrenPrefix = "Wrongly Named";

		public EnglishBlockTrifectaBuilder(FabricLanguageProvider.TranslationBuilder builder, String materialName, String childrenPrefix) {
			this.translationBuilder = builder;
			this.materialName = materialName;
			this.childrenPrefix = childrenPrefix;
			this.useChildrenPrefix = true;
		}

		public EnglishBlockTrifectaBuilder(FabricLanguageProvider.TranslationBuilder builder, String materialName) {
			this.translationBuilder = builder;
			this.materialName = materialName;
		}

		private String getPrefix() {
			return this.useChildrenPrefix ? this.childrenPrefix : this.materialName;
		}

		public EnglishBlockTrifectaBuilder base(Block base) {
			translationBuilder.add(base, materialName);
			return this;
		}

		public EnglishBlockTrifectaBuilder blockOf(Block base) {
			translationBuilder.add(base, "Block of %s".formatted(materialName));
			return this;
		}

		public EnglishBlockTrifectaBuilder stairs(Block stairs) {
			translationBuilder.add(stairs, "%s Stairs".formatted(getPrefix()));
			return this;
		}

		public EnglishBlockTrifectaBuilder slab(Block slab) {
			translationBuilder.add(slab, "%s Slab".formatted(getPrefix()));
			return this;
		}

		public EnglishBlockTrifectaBuilder wall(Block wall) {
			translationBuilder.add(wall, "%s Wall".formatted(getPrefix()));
			return this;
		}

		public EnglishBlockTrifectaBuilder button(Block button) {
			translationBuilder.add(button, "%s Button".formatted(getPrefix()));
			return this;
		}

		public void omgYouDidItYay() {
		}
	}
}
