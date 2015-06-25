package com.example.designpattern.abstractfactory;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglx on 15/6/25.
 */
public class Adapter extends BaseAdapter{
    private final Context mContext;
    private List<String> mData = new ArrayList<>();
    private int mItemColor = Color.WHITE;
    private int mTextColor = Color.BLACK;

   public Adapter(Context context){
        mContext = context;
        mData.add("香蕉");
        mData.add("苹果");
        mData.add("鸭梨");
        mData.add("葡萄");
        mData.add("西瓜");
        mData.add("芒果");
        mData.add("橘子");
        mData.add("樱桃");
        mData.add("菠萝");
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = new TextView(mContext);
        }
        ((TextView)convertView).setText(mData.get(position));
        convertView.setBackgroundColor(mItemColor);
        ((TextView) convertView).setTextColor(mTextColor);
        return convertView;
    }

    public void setItemColor(int itemColor) {
        mItemColor = itemColor;
        notifyDataSetChanged();
    }

    public void setTextColor(int textColor) {
        mTextColor = textColor;
        notifyDataSetChanged();
    }
}
