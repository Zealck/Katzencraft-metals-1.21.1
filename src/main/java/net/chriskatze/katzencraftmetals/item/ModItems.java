package net.chriskatze.katzencraftmetals.item;

import net.chriskatze.katzencraftmetals.KatzencraftMetals;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // METALS ----------------------------------------------------------------------------------------------------------

    public static final Item STEEL_RAW = registerItem("steel_raw", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    public static final Item ADAMANTIUM_RAW = registerItem("adamantium_raw", new Item(new Item.Settings()));
    public static final Item ADAMANTIUM_NUGGET = registerItem("adamantium_nugget", new Item(new Item.Settings()));
    public static final Item ADAMANTIUM_INGOT = registerItem("adamantium_ingot", new Item(new Item.Settings()));

    public static final Item MYTHRIL_RAW = registerItem("mythril_raw", new Item(new Item.Settings()));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));

    public static final Item PLATINUM_RAW = registerItem("platinum_raw", new Item(new Item.Settings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));

    public static final Item SILVER_RAW = registerItem("silver_raw", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED TO REGISTER  MOD ITEMS -------------------------------------------------------------------------------------
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KatzencraftMetals.MOD_ID, name), item);
    }

    // USED FOR INITIALIZATION AND LOGGING OF THE MODITEMS CLASS -------------------------------------------------------
    public static void registerModItems() {
        KatzencraftMetals.LOGGER.info("Registering ModItems for " + KatzencraftMetals.MOD_ID);
    }
}
