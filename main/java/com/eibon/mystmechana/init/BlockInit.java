package com.eibon.mystmechana.init;

import java.util.ArrayList;
import java.util.List;

import com.eibon.mystmechana.objects.blocks.BlockBase;
import com.eibon.mystmechana.objects.blocks.machines.compressor.BlockAtomCompressor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> Blocks = new ArrayList<Block>();
	
	public static final Block BLOCK_NARA = new BlockBase("block_nara", Material.IRON);
	
	//ORES
	public static final Block ORE_NETHER_DERETHENI = new BlockBase("ore_nether_deretheni", Material.IRON);
	public static final Block ORE_END_DERETHENI = new BlockBase("ore_end_deretheni", Material.IRON);
	public static final Block ORE_OVERWORLD_DERETHENI = new BlockBase("ore_overworld_deretheni", Material.IRON);
	
	
	//Machines
	public static final Block ATOM_COMPRESSOR = new BlockAtomCompressor("atomcompressor");
	
	
	//generators
	//public static final Block ORE_END = new BlockOre("ore_end", "end");
	//public static final Block ORE_OVERWORLD = new BlockOre("ore_overworld", "overworld");
	//public static final Block ORE_NETHER = new BlockOre("ore_nether", "nether");
}
