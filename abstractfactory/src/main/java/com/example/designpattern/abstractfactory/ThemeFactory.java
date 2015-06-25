package com.example.designpattern.abstractfactory;

/**
 * 主题抽象工厂
 */
public interface ThemeFactory {
    IBackgroundColor getBackgroundColor();
    IItemBackgroundColor getItemBackgroundColor();
    ITextColor getTextColor();
}
