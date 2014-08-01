package net.testmod1.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.testmod1.mod.testmod1;

public class ToothbrushBlock extends Block {

	public ToothbrushBlock(Material material) {
		super(material);
		
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(testmod1.Wuhcraft);
	}

}
