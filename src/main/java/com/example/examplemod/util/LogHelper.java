package com.example.examplemod.util;

import org.apache.logging.log4j.Level;

import com.example.examplemod.lib.Reference;

import net.minecraftforge.fml.common.FMLLog;

public class LogHelper {

	public static void info(Object object){
		FMLLog.log(Reference.MODID, Level.INFO, String.valueOf(object));
	}
	
	public static void error(Object object){
		FMLLog.log(Reference.MODID, Level.ERROR, String.valueOf(object));
	}
	
	public static void debug(Object object){
		FMLLog.log(Reference.MODID, Level.DEBUG, String.valueOf(object));
	}
	
	public static void fatal(Object object){
		FMLLog.log(Reference.MODID, Level.FATAL, String.valueOf(object));
	}
	
}
