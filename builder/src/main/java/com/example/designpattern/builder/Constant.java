package com.example.designpattern.builder;

/**
 * 常量类
 * Created by wanglx on 15/10/10.
 */

@SuppressWarnings("unused")
public class Constant {
    /**
     * 类型
     */
    public static final String H1 = "h1";
    public static final String H2 = "h2";
    public static final String H3 = "h3";
    public static final String P = "p";
    public static final String IMAGE = "img";

    /**
     * 标签
     */
    public static final String TYPE = "type";//节点类型
    public static final String TEXT = "text";//文案
    public static final String COLOR = "color";//字体颜色
    public static final String ALIGN = "align";//对齐方式

    /**
     * 对齐方式
     */
    public static final String ALIGN_LEFT = "left";//左对齐
    public static final String ALIGN_RIGHT = "right";//右对齐
    public static final String ALIGN_CENTER = "center";//居中对齐

    /**
     * 转换器类型
     */
    public static final int TEXT_CONVERTER = 1;//纯文本转换器
    public static final int STYLE_TEXT_CONVERTER = 2;//带样式文本转换器
    public static final int PROPERTY_TREE_CONVERTER = 3;//属性树

}
