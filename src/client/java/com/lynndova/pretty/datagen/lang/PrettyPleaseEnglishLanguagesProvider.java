package com.lynndova.pretty.datagen.lang;

import com.lynndova.pretty.world.level.block.PrettyPleaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class PrettyPleaseEnglishLanguagesProvider {

	public static class UnitedStatesProvider extends PrettyLanguageProvider {

		public UnitedStatesProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
			super(packOutput, "en_us", registryLookup);
		}

		@Override
		public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, @NonNull TranslationBuilder translationBuilder) {
			PrettyPleaseBlocks.ALL_FAMILIES.forEach(family -> generateFamilyTranslations(family, translationBuilder));
			translationBuilder.add("itemGroup.prettyPleaseDebug", "Pretty, Please! Debug");
		}
	}
}
