package mod.Mega_CS.oredim.world.dimension.diamond;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionDiamondOreDim extends WorldProvider{
	
	public DimensionDiamondOreDim() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DimensionType getDimensionType() {
		return null;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return super.createChunkGenerator();
	}
	
	@Override
	public boolean canRespawnHere() {
		return super.canRespawnHere();
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return super.isSurfaceWorld();
	}
	
}
