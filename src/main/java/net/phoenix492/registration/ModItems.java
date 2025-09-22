package net.phoenix492.registration;

import net.phoenix492.replaceme.ReplaceMe;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(ReplaceMe.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
