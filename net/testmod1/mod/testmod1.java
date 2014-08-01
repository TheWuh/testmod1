package net.testmod1.mod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.testmod1.mod.blocks.DentalOre;
import net.testmod1.mod.blocks.ToothbrushBlock;
import net.testmod1.mod.items.NCItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = testmod1.modid, version = testmod1.version)
public class testmod1 
{
	
	public static final String modid = "testmod1";
	public static final String version = "Alpha v0.1";
	
	public static CreativeTabs Wuhcraft;
	
	//item declarations
	public static Item itemToothbrush;
	public static Block oreDentalOre;
	public static Block blockToothbrushBlock;
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent)
	{
		//creative tab
		Wuhcraft = new CreativeTabs("Wuhcraft") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(testmod1.oreDentalOre);
			}
	};
	
		//item registration
	
		itemToothbrush = new NCItems().setUnlocalizedName("Toothbrush");
		GameRegistry.registerItem(itemToothbrush, "Toothbrush");
		
		oreDentalOre = new DentalOre(Material.rock).setBlockName("Dental Ore");
		GameRegistry.registerBlock(oreDentalOre, "Dental Ore");
		
		blockToothbrushBlock = new ToothbrushBlock(Material.iron).setBlockName("Toothbrush Block");
		GameRegistry.registerBlock(blockToothbrushBlock,"ToothbrushBlock");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{	//recipes
		
		
		
		
		//smelting
		GameRegistry.addSmelting(oreDentalOre, new ItemStack(itemToothbrush, 2), 0.0F);
		
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent)
	{
		
	}
}
