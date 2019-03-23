package com.eibon.mystmechana.init;

//import com.eibon.mystmechana.util.handlers.EnumHandler;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting 
{
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, (int) (1), 3), new ItemStack(ItemInit.ITEM_DSLAG), 1f);
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, (int) (1), 5), new ItemStack(ItemInit.ITEM_ASLAG), 1f);
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, (int) (1), 1), new ItemStack(ItemInit.ITEM_GSLAG), 1f);
		GameRegistry.addSmelting(ItemInit.ITEM_MSLAG, new ItemStack(ItemInit.ITEM_NARA), 1F);
		GameRegistry.addSmelting(BlockInit.ORE_END_DERETHENI, new ItemStack(ItemInit.ITEM_DERETHENI), 10f);
		GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD_DERETHENI, new ItemStack(ItemInit.ITEM_DERETHENI), 10f);
		GameRegistry.addSmelting(BlockInit.ORE_NETHER_DERETHENI, new ItemStack(ItemInit.ITEM_DERETHENI), 10f);
	}
}
