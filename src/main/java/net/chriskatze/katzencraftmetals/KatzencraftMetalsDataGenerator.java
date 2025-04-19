package net.chriskatze.katzencraftmetals;

import net.chriskatze.katzencraftmetals.datagen.*;
import net.chriskatze.katzencraftmetals.world.ModConfiguredFeatures;
import net.chriskatze.katzencraftmetals.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class KatzencraftMetalsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// INITIALIZES DATAGENERATION PACKS ----------------------------------------------------------------------------
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemtagProvider::new);
		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		// USED FOR WORLD GENERATION FEATURES --------------------------------------------------------------------------
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}