package com.eibon.mystmechana;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.eibon.mystmechana.init.ModSmelting;
import com.eibon.mystmechana.proxy.CommonProxy;
import com.eibon.mystmechana.tabs.MystMechanaTab;
import com.eibon.mystmechana.util.Reference;
import com.eibon.mystmechana.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	public static final CreativeTabs mystmechanatab = new MystMechanaTab("mystmechanatab");
	
	@SidedProxy(clientSide = Reference.Client, serverSide = Reference.Common)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInt(FMLPreInitializationEvent event) 
	{
		RegistryHandler.OtherRegistries();
	}
	@EventHandler
	public static void Int(FMLInitializationEvent event)
	{
		ModSmelting.init();
	}
	@EventHandler
	public static void PostInt(FMLPostInitializationEvent event)
	{
		
	}
}
