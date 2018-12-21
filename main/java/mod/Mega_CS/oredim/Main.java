package mod.Mega_CS.oredim;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import mod.Mega_CS.oredim.init.BiomeInit;
import mod.Mega_CS.oredim.init.DimensionInit;
import mod.Mega_CS.oredim.proxy.CommonProxy;
import mod.Mega_CS.oredim.tabs.OreDimensionsTab;
import mod.Mega_CS.oredim.util.*;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static final CreativeTabs modTab = new OreDimensionsTab("modtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		DimensionInit.registerDimensions();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		BiomeInit.registerBiomes();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
