package com.lynndova.pretty.world.level;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class BlockFamily {
	private final Block base;
	private final HashMap<String, String> childrenSlotTranslations;
	private final ArrayList<Member> members = new ArrayList<>();
	private final ArrayList<CreativeModeTabEntry> creativeModeTabEntries = new ArrayList<>();

	public BlockFamily(Block base, HashMap<String, String> childrenSlotTranslations) {
		this.base = base;
		this.childrenSlotTranslations = childrenSlotTranslations;
	}

	public Block getBaseBlock() {
		return this.base;
	}

	public HashMap<String, String> getSlotTranslations() {
		return this.childrenSlotTranslations;
	}

	public ArrayList<Member> getMembers() {
		return this.members;
	}

	public ArrayList<CreativeModeTabEntry> getCreativeModeTabs() {
		return this.creativeModeTabEntries;
	}

	public BlockFamily add(Block block, MemberType type, MemberLootType lootType, HashMap<String, String> translationOverrides) {
		members.add(new Member(
			block,
			type,
			translationOverrides,
			lootType
		));
		return this;
	}

	public BlockFamily add(Block block, MemberType type, MemberLootType lootType) {
		members.add(new Member(
			block,
			type,
			new StringMapMaker().cartographiate(),
			lootType
		));
		return this;
	}

	public BlockFamily addCreativeTab(ResourceKey<CreativeModeTab> tab) {
		creativeModeTabEntries.add(new CreativeModeTabEntry(tab, Optional.empty()));
		return this;
	}

	public BlockFamily addCreativeTab(ResourceKey<CreativeModeTab> tab, Item insertAfter) {
		creativeModeTabEntries.add(new CreativeModeTabEntry(tab, Optional.of(insertAfter)));
		return this;
	}

	public record CreativeModeTabEntry(ResourceKey<CreativeModeTab> tab, Optional<Item> insertAfter) { }

	public record Member(Block block, MemberType type, HashMap<String, String> translationOverrides, MemberLootType lootType) { }

	public enum MemberLootType {
		SELF,
		SILK_TOUCH_ONLY,
		NOTHING
	}

	public enum MemberType {
		BASE(),
		STAIRS(
			new StringMapMaker()
				.add("en_us", "Stairs")
				.cartographiate()
		),
		SLAB(
			new StringMapMaker()
				.add("en_us", "Slab")
				.cartographiate()
		),
		WALL(
			new StringMapMaker()
				.add("en_us", "Wall")
				.cartographiate()
		);

		private final HashMap<String, String> slotIn;

		MemberType(HashMap<String, String> slotIn) {
			this.slotIn = slotIn;
		}

		MemberType() {
			this.slotIn = new HashMap<>();
		}

		public HashMap<String, String> getInfillName() {
			return slotIn;
		}
	}

	public static class MapMaker<K, V> {
		private final HashMap<K, V> map = new HashMap<>();

		public MapMaker<K, V> add(K key, V value) {
			map.put(key, value);
			return this;
		}

		public HashMap<K, V> cartographiate() {
			return this.map;
		}
	}

	public static class StringMapMaker extends MapMaker<String, String> { }
}
