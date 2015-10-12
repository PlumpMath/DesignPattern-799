package com.example.designpattern.builder;

import android.content.Context;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 用来读取json数据 并转换成不同的展现
 *
 * Created by wanglx on 15/10/10.
 */
public class JsonReader {

    private ITextConverter mConverter;

    public JsonReader(Context context , int type){
        createConverter(context, type);
    }

    public View parse(String data){
        JSONObject body;
        try {
            body = new JSONObject(data);
            if(body.has("data")){
                JSONArray array = body.getJSONArray("data");
                for (int i = 0; i < array.length(); i++) {
                    parseNode(array.getJSONObject(i));
                }
            }
            return mConverter.getResult();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    private void parseNode(JSONObject node) throws JSONException {
        if(node.has(Constant.TYPE)){
            String type = node.getString(Constant.TYPE);
            switch (type){
                case Constant.H1:
                    mConverter.convertH1(node.toString());
                    break;
                case Constant.H2:
                    mConverter.convertH2(node.toString());
                    break;
                case Constant.H3:
                    mConverter.convertH3(node.toString());
                    break;
                case Constant.P:
                    mConverter.convertP(node.toString());
                    break;
                case Constant.IMAGE:
                    mConverter.convertImage(node.toString());
                    break;
                default:
                    mConverter.convertP(node.toString());
                    break;
            }
        }
    }

    private void createConverter(Context context , int type){
        switch (type){
            case Constant.TEXT_CONVERTER:
                mConverter = new TextConverter(context);
                break;
            case Constant.STYLE_TEXT_CONVERTER:
                mConverter = new StyleTextConverter(context);
                break;
            case Constant.PROPERTY_TREE_CONVERTER:
                mConverter = new PropertyTreeConverter(context);
                break;
            default:
                mConverter = new TextConverter(context);
                break;
        }
    }

}
