package com.eibon.mystmechana.objects.blocks.BlockExtensions;

import com.eibon.mystmechana.objects.blocks.BlockBase;

import net.minecraft.block.material.Material;

public class DeretheniOre extends BlockBase
{

	public DeretheniOre(String name, Material material) 
	{
		super(name, material);
		setHardness(15f);
		setLightLevel(-5f);
		setHarvestLevel("pickaxe", 3);
		
	}

}
