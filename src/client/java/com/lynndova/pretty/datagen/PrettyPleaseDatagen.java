package com.lynndova.pretty.datagen;

import com.lynndova.pretty.datagen.lang.PrettyPleaseEnglishLanguagesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jspecify.annotations.NonNull;

public class PrettyPleaseDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// block & item models
		pack.addProvider(PrettyPleaseModelProvider::new);
		// language translations
		pack.addProvider(PrettyPleaseEnglishLanguagesProvider.UnitedStatesProvider::new); // en_us
		// loot tables
		pack.addProvider(PrettyPleaseBlockLootTableProvider::new);
		// block tags
		pack.addProvider(PrettyPleaseBlockTagProvider::new);
	}
}
