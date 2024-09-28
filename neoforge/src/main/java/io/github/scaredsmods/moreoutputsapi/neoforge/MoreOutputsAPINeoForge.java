package io.github.scaredsmods.moreoutputsapi.neoforge;

import net.neoforged.fml.common.Mod;

import io.github.scaredsmods.moreoutputsapi.MoreOutputsAPI;

@Mod(MoreOutputsAPI.MOD_ID)
public final class MoreOutputsAPINeoForge {
    public MoreOutputsAPINeoForge() {
        // Run our common setup.
        MoreOutputsAPI.init();
    }
}
