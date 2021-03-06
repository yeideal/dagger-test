package com.mistong.daggertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends Activity implements View.OnClickListener {
    @Inject
    HelloSingle helloSingle;
    @Inject
    HelloSingle helloSingle2;
    @Inject
    HelloWorld helloWorld;
    @Inject
    HelloWorld helloWorld2;

    @Inject
    HelloA helloA;
    @Inject
    HelloA helloA2;
    @Inject
    HelloB helloB;
    @Inject
    HelloB helloB2;
    @Inject
    HelloC helloC;
    @Inject
    HelloC helloC2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("|||||||||||||||||||||||||||||||||||| activity||||||||||||||||||||||||||||||||");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App app = (App) getApplication();
        app.getActivityCmp(this).inject(this);

        findViewById(R.id.test1).setOnClickListener(this);
        findViewById(R.id.test2).setOnClickListener(this);
        findViewById(R.id.test3).setOnClickListener(this);

        findViewById(R.id.test4).setOnClickListener(this);
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
            case R.id.test4:
                startActivity(new Intent(this, MainActivity2.class));
                break;
        }
    }
}
