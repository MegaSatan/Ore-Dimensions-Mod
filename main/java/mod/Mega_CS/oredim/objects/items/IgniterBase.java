package mod.Mega_CS.oredim.objects.items;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;



public class IgniterBase extends ItemBase{

	private String material;
	
	public IgniterBase(String name, String mat) {
		super(name);
		material = mat;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack item = player.getHeldItem(hand);
		switch(this.material) {
		
		case "coal":
			break;
			
		case "diamond":
			break;
			
		case "emerald":
			break;
			
		case "gold":
			break;
			
		case "iron":
			break;
			
		case "lapis":
			break;
			
		case "quartz":
			break;
			
		case "redstone":
			break;
		}
		
		item.damageItem(1, player);
		return EnumActionResult.SUCCESS;
	}
}
