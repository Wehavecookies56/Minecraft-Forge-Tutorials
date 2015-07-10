package wehavecookies56.tutorials.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import wehavecookies56.tutorials.lib.Reference;
import wehavecookies56.tutorials.lib.Strings;

public class _Items {

	public static Item tutorialItem;

	/**
	 * Method used for initialising items
	 */
	public static void init(){
		tutorialItem = new ItemTutorialItem().setUnlocalizedName(Strings.tutorialItem).setCreativeTab(CreativeTabs.tabMaterials);
	}

	/**
	 * Method used for registering items
	 */
	public static void register(){
		GameRegistry.registerItem(tutorialItem, Strings.tutorialItem);
	}

	public static void registerRenders(){
		registerRender(tutorialItem);
	}

	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
