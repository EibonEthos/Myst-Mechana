package com.eibon.mystmechana.objects.tools;

import com.eibon.mystmechana.Main;
import com.eibon.mystmechana.init.ItemInit;
import com.eibon.mystmechana.util.interfaces.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class PickAxeBase extends ItemPickaxe implements IHasModel
{
	
	public PickAxeBase(String name, ToolMaterial material) 
	{
		super(material);
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
