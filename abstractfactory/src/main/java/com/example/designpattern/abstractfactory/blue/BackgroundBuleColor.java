package com.example.designpattern.abstractfactory.blue;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.IBackgroundColor;

/**
 * 蓝色
 */
public class BackgroundBuleColor implements IBackgroundColor {
    @Override
    public int getColor() {
        return Color.BLUE;
    }
}
