package me.lilyth;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;

@Mod(
        modid = ExampleMod.MODID,
        name = ExampleMod.MOD_NAME,
        version = ExampleMod.VERSION,
        clientSideOnly = true,
        acceptedMinecraftVersions = ExampleMod.MC_VERSION
)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String MOD_NAME = "ExampleMod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "1.8.9";
    public static ExampleMod instance;

    public ExampleMod() {
        instance = this;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Mod has been successfully Initialized!");
    }

    public static ExampleMod getInstance() {
        return instance;
    }
}