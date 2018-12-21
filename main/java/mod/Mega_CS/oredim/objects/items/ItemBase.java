package mod.Mega_CS.oredim.objects.items;

import mod.Mega_CS.oredim.Main;
import mod.Mega_CS.oredim.init.ItemInit;
import mod.Mega_CS.oredim.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modTab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
