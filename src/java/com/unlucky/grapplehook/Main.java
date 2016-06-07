
package com.unlucky.grapplehook;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)


public class Main {

    public static final String MODID = "grapplehook";
    public static final String MODNAME = "Grapple Hook";
    public static final String VERSION = "0.0.1";

        
    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide="com.unlucky.grapplehook.ClientProxy", serverSide="com.unlucky.grapplehook.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	instance = this;
    	proxy.preInit(e);
    };
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}