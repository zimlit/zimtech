package com.zimlit.zimtech.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

import javax.swing.text.html.BlockView;

public class Cobble extends Block {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 4.0D, 12.0D);
    public Cobble(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}

