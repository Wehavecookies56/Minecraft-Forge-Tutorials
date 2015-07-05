package wehavecookies56.tutorials;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import wehavecookies56.tutorials.blocks._Blocks;
import wehavecookies56.tutorials.items._Items;
import wehavecookies56.tutorials.lib.Reference;
import wehavecookies56.tutorials.network.CommonProxy;

@Mod(modid = Reference.ID, version = Reference.ID, name = Reference.NAME)
public class TutorialMod {

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
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
