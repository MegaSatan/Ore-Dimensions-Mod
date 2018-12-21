package mod.Mega_CS.oredim.world.biomes;

import mod.Mega_CS.oredim.init.BiomeInit;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProviderCoal extends BiomeProviderSingle {
	public BiomeProviderCoal() {
		super(BiomeInit.COAL_DIMENSION);
        
        // DEBUG
        System.out.println("Constructing BiomeProviderCloud");
	}
}
