package com.lynndova.pretty.datagen.lang;

import com.lynndova.pretty.world.level.BlockFamily;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class PrettyLanguageProvider extends FabricLanguageProvider {
	private final String languageCode;

	protected PrettyLanguageProvider(FabricPackOutput packOutput, String languageCode, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(packOutput, languageCode, registryLookup);
		this.languageCode = languageCode;
	}

	@Override
	public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, @NonNull TranslationBuilder translationBuilder) {
	}

	protected void generateFamilyTranslations(BlockFamily family, FabricLanguageProvider.TranslationBuilder builder) {
		// Family members
		family.getMembers().forEach((member) -> {
			Optional<String> override = Optional.ofNullable(member.translationOverrides().get(this.languageCode));
			Optional<String> slotTranslation = Optional.ofNullable(family.getSlotTranslations().get(languageCode));

			if (override.isPresent()) {
				builder.add(member.block(), override.get());
			} else {
				slotTranslation.ifPresent(
					s -> builder.add(
						member.block(),
						s.formatted(member.type().getInfillName().get(this.languageCode))
					)
				);
			}
		});
	}
}
