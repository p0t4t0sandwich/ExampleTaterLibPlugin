package ca.sperrer.p0t4t0sandwich.template.forge;

import ca.sperrer.p0t4t0sandwich.template.common.Template;
import ca.sperrer.p0t4t0sandwich.template.forge.listeners.ForgeEventListener;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.*;

@Mod(ForgeMain.MODID)
public class ForgeMain {
    public Template template;
    public static final String MODID = "template";
    public static final Logger logger = LogUtils.getLogger();

    // Get server type
    public String getServerType() {
        if (isMagma()) {
            return "Magma";
        } else if (isMohist()) {
            return "Mohist";
        } else if (isArclight()) {
            return "Arclight";
        } else {
            return "Forge";
        }
    }

    // Singleton instance
    private static ForgeMain instance;

    public static ForgeMain getInstance() {
        return instance;
    }


    public ForgeMain() {
        // Singleton instance
        instance = this;

        logger.info("[Template]: Template is running on " + getServerType() + ".");

        // Start Template
        template = new Template("config", logger);
        template.start();

        // Register event listener
        MinecraftForge.EVENT_BUS.register(new ForgeEventListener());

        // Mod enable message
        logger.info("[Template]: Template has been enabled!");
    }
}
