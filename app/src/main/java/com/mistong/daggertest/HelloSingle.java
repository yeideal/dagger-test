package com.mistong.daggertest;

/**
 * Created by ye on 2017/10/17.
 */

public class HelloSingle {

    private int index;

    public HelloSingle() {
        index = 0;
    }

    public String getValue() {
        index++;
        return "helloSingle value=" + index;
    }
}
