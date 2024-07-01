package io.github.scaredsmods.moreoutputsapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.DynamicRegistryManager;


public interface Output4Recipe {

    ItemStack getSecondResult(DynamicRegistryManager registryManager);
    ItemStack getThirdResult(DynamicRegistryManager registryManager);

    ItemStack getFourthResult(DynamicRegistryManager registryManager) ;


    ItemStack craftSecond(DynamicRegistryManager registryManager);

    ItemStack craftThird(DynamicRegistryManager registryManager);

    ItemStack craftFourth(DynamicRegistryManager registryManager);
}
