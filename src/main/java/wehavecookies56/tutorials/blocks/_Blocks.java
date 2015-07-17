package wehavecookies56.tutorials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import wehavecookies56.tutorials.TutorialMod;
import wehavecookies56.tutorials.lib.Reference;
import wehavecookies56.tutorials.lib.Strings;

public class _Blocks {

	public static Block tutorialBlock;


	/**
	 * Method used for initialising blocks
	 */
	public static void init(){
		tutorialBlock = new BlockTutorial(Material.iron, 1.0f, 1.0f, Strings.tutorialBlock).setCreativeTab(TutorialMod.tabTutorial);
	}

	/**
	 * Method used for registering blocks
	 */
	public static void register(){
		GameRegistry.registerBlock(tutorialBlock, Strings.tutorialBlock);
	}

	public static void registerRenders(){
		registerRender(tutorialBlock);
	}

	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
