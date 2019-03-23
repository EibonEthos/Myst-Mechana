package com.eibon.mystmechana.util.handlers;

import com.eibon.mystmechana.init.BlockInit;
import com.eibon.mystmechana.init.ItemInit;
import com.eibon.mystmechana.util.interfaces.IHasModel;
import com.eibon.mystmechana.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void OnItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.Items.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void OnBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.Blocks.toArray(new Block[0]));
	}
	@SubscribeEvent
	public static void OnModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.Items)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : BlockInit.Blocks)
		{
			if (block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	public static void OtherRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
	}
}
