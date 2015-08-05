package wehavecookies56.tutorials.network;

import net.minecraft.client.Minecraft;
import wehavecookies56.tutorials.blocks._Blocks;
import wehavecookies56.tutorials.client.gui.GuiTutorial;
import wehavecookies56.tutorials.items._Items;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		registerRenders();
	}

	@Override
	public void displayGuiTutorial() {
		Minecraft.getMinecraft().displayGuiScreen(new GuiTutorial());
	}

	public void registerRenders(){
		_Items.registerRenders();
		_Blocks.registerRenders();
	}

}
