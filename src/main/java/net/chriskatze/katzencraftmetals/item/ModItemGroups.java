package net.chriskatze.katzencraftmetals.item;

import net.chriskatze.katzencraftmetals.KatzencraftMetals;
import net.chriskatze.katzencraftmetals.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {

    // ADDS ITEMS INTO THE CORRESPONDING VANILLA CREATIVE TAB GROUPS ---------------------------------------------------
    private static void Mod_Ingredients(FabricItemGroupEntries entries) {
        entries.add(ModItems.STEEL_RAW);
        entries.add(ModItems.STEEL_NUGGET);
        entries.add(ModItems.STEEL_INGOT);

        entries.add(ModItems.ADAMANTIUM_RAW);
        entries.add(ModItems.ADAMANTIUM_NUGGET);
        entries.add(ModItems.ADAMANTIUM_INGOT);

        entries.add(ModItems.MYTHRIL_RAW);
        entries.add(ModItems.MYTHRIL_NUGGET);
        entries.add(ModItems.MYTHRIL_INGOT);

        entries.add(ModItems.PLATINUM_RAW);
        entries.add(ModItems.PLATINUM_NUGGET);
        entries.add(ModItems.PLATINUM_INGOT);
    }

    private static void Mod_Natural(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.ADAMANTIUM_BLOCK);
        entries.add(ModBlocks.ADAMANTIUM_ORE);
        entries.add(ModBlocks.ADAMANTIUM_ORE_DEEPSLATE);
        entries.add(ModBlocks.ADAMANTIUM_ORE_NETHER);
        entries.add(ModBlocks.ADAMANTIUM_ORE_END);

        entries.add(ModBlocks.MYTHRIL_BLOCK);
        entries.add(ModBlocks.MYTHRIL_ORE);
        entries.add(ModBlocks.MYTHRIL_ORE_DEEPSLATE);
        entries.add(ModBlocks.MYTHRIL_ORE_NETHER);
        entries.add(ModBlocks.MYTHRIL_ORE_END);

        entries.add(ModBlocks.PLATINUM_BLOCK);
        entries.add(ModBlocks.PLATINUM_ORE);
        entries.add(ModBlocks.PLATINUM_ORE_DEEPSLATE);
        entries.add(ModBlocks.PLATINUM_ORE_NETHER);
        entries.add(ModBlocks.PLATINUM_ORE_END);
    }

    private static void Mod_Tools(FabricItemGroupEntries entries) {

    }

    private static void Mod_Combat(FabricItemGroupEntries entries) {

    }



    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED FOR INITIALIZATION AND LOGGING OF THE MOD ITEM GROUPS CLASS ------------------------------------------------
    public static void registerItemGroups() {
        KatzencraftMetals.LOGGER.info("Registering Item Groups for " + KatzencraftMetals.MOD_ID);

        // USED TO MODIFY THE VANILLA CREATIVE TAB ENTRIES -------------------------------------------------------------
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::Mod_Ingredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItemGroups::Mod_Natural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItemGroups::Mod_Tools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItemGroups::Mod_Combat);
    }
}

