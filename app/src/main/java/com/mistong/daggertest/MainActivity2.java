package com.mistong.daggertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity2 extends Activity implements View.OnClickListener {
    @Inject
    HelloSingle helloSingle;

    @Inject
    HelloA helloA;

    @Inject
    HelloB helloB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        App app = (App) getApplication();
        app.getActivityCmp(this).inject(this);

        findViewById(R.id.test1).setOnClickListener(this);
        findViewById(R.id.test2).setOnClickListener(this);
        findViewById(R.id.test3).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test1:
                Toast.makeText(this, helloSingle.getValue(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.test2:
                Toast.makeText(this, helloA.getValue(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.test3:
                Toast.makeText(this, helloB.getValue(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
