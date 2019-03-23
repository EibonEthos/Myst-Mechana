package com.eibon.mystmechana.init;

import java.util.ArrayList;
import java.util.List;

import com.eibon.mystmechana.objects.armor.ArmorBase;
import com.eibon.mystmechana.objects.items.ItemBase;
import com.eibon.mystmechana.objects.tools.AxeBase;
import com.eibon.mystmechana.objects.tools.HoeBase;
import com.eibon.mystmechana.objects.tools.PickAxeBase;
import com.eibon.mystmechana.objects.tools.ShovelBase;
import com.eibon.mystmechana.objects.tools.SwordBase;
import com.eibon.mystmechana.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> Items = new ArrayList<Item>();
	
	//ToolMaterials
	public static final ToolMaterial TOOL_NARA = EnumHelper.addToolMaterial("tool_nara", 4, 3000, 10.0F, 4.0F, 4);
	
	//ArmorMaterials
	public static final ArmorMaterial ARMOR_DERETHENI = EnumHelper.addArmorMaterial("armor_deretheni", Reference.MODID + ":deretheni", 50, new int[]{7, 7, 14, 7}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
	
	//Items
	public static final Item ITEM_NARA = new ItemBase("item_nara");
	public static final Item ITEM_DNI_HANDLE = new ItemBase("item_dni_handle");
	public static final Item ITEM_DERETHENI = new ItemBase("item_deretheni");
	public static final Item ITEM_GSLAG = new ItemBase("item_gslag");
	public static final Item ITEM_ASLAG = new ItemBase("item_aslag");
	public static final Item ITEM_DSLAG = new ItemBase("item_dslag");
	public static final Item ITEM_MSLAG = new ItemBase("item_mslag");
	
	//Tools
	public static final Item TOOL_DNI_SWORD = new SwordBase("tool_dni_sword",TOOL_NARA);
	public static final Item TOOL_DNI_AXE = new AxeBase("tool_dni_axe", TOOL_NARA);
	public static final Item TOOL_DNI_PICKAXE = new PickAxeBase("tool_dni_pickaxe", TOOL_NARA);
	public static final Item TOOL_DNI_SHOVEL = new ShovelBase("tool_dni_shovel", TOOL_NARA);
	public static final Item TOOL_DNI_HOE = new HoeBase("tool_dni_hoe", TOOL_NARA);
	
	//Armor
	public static final Item ARMOR_MAINTAIN_HELM = new ArmorBase("armor_maintain_helm", ARMOR_DERETHENI, 1, EntityEquipmentSlot.HEAD);
	public static final Item ARMOR_MAINTAIN_CHEST = new ArmorBase("armor_maintain_chest", ARMOR_DERETHENI, 1, EntityEquipmentSlot.CHEST);
	public static final Item ARMOR_MAINTAIN_BOOTS = new ArmorBase("armor_maintain_boots", ARMOR_DERETHENI, 1, EntityEquipmentSlot.FEET);
	public static final Item ARMOR_MAINTAIN_LEGS = new ArmorBase("armor_maintain_legs", ARMOR_DERETHENI, 2, EntityEquipmentSlot.LEGS);
}
