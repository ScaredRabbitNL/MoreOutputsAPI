package io.github.scaredsmods.moreoutputsapi.api;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.DynamicRegistryManager;


public interface Output3Recipe<C extends Inventory> {



    ItemStack getSecondResult(DynamicRegistryManager registryManager);
    ItemStack getThirdResult(DynamicRegistryManager registryManager);

    ItemStack craftSecond(C inventory,DynamicRegistryManager registryManager);
    ItemStack craftThird(C inventory, DynamicRegistryManager registryManager);

}
