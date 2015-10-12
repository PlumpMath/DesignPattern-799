package com.example.designpattern.builder;

import android.content.Context;
import android.view.View;

import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 属性树 转换器
 * Created by wanglx on 15/10/12.
 */
public class PropertyTreeConverter extends ITextConverter {

    private AndroidTreeView mAndroidTreeView;
    private TreeNode mRoot;

    public PropertyTreeConverter(Context context) {
        super(context);
        mRoot = TreeNode.root();
        mAndroidTreeView = new AndroidTreeView(mContext, mRoot);
    }

    @Override
    public void convertH1(String h1) throws JSONException {
        JSONObject jsonObject = new JSONObject(h1);
        TreeNode node = new TreeNode(Constant.H1);
        addNode(node, jsonObject);
        mRoot.addChild(node);
    }

    @Override
    public void convertH2(String h2) throws JSONException {
        JSONObject jsonObject = new JSONObject(h2);
        TreeNode node = new TreeNode(Constant.H2);
        addNode(node, jsonObject);
        mRoot.addChild(node);
    }

    @Override
    public void convertH3(String h3) throws JSONException {
        JSONObject jsonObject = new JSONObject(h3);
        TreeNode node = new TreeNode(Constant.H3);
        addNode(node, jsonObject);
        mRoot.addChild(node);
    }

    @Override
    public void convertP(String p) throws JSONException {
        JSONObject jsonObject = new JSONObject(p);
        TreeNode node = new TreeNode(Constant.P);
        addNode(node, jsonObject);
        mRoot.addChild(node);
    }

    @Override
    public void convertImage(String image) throws JSONException {
        JSONObject jsonObject = new JSONObject(image);
        TreeNode node = new TreeNode(Constant.IMAGE);
        addNode(node, jsonObject);
        mRoot.addChild(node);
    }

    private void addNode(TreeNode node, JSONObject jsonObject) throws JSONException {
        node.setExpanded(true);
        if(jsonObject.has(Constant.TEXT)){
            node.addChild(new TreeNode("    " + Constant.TEXT + ": " + jsonObject.get(Constant.TEXT)));
        }
        if(jsonObject.has(Constant.TYPE)){
            node.addChild(new TreeNode("    " + Constant.TYPE + ": " + jsonObject.get(Constant.TYPE)));
        }
        if(jsonObject.has(Constant.ALIGN)){
            node.addChild(new TreeNode("    " + Constant.ALIGN + ": " + jsonObject.get(Constant.ALIGN)));
        }
        if(jsonObject.has(Constant.COLOR)){
            node.addChild(new TreeNode("    " + Constant.COLOR + ": " + jsonObject.get(Constant.COLOR)));
        }
    }

    @Override
    public View getResult() {
        return mAndroidTreeView.getView();
    }

    @Override
    public void clear() {
    }
}
