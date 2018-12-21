package mod.Mega_CS.oredim.util.handlers;

import mod.Mega_CS.oredim.Main;
import mod.Mega_CS.oredim.init.BiomeInit;
import mod.Mega_CS.oredim.init.ItemInit;
import mod.Mega_CS.oredim.util.IHasModel;
import mod.Mega_CS.oredim.util.Reference;
import mod.Mega_CS.oredim.world.biomes.BiomeCoal;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		//event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0])); //unneeded unless blocks are added
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
		}
		/*for(Block block : BlockInit.BLOCKS) { //unneeded unless blocks are added
			if(block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}*/ 
	}
	
	@SubscribeEvent
    public static void onEvent(final RegistryEvent.Register<Biome> event)
    {
        final IForgeRegistry<Biome> registry = event.getRegistry();

        System.out.println("Registering biomes");
        
        registry.register(new BiomeCoal().setRegistryName(Reference.MODID, BiomeInit.COAL_DIMENSION.getBiomeName()));
    }
}
