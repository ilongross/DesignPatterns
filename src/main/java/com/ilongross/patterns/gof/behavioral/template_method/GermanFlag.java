package com.ilongross.patterns.gof.behavioral.template_method;

public class GermanFlag extends Flag{
    @Override
    public void draw() {
        drawFlagPole();
        DrawFlagColors.drawBlack();
        DrawFlagColors.drawRed();
        DrawFlagColors.drawYellow();
    }
}
