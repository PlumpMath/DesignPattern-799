package com.example.designpattern.builder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 纯文本转换
 * Created by wanglx on 15/10/10.
 */
public class TextConverter extends ITextConverter{

    private TextView mTextView;

    public TextConverter(Context context) {
        super(context);
        mTextView = new TextView(mContext);
    }

    @Override
    public void convertH1(String h1) throws JSONException {
        JSONObject jsonObject = new JSONObject(h1);
        mTextView.append("\n");
        mTextView.append(jsonObject.getString(Constant.TEXT));
    }

    @Override
    public void convertH2(String h2) throws JSONException {
        JSONObject jsonObject = new JSONObject(h2);
        mTextView.append("\n");
        mTextView.append(jsonObject.getString(Constant.TEXT));
    }

    @Override
    public void convertH3(String h3) throws JSONException {
        JSONObject jsonObject = new JSONObject(h3);
        mTextView.append("\n");
        mTextView.append(jsonObject.getString(Constant.TEXT));
    }

    @Override
    public void convertP(String p) throws JSONException {
        JSONObject jsonObject = new JSONObject(p);
        mTextView.append("\n");
        mTextView.append(jsonObject.getString(Constant.TEXT));
    }

    @Override
    public View getResult() {
        return mTextView;
    }

    @Override
    public void clear() {
        mTextView.setText("");
    }
}
