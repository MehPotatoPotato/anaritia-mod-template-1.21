package net.aiden.anaritiamod.item;

import net.aiden.anaritiamod.AnaritiaMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Book_Of_Infinite_Foil = registerItem("book_of_infinite_foil", new Item(new Item.Settings()));


    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AnaritiaMod.MOD_ID, id), item);
    }

    public static void registerItems() {
        AnaritiaMod.LOGGER.info("Registering Mod Items for" + AnaritiaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(Book_Of_Infinite_Foil);
        });
    }
}
