package net.spooderman.everythingmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spooderman.everythingmod.EverythingMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EverythingMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LOTION_POTION = ITEMS.register("lotion_potion",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LOTION_JUICE = ITEMS.register("lotion_juice",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
