package mod.Mega_CS.oredim.init;

import javax.annotation.Nullable;

import mod.Mega_CS.oredim.world.dimension.coal.DimensionCoalOreDim;
import mod.Mega_CS.oredim.world.dimension.coal.WorldTypeCoal;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
	
	protected World world;
	
	public static final String COAL_NAME = "coal";
	public static final int COAL_DIM_ID = findFreeDimensionID();
	public static final DimensionType COAL_ORE_DIM = DimensionType.register(COAL_NAME, "_" + COAL_NAME, COAL_DIM_ID, DimensionCoalOreDim.class, false);
	public static final WorldType COAL_WORLD_TYPE = new WorldTypeCoal();
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(COAL_DIM_ID, COAL_ORE_DIM);
	}
	
	@Nullable
	private static Integer findFreeDimensionID() {
		for(int i = 2; i<Integer.MAX_VALUE; i++) {
			if(!DimensionManager.isDimensionRegistered(i)) {
				System.out.println("Found free dimension ID = " + i);
				return i;
			}
		}
		
		System.out.println("ERROR: Could not find free dimension ID");
		return null;
	}
}
