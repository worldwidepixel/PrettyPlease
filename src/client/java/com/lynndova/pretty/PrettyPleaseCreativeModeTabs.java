package com.lynndova.pretty;

import com.lynndova.pretty.world.level.BlockFamily;
import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;

public class PrettyPleaseCreativeModeTabs {
	public static void init() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
			.register((tab) -> {
				PrettyPleaseBlocks.ALL_FAMILIES.forEach(family -> addFamilyToTab(family, tab));
			});
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
