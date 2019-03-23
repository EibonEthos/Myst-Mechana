package com.eibon.mystmechana.tabs;

import com.eibon.mystmechana.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MystMechanaTab extends CreativeTabs
{
	public MystMechanaTab (String label)
	{
	super("mystmechana"); 
	this.setBackgroundImageName("mystmechanalogo.png"); 
	}
	public ItemStack getTabIconItem() 
	{
	return new ItemStack(ItemInit.ITEM_DERETHENI);
	}
}
