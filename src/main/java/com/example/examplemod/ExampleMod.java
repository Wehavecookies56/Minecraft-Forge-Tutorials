package com.example.examplemod;

import com.example.examplemod.core.proxies.CommonProxy;
import com.example.examplemod.lib.Reference;
import com.example.examplemod.util.LogHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class ExampleMod {
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY, modId = Reference.MODID)
	public static CommonProxy proxy;
	
	public static LogHelper log;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e){
		log.info("Proxy Pre Initialization");
		proxy.preInit();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e){
		log.info("Proxy Initialization");
		proxy.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e){
		log.info("Proxy Post Initialization");
		proxy.postInit();
	}
	
}