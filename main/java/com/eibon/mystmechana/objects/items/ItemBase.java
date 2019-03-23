package com.eibon.mystmechana.objects.items;

import com.eibon.mystmechana.Main;
import com.eibon.mystmechana.init.ItemInit;
import com.eibon.mystmechana.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mystmechanatab);
		
		ItemInit.Items.add(this);
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
