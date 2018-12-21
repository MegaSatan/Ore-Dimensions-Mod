package mod.Mega_CS.oredim.init;

import java.util.ArrayList;
import java.util.List;

import mod.Mega_CS.oredim.objects.items.IgniterBase;
import net.minecraft.item.Item;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item COAL_IGNITER = new IgniterBase("igniter_coal", "coal");
	public static final Item DIAMOND_IGNITER = new IgniterBase("igniter_diamond", "diamond");
	public static final Item EMERALD_IGNITER = new IgniterBase("igniter_emerald", "emerald");
	public static final Item GOLD_IGNITER = new IgniterBase("igniter_gold", "gold");
	public static final Item IRON_IGNITER = new IgniterBase("igniter_iron", "iron");
	public static final Item LAPIS_IGNITER = new IgniterBase("igniter_lapis", "lapis");
	public static final Item QUARTZ_IGNITER = new IgniterBase("igniter_quartz", "quartz");
	public static final Item REDSTONE_IGNITER = new IgniterBase("igniter_redstone", "redstone");
}
