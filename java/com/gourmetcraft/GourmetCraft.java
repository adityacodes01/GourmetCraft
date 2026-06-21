package com.gourmetcraft;

import com.gourmetcraft.registry.GourmetItems;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Gourmet Craft — mod entry point, wired to the proven Forge 26.2 (65.0.0) API
 * (same registration pattern as a known-good build). Registers a roster of
 * edible foods and a creative tab. Food = nutrition + saturation for now;
 * fantasy buff-on-eat effects are a follow-up via the consumable component.
 */
@Mod(GourmetCraft.MOD_ID)
public final class GourmetCraft {
    public static final String MOD_ID = "gourmetcraft";
    public static final Logger LOG = LogUtils.getLogger();

    public GourmetCraft(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();

        GourmetItems.ITEMS.register(modBusGroup);
        GourmetItems.CREATIVE_MODE_TABS.register(modBusGroup);

        LOG.info("Gourmet Craft loaded {} foods", GourmetItems.FOODS.size());
    }
}
