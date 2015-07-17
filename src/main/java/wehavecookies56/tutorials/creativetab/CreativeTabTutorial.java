package wehavecookies56.tutorials.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import wehavecookies56.tutorials.items._Items;

public class CreativeTabTutorial extends CreativeTabs {

	public CreativeTabTutorial(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return _Items.tutorialItem;
	}

}
