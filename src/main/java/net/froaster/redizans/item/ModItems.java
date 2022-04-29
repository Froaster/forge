package net.froaster.redizans.item;

import net.froaster.redizans.redizans;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, redizans.MOD_ID);

public static final RegistryObject<Item> Ruby = ITEMS.register( "ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REDIZANS_TAB)));
    public static final RegistryObject<Item> Trumpet = ITEMS.register( "trumpet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REDIZANS_TAB)));
    public static final RegistryObject<Item> Violum = ITEMS.register( "violum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REDIZANS_TAB)));





public static void register(IEventBus eventBus) {

    ITEMS.register(eventBus);
}



}
