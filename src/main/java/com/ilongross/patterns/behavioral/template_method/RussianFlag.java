package com.ilongross.patterns.behavioral.template_method;

public class RussianFlag extends Flag{
    @Override
    public void draw() {
        drawFlagPole();
        DrawFlagColors.drawWhite();
        DrawFlagColors.drawBlue();
        DrawFlagColors.drawRed();
    }
}
