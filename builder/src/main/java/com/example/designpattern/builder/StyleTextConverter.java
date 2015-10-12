package com.example.designpattern.builder;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 带样式的文本转换器
 * Created by wanglx on 15/10/10.
 */
public class StyleTextConverter extends ITextConverter {

    private WebView mWebView;
    private StringBuilder mStringBuilder;

    public StyleTextConverter(Context context) {
        super(context);
        mWebView = new WebView(mContext);
        mStringBuilder = new StringBuilder();
    }

    @Override
    public void convertH1(String h1) throws JSONException {
        JSONObject jsonObject = new JSONObject(h1);
        mStringBuilder.append("<h1 ").append(getStyle(jsonObject)).append(">")
                .append(jsonObject.getString(Constant.TEXT)).append("</h1>");
    }

    @Override
    public void convertH2(String h2) throws JSONException {
        JSONObject jsonObject = new JSONObject(h2);
        mStringBuilder.append("<h2 ").append(getStyle(jsonObject)).append(">")
                .append(jsonObject.getString(Constant.TEXT)).append("</h2>");
    }

    @Override
    public void convertH3(String h3) throws JSONException {
        JSONObject jsonObject = new JSONObject(h3);
        mStringBuilder.append("<h3 ").append(getStyle(jsonObject)).append(">")
                .append(jsonObject.getString(Constant.TEXT)).append("</h3>");
    }

    @Override
    public void convertP(String p) throws JSONException {
        JSONObject jsonObject = new JSONObject(p);
        mStringBuilder.append("<p ").append(getStyle(jsonObject)).append(">")
                .append(jsonObject.getString(Constant.TEXT)).append("</p>");
    }

    @Override
    public void convertImage(String image) throws JSONException {
        JSONObject jsonObject = new JSONObject(image);
        mStringBuilder.append("<img src=" + "\"").append(jsonObject.getString(Constant.TEXT))
                .append("\"").append(getStyle(jsonObject)).append("</img>");
    }

    private String getStyle(JSONObject jsonObject) throws JSONException {
        StringBuilder stringBuilder = new StringBuilder("style=\"");
        if(jsonObject.has(Constant.ALIGN)){
            String align = jsonObject.getString(Constant.ALIGN);
            stringBuilder.append("text-align:").append(align).append(";");
        }
        if(jsonObject.has(Constant.COLOR)){
            String color = jsonObject.getString(Constant.COLOR);
            stringBuilder.append("color:").append(color).append(";");
        }
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    @Override
    public View getResult() {
        mWebView.loadData(mStringBuilder.toString(), "text/html; charset=UTF-8", null);
        return mWebView;
    }

    @Override
    public void clear() {
        mStringBuilder = new StringBuilder();
    }

}
