package uk.co.wehavecookies56.minecraftforgetutorials;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.wehavecookies56.minecraftforgetutorials.proxies.CommonProxy;

@Mod(name = "Minecraft Forge Tutorials", modid = "mft", version = "1.0")
public class MinecraftForgeTutorials {

    @SidedProxy(clientSide = "uk.co.wehavecookies56.minecraftforgetutorials.proxies.ClientProxy", serverSide = "uk.co.wehavecookies56.minecraftforgetutorials.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
