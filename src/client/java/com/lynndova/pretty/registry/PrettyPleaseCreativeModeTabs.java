package com.lynndova.pretty.registry;

import com.lynndova.pretty.PrettyPlease;
import com.lynndova.pretty.world.level.BlockFamily;
import com.lynndova.pretty.world.level.block.PrettyPleaseBlockFamilies;
import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class PrettyPleaseCreativeModeTabs {
	public static final ResourceKey<CreativeModeTab> PRETTY_PLEASE_DEBUG_KEY = ResourceKey.create(
		BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(PrettyPlease.MODID, "pretty_please_debug")
	);
	public static final CreativeModeTab PRETTY_PLEASE_DEBUG = FabricCreativeModeTab.builder()
		.icon(() -> new ItemStack(PrettyPleaseBlocks.PRISMARINE_TILE_STAIRS))
		.title(Component.translatable("itemGroup.prettyPleaseDebug"))
		.displayItems((params, output) -> {
			PrettyPleaseBlockFamilies.ALL_FAMILIES.forEach(family -> {
				family.getMembers().forEach(member -> output.accept(member.block()));
			});
		})
		.build();

	public static void init() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
			.register((tab) -> {
				PrettyPleaseBlockFamilies.ALL_FAMILIES.forEach(family -> addFamilyToTab(family, tab));
			});

		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, PRETTY_PLEASE_DEBUG_KEY, PRETTY_PLEASE_DEBUG);
		}
	}

	private static void addFamilyToTab(BlockFamily family, FabricCreativeModeTabOutput tabOutput) {
		family.getCreativeModeTabs().forEach((tabEntry) -> {
			if (tabEntry.insertAfter().isPresent()) {
				tabOutput.insertAfter(
					tabEntry.insertAfter().get(),
					family.getMembers()
						.stream()
						.map((BlockFamily.Member::block))
						.toArray(Block[]::new)
				);
			} else {
				family.getMembers().forEach((member) -> {
					tabOutput.accept(member.block());
				});
			}
		});
	}
}
