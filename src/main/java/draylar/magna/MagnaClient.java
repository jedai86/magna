package draylar.magna;

import draylar.omegaconfiggui.OmegaConfigGui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MagnaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Make sure you implement getModid in your config class!
        OmegaConfigGui.registerConfigScreen(Magna.CONFIG);
    }
}
