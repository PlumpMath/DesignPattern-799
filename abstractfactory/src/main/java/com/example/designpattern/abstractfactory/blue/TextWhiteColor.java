package com.example.designpattern.abstractfactory.blue;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.ITextColor;

/**
 * 白色字体
 */
public class TextWhiteColor implements ITextColor {
    @Override
    public int getTextColor() {
        return Color.WHITE;
    }
}
