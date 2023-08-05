package com.zimlit.zimtech;

import com.zimlit.zimtech.block.BlockInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zimtech implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("zimtech");
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.main"))
            .entries((context, entries) -> {
                entries.add(BlockInit.FLINT_COBBLE);
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("zimtech", "main_group"), ITEM_GROUP);
        BlockInit.register();
    }
}
