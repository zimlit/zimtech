package com.zimlit.zimtech.block;

import com.zimlit.zimtech.item.RockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {
    public static final Block FLINT_COBBLE = new Cobble(FabricBlockSettings.create());

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier("zimtech", "flint_cobble"), FLINT_COBBLE);
        Registry.register(Registries.ITEM, new Identifier("zimtech", "flint_cobble"), new RockItem(FLINT_COBBLE, 7, new FabricItemSettings()));
    }
}
