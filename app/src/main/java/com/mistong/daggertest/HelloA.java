package com.mistong.daggertest;

import android.app.Activity;

import javax.inject.Inject;

/**
 * Created by ye on 2017/10/17.
 */

public class HelloA {
    private int index;
    private Activity activity;

    @Inject
    public HelloA(Activity activity) {
        System.out.println("init helloA");
        this.activity = activity;
        index = 0;
    }

    public String getValue() {
        index++;
        return "activity =" + activity.getClass().getSimpleName() + ",helloA value=" + index;
    }
}
