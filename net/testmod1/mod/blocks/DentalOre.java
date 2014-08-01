package net.testmod1.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.testmod1.mod.testmod1;

public class DentalOre extends Block {

	public DentalOre(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(testmod1.Wuhcraft);
		
	}

	@SideOnly (Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(testmod1.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
	
	
}
