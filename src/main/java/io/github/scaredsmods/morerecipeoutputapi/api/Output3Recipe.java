package io.github.scaredsmods.morerecipeoutputapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.collection.DefaultedList;

public interface Output3Recipe {



    ItemStack getSecondResult(DynamicRegistryManager registryManager);
    ItemStack getThirdResult(DynamicRegistryManager registryManager);

    ItemStack craftSecond(DynamicRegistryManager registryManager);
    ItemStack craftThird(DynamicRegistryManager registryManager);

}
