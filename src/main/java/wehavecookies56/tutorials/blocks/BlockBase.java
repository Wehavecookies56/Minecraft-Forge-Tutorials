package wehavecookies56.tutorials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

	public BlockBase(Material materialIn, float hardness, float resistance, String name) {
		super(materialIn);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setUnlocalizedName(name);
	}

}
