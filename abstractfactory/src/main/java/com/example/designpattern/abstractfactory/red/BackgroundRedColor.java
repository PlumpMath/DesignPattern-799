package com.example.designpattern.abstractfactory.red;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.IBackgroundColor;

/**
 * 红色背景
 */
public class BackgroundRedColor implements IBackgroundColor {
    @Override
    public int getColor() {
        return Color.RED;
    }
}
