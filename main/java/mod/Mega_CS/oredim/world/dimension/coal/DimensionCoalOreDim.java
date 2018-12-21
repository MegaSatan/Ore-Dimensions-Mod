package mod.Mega_CS.oredim.world.dimension.coal;

import mod.Mega_CS.oredim.init.BiomeInit;
import mod.Mega_CS.oredim.init.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionCoalOreDim extends WorldProvider{
	public DimensionCoalOreDim() {
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.COAL_DIMENSION);
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionInit.COAL_ORE_DIM;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorCoal(world);
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return true;
	}
	
	@Override
	public boolean canDoLightning(Chunk chunk) {
		return false;
	}
	
	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}
	
	@Override
	public BiomeProvider getBiomeProvider() {
		return new BiomeProviderSingle(BiomeInit.COAL_DIMENSION);
	}
}
