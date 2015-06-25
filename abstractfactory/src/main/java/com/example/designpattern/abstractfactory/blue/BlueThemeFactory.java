package com.example.designpattern.abstractfactory.blue;

import com.example.designpattern.abstractfactory.IBackgroundColor;
import com.example.designpattern.abstractfactory.IItemBackgroundColor;
import com.example.designpattern.abstractfactory.ITextColor;
import com.example.designpattern.abstractfactory.ThemeFactory;

/**
 * 蓝色主题
 */
public class BlueThemeFactory implements ThemeFactory {
    @Override
    public IBackgroundColor getBackgroundColor() {
        return new BackgroundBuleColor();
    }

    @Override
    public IItemBackgroundColor getItemBackgroundColor() {
        return new ItemBackgroundBlueColor();
    }

    @Override
    public ITextColor getTextColor() {
        return new TextWhiteColor();
    }
}
