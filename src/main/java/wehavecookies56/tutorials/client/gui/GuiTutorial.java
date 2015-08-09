package wehavecookies56.tutorials.client.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.tutorials.lib.Reference;

public class GuiTutorial extends GuiScreen {

	ResourceLocation texture = new ResourceLocation(Reference.ID, "textures/gui/tutorialgui.png");

	int textureW = 117;
	int textureH = 65;

	int backgroundU = 0;
	int backgroundV = 0;

	int button2U = 117;
	int button2V = 0;

	int button2U_H = 117;
	int button2V_H = 7;

	int button2_W = 7;
	int button2_H = 7;

	GuiButton button1;
	GuiButtonTexturedButton button2;

	final int BUTTON1_ID = 0, BUTTON2_ID = 1;

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);

		int centreX = width / 2;
		int centreY = height / 2;

		drawTexturedModalRect(centreX - (textureW / 2), centreY - (textureH / 2), backgroundU, backgroundV, textureW, textureH);
		drawString(fontRendererObj, "Tutorial Gui", centreX - (fontRendererObj.getStringWidth("Tutorial Gui") / 2), centreY - (fontRendererObj.FONT_HEIGHT / 2) - 25, 0xFFFFFF);
		button1.xPosition = centreX;
		button1.yPosition = centreY;
		super.drawScreen(mouseX, mouseY, partialTicks);

	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.add(button1 = new GuiButton(BUTTON1_ID, 0, 0, 60, 20, "Click here!"));
		buttonList.add(button2 = new GuiButtonTexturedButton(BUTTON2_ID, 0, 0, 7, 7));
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		if(Minecraft.getMinecraft().gameSettings.keyBindInventory.getKeyCode() == keyCode){
			Minecraft.getMinecraft().displayGuiScreen(null);
		}
		super.keyTyped(typedChar, keyCode);
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch(button.id){
		case BUTTON1_ID:
			button1.displayString = "Clicked";
			break;
		}
		super.actionPerformed(button);
	}

	public class GuiButtonTexturedButton extends GuiButton{

		public GuiButtonTexturedButton(int buttonId, int x, int y, int widthIn, int heightIn) {
			super(buttonId, x, y, widthIn, heightIn, "");
		}

		@Override
		public void drawButton(Minecraft mc, int x, int y) {
			if(visible){
				mc.renderEngine.bindTexture(texture);

				int u = button2U;
				int v = button2V;

				if(x >= this.xPosition && x <= this.xPosition + this.width && y >= this.yPosition && y <= this.yPosition + this.height){
					v = button2V_H;
				}else{
					v = button2V;
				}

				drawTexturedModalRect(this.xPosition, this.yPosition, u, v, 7, 7);
			}
		}

	}

}
