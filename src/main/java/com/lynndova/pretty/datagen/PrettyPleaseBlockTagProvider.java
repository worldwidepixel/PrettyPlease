package com.lynndova.pretty.datagen;

import com.lynndova.pretty.world.level.BlockFamily;
import com.lynndova.pretty.world.level.block.PrettyPleaseBlockFamilies;
import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class PrettyPleaseBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
	public PrettyPleaseBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, registryLookupFuture);
	}

	@Override
	protected void addTags(HolderLookup.@NonNull Provider registries) {
		PrettyPleaseBlockFamilies.ALL_FAMILIES.forEach(family -> {
			family.getFamilyTags().forEach(tag -> {
				this.valueLookupBuilder(tag).add(
					family.getMembers()
						.stream()
						.map(BlockFamily.Member::block)
						.toArray(Block[]::new)
				);
			});
		});
	}
}
