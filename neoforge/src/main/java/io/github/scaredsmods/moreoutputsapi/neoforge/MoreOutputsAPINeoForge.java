package io.github.scaredsmods.moreoutputsapi.neoforge;



import io.github.scaredsmods.moreoutputsapi.MoreOutputsAPI;
import net.neoforged.fml.common.Mod;

@Mod(MoreOutputsAPI.MOD_ID)
public final class MoreOutputsAPINeoForge {
    public MoreOutputsAPINeoForge() {
        // Run our common setup.
        MoreOutputsAPI.init();
    }
}
