package io.github.scaredsmods.moreoutputsapi.api.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;
import net.minecraft.registry.RegistryWrapper;

public interface Output4Recipe<T extends RecipeInput> {

    ItemStack craftSecond(T input, RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack getSecondResult(RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack craftThird(T input, RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack getThirdResult(RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack craftFourth(T input, RegistryWrapper.WrapperLookup wrapperLookup);

    ItemStack getFourthResult(RegistryWrapper.WrapperLookup wrapperLookup);
}
