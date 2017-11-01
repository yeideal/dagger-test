package com.mistong.daggertest;

/**
 * Created by ye on 2017/10/17.
 */

public class HelloWorld {

    private int index;

    public HelloWorld() {
        index = 0;
    }

    public String getValue() {
        index++;
        return "HelloWorld value=" + index;
    }
}
