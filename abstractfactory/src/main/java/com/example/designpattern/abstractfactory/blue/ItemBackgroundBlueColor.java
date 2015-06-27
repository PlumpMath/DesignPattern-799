package com.example.designpattern.abstractfactory.blue;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.IItemBackgroundColor;

/**
 * 蓝色项背景
 */
public class ItemBackgroundBlueColor implements IItemBackgroundColor {
    @Override
    public int getItemColor() {
        return Color.BLUE;
    }
}
