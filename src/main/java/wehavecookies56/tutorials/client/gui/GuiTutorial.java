package wehavecookies56.tutorials.client.gui;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.tutorials.items._Items;
import wehavecookies56.tutorials.lib.Reference;

public class GuiTutorial extends GuiScreen {

	ResourceLocation texture = new ResourceLocation(Reference.ID, "textures/gui/tutorialgui.png");

	int guiWidth = 117;
	int guiHeight = 65;

	final int BUTTON_1 = 0;

	GuiButton button1;

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.renderEngine.bindTexture(texture);
		int guiPosX = (width - guiWidth) / 2;
		int guiPosY = (height - guiHeight) / 2;
		this.drawDefaultBackground();
		this.drawTexturedModalRect(guiPosX, guiPosY, 0, 0, guiWidth, guiHeight);
		this.drawString(fontRendererObj, "Gui Tutorial", guiPosX + 2, guiPosY + 2, 0xFFFFFF);
		this.itemRender.renderItemAndEffectIntoGUI(new ItemStack(_Items.tutorialItem), guiPosX + 2, guiPosY + 2);
		updateButtons();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	public void updateButtons(){
		//button1.enabled = true;
		//button1.visible = false;
	}

	@Override
	public void initGui() {
		this.buttonList.clear();
		int guiPosX = (width - guiWidth) / 2;
		int guiPosY = (height - guiHeight) / 2;
		this.buttonList.add(button1 = new GuiButton(BUTTON_1, guiPosX + guiWidth / 2 - 25, guiPosY + guiHeight / 2, 60, 20, "Click here"));
		updateButtons();
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch(button.id){
		case BUTTON_1:
			button1.displayString = "Clicked!";
			break;
		}
		updateButtons();
		super.actionPerformed(button);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}
}
