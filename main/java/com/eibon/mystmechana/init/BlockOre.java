package com.eibon.mystmechana.init;

//import com.eibon.mystmechana.Main;
//import com.eibon.mystmechana.objects.blocks.item.ItemBlockVarients;
//import com.eibon.mystmechana.util.handlers.EnumHandler;
//import com.eibon.mystmechana.util.handlers.EnumHandler.EnumType;
import com.eibon.mystmechana.util.interfaces.IHasModel;
import com.eibon.mystmechana.util.interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//import net.minecraft.block.properties.IProperty;
//import net.minecraft.block.properties.PropertyEnum;
//import net.minecraft.block.state.BlockStateContainer;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.NonNullList;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.RayTraceResult;
//import net.minecraft.world.World;

public class BlockOre extends Block implements IHasModel, IMetaName
{

	public BlockOre(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}
	//public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumType>create("variant", EnumHandler.EnumType.class); 

	@Override
	public String getSpecialName(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}
	
	//@SuppressWarnings("unused")
	//private String name, dimension;
	
	//public BlockOre(String name, String dimension)
	//{
		//super(Material.ROCK);
		//setUnlocalizedName(name);
		//setRegistryName(name);
		//setCreativeTab(Main.mystmechanatab);
		//setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.DERETHENI));
		
		//this.name = name;
		//this.dimension = dimension;
		
		//BlockInit.Blocks.add(this);
		//ItemInit.Items.add(new ItemBlockVarients(this).setRegistryName(this.getRegistryName()));
	//}
	
	//@Override
	//public int damageDropped(IBlockState state) 
	//{
		//return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	//}
	//@Override
	//public int getMetaFromState(IBlockState state) 
	//{
		//return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	//}
	//@Override
	//public IBlockState getStateFromMeta(int meta) 
	//{
		//return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetaData(meta));
	//}
	//@Override
	//public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
		//EntityPlayer player) 
	//{
		//return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	//}
	//@Override
	//public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	//{
		//for(EnumHandler.EnumType varient : EnumHandler.EnumType.values())
		//{
			///items.add(new ItemStack(this, 1, varient.getMeta()));
		//}
	//}
	//@Override
	//protected BlockStateContainer createBlockState() 
	//{
		//return new BlockStateContainer(this, new IProperty[] {VARIANT});
	//}
	//@Override
	//public String getSpecialName(ItemStack stack) 
	//{
		//return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	//}
	//@Override
	//public void registerModels()
	//{
		//for(int i = 0; i < EnumHandler.EnumType.values().length; i++)
		//{
			//Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore" + "_" + this.dimension + "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		//}
	//}
}



