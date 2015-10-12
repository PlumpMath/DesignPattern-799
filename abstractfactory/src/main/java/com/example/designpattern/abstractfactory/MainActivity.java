package com.example.designpattern.abstractfactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements View.OnClickListener {

    private Adapter mAdapter;
    private Button mBtRed;
    private Button mBtBlue;
    private ListView mListView;
    private IThemeFactory mTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listView);
        mAdapter = new Adapter(this);
        mListView.setAdapter(mAdapter);
        mBtRed = (Button)findViewById(R.id.buttonRed);
        mBtRed.setOnClickListener(this);
        mBtBlue = (Button)findViewById(R.id.buttonBlue);
        mBtBlue.setOnClickListener(this);
        mTheme = ConcreteFactory.getInstance().get("red");
        setTheme();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v == mBtRed){
            mTheme = ConcreteFactory.getInstance().get("red");
        }else {
            mTheme = ConcreteFactory.getInstance().get("blue");
        }
        setTheme();
    }

    private void setTheme() {
        if(mTheme != null) {
            mListView.setBackgroundColor(mTheme.getBackgroundColor().getColor());
            mAdapter.setItemColor(mTheme.getItemBackgroundColor().getItemColor());
            mAdapter.setTextColor(mTheme.getTextColor().getTextColor());
        }
    }
}
