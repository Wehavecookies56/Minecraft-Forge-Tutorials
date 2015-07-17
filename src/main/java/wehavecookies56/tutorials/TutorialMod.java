package wehavecookies56.tutorials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import wehavecookies56.tutorials.blocks._Blocks;
import wehavecookies56.tutorials.creativetab.CreativeTabTutorial;
import wehavecookies56.tutorials.items._Items;
import wehavecookies56.tutorials.lib.Reference;
import wehavecookies56.tutorials.lib.Strings;
import wehavecookies56.tutorials.network.CommonProxy;

@Mod(modid = Reference.ID, version = Reference.ID, name = Reference.NAME)
public class TutorialMod {

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    	tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), Strings.tabTutorial);
    	_Items.init();
    	_Items.register();
    	_Blocks.init();
    	_Blocks.register();
    	proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
