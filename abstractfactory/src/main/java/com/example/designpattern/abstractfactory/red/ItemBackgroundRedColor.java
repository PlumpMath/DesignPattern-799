package com.example.designpattern.abstractfactory.red;

import android.graphics.Color;

import com.example.designpattern.abstractfactory.IItemBackgroundColor;

/**
 * 红色背景
 */
public class ItemBackgroundRedColor implements IItemBackgroundColor {
    @Override
    public int getItemColor() {
        return Color.RED;
    }
}
