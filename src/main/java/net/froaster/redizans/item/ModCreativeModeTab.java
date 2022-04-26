package net.froaster.redizans.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab REDIZANS_TAB = new CreativeModeTab("redizans") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Ruby.get());
        }
    };

}