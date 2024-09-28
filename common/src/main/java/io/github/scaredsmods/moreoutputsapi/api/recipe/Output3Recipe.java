package io.github.scaredsmods.moreoutputsapi.api.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;
import net.minecraft.registry.RegistryWrapper;

public interface Output3Recipe<T extends RecipeInput> {

    ItemStack craftSecond(T input, RegistryWrapper.WrapperLookup lookup);
    ItemStack getSecondResult(RegistryWrapper.WrapperLookup registriesLookup);

    ItemStack craftThird(T input, RegistryWrapper.WrapperLookup lookup);
    ItemStack getThirdResult(RegistryWrapper.WrapperLookup wrapperLookup);
}
