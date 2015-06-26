package com.example.designpattern.abstractfactory.red;

import com.example.designpattern.abstractfactory.IBackgroundColor;
import com.example.designpattern.abstractfactory.IItemBackgroundColor;
import com.example.designpattern.abstractfactory.ITextColor;
import com.example.designpattern.abstractfactory.IThemeFactory;

/**
 * 红色主题
 */
public class RedThemeFactory implements IThemeFactory {
    @Override
    public IBackgroundColor getBackgroundColor() {
        return new BackgroundRedColor();
    }

    @Override
    public IItemBackgroundColor getItemBackgroundColor() {
        return new ItemBackgroundRedColor();
    }

    @Override
    public ITextColor getTextColor() {
        return new TextBlackColor();
    }
}
