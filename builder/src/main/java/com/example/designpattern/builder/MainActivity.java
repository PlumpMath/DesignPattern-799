package com.example.designpattern.builder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * 这是一个生成器模式的例子 把JSON数据解析成不同的展现
 */
public class MainActivity extends Activity implements View.OnClickListener{

    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = (LinearLayout)findViewById(R.id.root);
        Button button1 = (Button)findViewById(R.id.text);
        button1.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.style_text);
        button2.setOnClickListener(this);
        Button button3 = (Button)findViewById(R.id.tree);
        button3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        mLinearLayout.removeAllViews();
        String text = "{\"data\":[{\"type\":\"h1\",\"text\":\"一级标题\",\"color\":\"#111111\",\"align\":\"left\"},{\"type\":\"h2\",\"text\":\"二级标题\",\"color\":\"#00ff00\",\"align\":\"right\"},{\"type\":\"h3\",\"text\":\"三级标题\",\"color\":\"#00ff00\",\"align\":\"center\"},{\"type\":\"p\",\"text\":\"段落一 \",\"color\":\"#a1a1a1\"},{\"type\":\"p\",\"text\":\"段落二\",\"color\":\"#111111\"},{\"type\":\"img\",\"text\":\"http://img5.duitang.com/uploads/item/201402/01/20140201115019_tLfC8.thumb.600_0.jpeg\",\"color\":\"#888888\",\"align\":\"center\"},{\"type\":\"p\",\"text\":\"段落三\",\"color\":\"#555555\"}]}";
        JsonReader reader;
        switch (v.getId()){
            case R.id.text:
                reader = new JsonReader(this, Constant.TEXT_CONVERTER);
                mLinearLayout.addView(reader.parse(text));
                break;
            case R.id.style_text:
                reader = new JsonReader(this, Constant.STYLE_TEXT_CONVERTER);
                mLinearLayout.addView(reader.parse(text));
                break;
            case R.id.tree:
                reader = new JsonReader(this, Constant.PROPERTY_TREE_CONVERTER);
                mLinearLayout.addView(reader.parse(text));
                break;
        }
    }
}
