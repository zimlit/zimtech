package com.zimlit.zimtech.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RockItem extends BlockItem {
    private final int hardness;

    public RockItem(Block block, int hardness, Settings settings) {
        super(block, settings);
        this.hardness = hardness;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.literal(hardness +" ").append(Text.translatable("item.zimtech.flint_cobble.tooltip")));
    }
}