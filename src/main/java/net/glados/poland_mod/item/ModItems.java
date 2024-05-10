package net.glados.poland_mod.item;

import net.glados.poland_mod.PolandMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PolandMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> BURSZTYN = ITEMS.register("bursztyn",
            () -> new Item(new Item.Properties()));

    //food
    public static final RegistryObject<Item> PIEROGI_SER = ITEMS.register("pierogi_ser",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIEROGI_MIESO = ITEMS.register("pierogi_mieso",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIEROGI_KAPUSTA = ITEMS.register("pierogi_kapusta",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIEROGI_JAGODY = ITEMS.register("pierogi_jagody",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIEROGI_RUSKIE = ITEMS.register("pierogi_ruskie",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIGOS = ITEMS.register("bigos",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIWO_ZUBR = ITEMS.register("piwo_zubr",
            () -> new Item(new Item.Properties()));

    //armor
    public static final RegistryObject<Item> BURSZTYN_HELMET = ITEMS.register("bursztyn_helmet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURSZTYN_CHESTPLATE = ITEMS.register("bursztyn_chestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURSZTYN_LEGGINGS = ITEMS.register("bursztyn_leggings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURSZTYN_BOOTS = ITEMS.register("bursztyn_boots",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}