package com.eibon.mystmechana.world.gen;

import java.util.Random;

import com.eibon.mystmechana.init.BlockInit;
//import com.eibon.mystmechana.init.BlockOre;
//import com.eibon.mystmechana.util.handlers.EnumHandler;

//import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_nether_deretheni, ore_end_deretheni, ore_overworld_deretheni;	
	
	public WorldGenCustomOres() 
	{
		ore_nether_deretheni =  new WorldGenMinable(BlockInit.ORE_NETHER_DERETHENI.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_deretheni =  new WorldGenMinable(BlockInit.ORE_END_DERETHENI.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_overworld_deretheni =  new WorldGenMinable(BlockInit.ORE_OVERWORLD_DERETHENI.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
	}	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			runGenerator(ore_nether_deretheni, world, random, chunkX, chunkZ, 50, 0, 100);
			break;
		case 0:
			runGenerator(ore_overworld_deretheni, world, random, chunkX, chunkZ, 50, 0, 100);
			break;
		case 1:
			runGenerator(ore_end_deretheni, world, random, chunkX, chunkZ, 50, 0, 256);
			break;
		}
	}
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || minHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int HeightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(HeightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
