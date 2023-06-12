package com.mrcrayfish.controllable.client.gui;

import com.mrcrayfish.controllable.Controllable;
import com.mrcrayfish.controllable.client.gui.screens.ControllerLayoutScreen;
import com.mrcrayfish.controllable.client.input.Controller;
import net.minecraft.client.gui.GuiGraphics;

/**
 * Author: MrCrayfish
 */
public class ControllerAxis extends ControllerButton
{
    public ControllerAxis(ControllerLayoutScreen screen, int button, int x, int y, int u, int v, int width, int height, int scale)
    {
        super(screen, button, x, y, u, v, width, height, scale);
    }

    @Override
    public void draw(GuiGraphics graphics, int x, int y, int mouseX, int mouseY, boolean selected)
    {
        graphics.pose().pushPose();
        Controller controller = Controllable.getController();
        if(controller != null)
        {
            /*GLFWGamepadState gamepad = controller.getGamepadState();
            switch(this.button)
            {
                case Buttons.LEFT_THUMB_STICK ->
                {
                    float leftX = gamepad.axes(this.screen.getEntry().isThumbsticksSwitched() ? GLFW.GLFW_GAMEPAD_AXIS_RIGHT_X : GLFW.GLFW_GAMEPAD_AXIS_LEFT_X);
                    float leftY = gamepad.axes(this.screen.getEntry().isThumbsticksSwitched() ? GLFW.GLFW_GAMEPAD_AXIS_RIGHT_Y : GLFW.GLFW_GAMEPAD_AXIS_LEFT_Y);
                    leftX *= this.screen.getEntry().isFlipLeftX() ? -1 : 1;
                    leftY *= this.screen.getEntry().isFlipLeftY() ? -1 : 1;
                    poseStack.translate(leftX * 5, leftY * 5, 0);
                }
                case Buttons.RIGHT_THUMB_STICK ->
                {
                    float rightX = gamepad.axes(this.screen.getEntry().isThumbsticksSwitched() ? GLFW.GLFW_GAMEPAD_AXIS_LEFT_X : GLFW.GLFW_GAMEPAD_AXIS_RIGHT_X);
                    float rightY = gamepad.axes(this.screen.getEntry().isThumbsticksSwitched() ? GLFW.GLFW_GAMEPAD_AXIS_LEFT_Y : GLFW.GLFW_GAMEPAD_AXIS_RIGHT_Y);
                    rightX *= this.screen.getEntry().isFlipRightX() ? -1 : 1;
                    rightY *= this.screen.getEntry().isFlipRightY() ? -1 : 1;
                    poseStack.translate(rightX * 5, rightY * 5, 0);
                }
            }*/

            if(!this.screen.isButtonPressed(this.button))
            {
                graphics.pose().translate(0, -5, 0);
            }
        }
        super.draw(graphics, x, y, mouseX, mouseY, selected);
        graphics.pose().popPose();
    }
}
