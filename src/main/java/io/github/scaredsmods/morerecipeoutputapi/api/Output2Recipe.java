package io.github.scaredsmods.morerecipeoutputapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.DynamicRegistryManager;


public interface Output2Recipe {


    ItemStack getSecondResult(DynamicRegistryManager registryManager);


    ItemStack craftSecond(DynamicRegistryManager registryManager);

}
