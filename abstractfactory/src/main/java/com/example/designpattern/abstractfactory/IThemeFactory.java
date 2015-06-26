package com.example.designpattern.abstractfactory;

/**
 * 主题抽象工厂
 */
public interface IThemeFactory {
    IBackgroundColor getBackgroundColor();
    IItemBackgroundColor getItemBackgroundColor();
    ITextColor getTextColor();
}
