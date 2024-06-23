package io.github.scaredsmods.morerecipeoutputapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.DynamicRegistryManager;


public interface Output2Recipe {


    ItemStack getSecondResult(DynamicRegistryManager registryManager);


    ItemStack craftSecond(DynamicRegistryManager registryManager);

}
