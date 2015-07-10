package wehavecookies56.tutorials.network;

import wehavecookies56.tutorials.blocks._Blocks;
import wehavecookies56.tutorials.items._Items;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		registerRenders();
	}

	public void registerRenders(){
		_Items.registerRenders();
		_Blocks.registerRenders();
	}
}
