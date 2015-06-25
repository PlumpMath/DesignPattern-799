package com.example.designpattern.abstractfactory.red;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.ITextColor;

/**
 * 黑色字体
 */
public class TextBlackColor implements ITextColor {
    @Override
    public int getTextColor() {
        return Color.BLACK;
    }
}
