package com.mistong.daggertest;

import android.app.Activity;
import android.app.Application;

import com.mistong.daggertest.dagger.ActivityComponent;
import com.mistong.daggertest.dagger.ActivityModule;
import com.mistong.daggertest.dagger.DaggerMainComponent;
import com.mistong.daggertest.dagger.MainComponent;

import javax.inject.Inject;

/**
 * Created by ye on 2017/10/17.
 */

public class App extends Application {
    private MainComponent mainCmp;
    @Inject
    HelloSingle helloSingle;
    @Inject
    HelloSingle helloSingle2;

    @Inject
    HelloWorld helloWorld;
    @Inject
    HelloWorld helloWorld2;

    @Override
    public void onCreate() {
        super.onCreate();
        mainCmp = DaggerMainComponent.builder().build();
        mainCmp.inject(this);
//        System.out.println("helloSingle is null?" + (helloSingle == null));
    }

    public MainComponent getMainCmp() {
        return mainCmp;
    }

    public ActivityComponent getActivityCmp(Activity ativity) {
        return mainCmp.inject(new ActivityModule(ativity));
    }
}
