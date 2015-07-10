package wehavecookies56.tutorials.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemTutorialItem extends Item {

	public ItemTutorialItem() {}


	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.add(StatCollector.translateToLocal("item.tutorialitem.desc"));
	}

}
