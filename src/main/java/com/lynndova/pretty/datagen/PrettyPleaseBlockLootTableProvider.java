package com.lynndova.pretty.datagen;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class PrettyPleaseBlockLootTableProvider extends FabricBlockLootSubProvider {
	protected PrettyPleaseBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(packOutput, registriesFuture);
	}

	@Override
	public void generate() {
		PrettyPleaseBlocks.ALL_FAMILIES.forEach(family -> {
			family.getMembers().forEach(member -> {
				switch (member.lootType()) {
					case SELF -> dropSelf(member.block());
					case SILK_TOUCH_ONLY -> dropWhenSilkTouch(member.block());
				}
			});
		});
	}
}
