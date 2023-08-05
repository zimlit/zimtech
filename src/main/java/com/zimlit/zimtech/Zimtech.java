package com.zimlit.zimtech;

import com.zimlit.zimtech.block.BlockInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zimtech implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("zimtech");

    @Override
    public void onInitialize() {
        BlockInit.register();
    }
}
