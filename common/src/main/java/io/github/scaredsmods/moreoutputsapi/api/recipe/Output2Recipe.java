package io.github.scaredsmods.moreoutputsapi.api.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.input.RecipeInput;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryWrapper;

public interface Output2Recipe<T extends RecipeInput> {


    ItemStack craftSecond(T input, RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack getSecondResult(RegistryWrapper.WrapperLookup wrapperLookup);
}
