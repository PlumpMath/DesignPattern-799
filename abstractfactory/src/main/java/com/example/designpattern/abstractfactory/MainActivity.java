package com.example.designpattern.abstractfactory;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity  implements View.OnClickListener {

    private Adapter mAdapter;
    private Button mBtRed;
    private Button mBtBlue;
    private ListView mListView;
    private ThemeFactory mTheme;

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
        mTheme = ConcreteFactory.getInsance().get("red");
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
            mTheme = ConcreteFactory.getInsance().get("red");
        }else {
            mTheme = ConcreteFactory.getInsance().get("blue");
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
