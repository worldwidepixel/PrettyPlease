package com.lynndova.pretty.datagen;

import com.lynndova.pretty.world.level.BlockFamily;
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
	public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerator) {
		PrettyPleaseBlocks.ALL_FAMILIES.forEach(family -> generateFromFamily(family, blockModelGenerator));
	}

	private void generateFromFamily(BlockFamily family, BlockModelGenerators blockModelGenerator) {
		BlockModelGenerators.BlockFamilyProvider provider = blockModelGenerator.family(family.getBaseBlock());

		family.getMembers().forEach((member) -> {
			switch (member.type()) {
				case BlockFamily.MemberType.STAIRS -> provider.stairs(member.block());
				case BlockFamily.MemberType.SLAB -> provider.slab(member.block());
				case BlockFamily.MemberType.WALL -> provider.wall(member.block());
			}
		});
	}

	@Override
	public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerator) {
	}
}
