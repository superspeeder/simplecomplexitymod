package org.delusion.superspeeder.siplecomplexity.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.delusion.superspeeder.siplecomplexity.mod.proxy.CommonProxy;

/**
 * Created by games2 on 11/4/17.
 */

@Mod(useMetadata =true, modid=Reference.modid,name=Reference.name,version=Reference.version)
public class SimpleComplexity {

    @SidedProxy(clientSide = "org.delusion.superspeeder.siplecomplexity.mod.proxy.ClientProxy", serverSide = "org.delusion.superspeeder.siplecomplexity.mod.proxy.ServerProxy")
    public CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
