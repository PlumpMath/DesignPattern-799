package com.example.designpattern.builder;

import android.content.Context;
import android.view.View;

import org.json.JSONException;

/**
 * 文本转换接口
 * Created by wanglx on 15/10/10.
 */
public abstract class ITextConverter {

    protected Context mContext;

    public ITextConverter(Context context) {
        mContext = context;
    }

    /**
     * 转换一级标题
     * @param h1 一级标题
     */
    public abstract void convertH1(String h1) throws JSONException;

    /**
     * 转换二级标题
     * @param h2 二级标题
     */
    public abstract void convertH2(String h2) throws JSONException;

    /**
     * 转换三级标题
     * @param h3 三级标题
     */
    public abstract void convertH3(String h3) throws JSONException;

    /**
     * 转换正文段落
     */
    public abstract void convertP(String p) throws JSONException;

    /**
     * 转换图片
     * @param image 图片链接
     */

    public void convertImage(String image) throws JSONException {}

    /**
     * 获取转换结果
     * @return 结果view
     */
    public abstract View getResult();

    /**
     * 清除结果
     */
    public abstract void clear();
}
