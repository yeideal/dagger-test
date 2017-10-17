package com.mistong.daggertest;

import android.app.Activity;

/**
 * Created by ye on 2017/10/17.
 */

public class HelloB {
    private int index;
    private Activity activity;

    public HelloB(Activity activity) {
        this.activity = activity;
        index = 0;
    }

    public String getValue() {
        index++;
        return "activity =" + activity.getClass().getSimpleName() + ",helloB value=" + index;
    }
}
