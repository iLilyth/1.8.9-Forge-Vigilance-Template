package me.lilyth;

import me.lilyth.config.ExampleCommand;
import me.lilyth.config.ExampleConfiguration;
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
    public static ExampleConfiguration exampleConfiguration;
    public ExampleMod() {
        instance=this;
        exampleConfiguration = new ExampleConfiguration();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Initialize and preload modules
        exampleConfiguration.preload();
        new ExampleCommand("dsnf").register();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        System.out.println("DSNE successfully Initialized!");
    }
    /////

    public static ExampleMod getInstance() {
        return instance;
    }
    public static ExampleConfiguration getConfig() {
        return exampleConfiguration;
    }
}
