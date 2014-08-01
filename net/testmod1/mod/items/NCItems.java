package net.testmod1.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.testmod1.mod.testmod1;

public class NCItems extends Item{
	public NCItems(){
		this.setCreativeTab(testmod1.Wuhcraft);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(testmod1.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
