package com.ilongross.patterns.behavioral.template_method;

public class GermanFlag extends Flag{
    @Override
    public void draw() {
        drawFlagPole();
        DrawFlagColors.drawBlack();
        DrawFlagColors.drawRed();
        DrawFlagColors.drawYellow();
    }
}
