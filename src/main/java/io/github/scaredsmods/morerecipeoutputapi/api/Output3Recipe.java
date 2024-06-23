package io.github.scaredsmods.morerecipeoutputapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.DynamicRegistryManager;


public interface Output3Recipe {



    ItemStack getSecondResult(DynamicRegistryManager registryManager);
    ItemStack getThirdResult(DynamicRegistryManager registryManager);

    ItemStack craftSecond(DynamicRegistryManager registryManager);
    ItemStack craftThird(DynamicRegistryManager registryManager);

}
