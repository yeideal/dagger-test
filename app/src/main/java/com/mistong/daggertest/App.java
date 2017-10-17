package com.mistong.daggertest;

import android.app.Activity;
import android.app.Application;

import com.mistong.daggertest.dagger.ActivityComponent;
import com.mistong.daggertest.dagger.ActivityModule;
import com.mistong.daggertest.dagger.DaggerMainComponent;
import com.mistong.daggertest.dagger.MainComponent;
import com.mistong.daggertest.dagger.MainModule;

/**
 * Created by ye on 2017/10/17.
 */

public class App extends Application {
    private MainComponent mainCmp;

    @Override
    public void onCreate() {
        super.onCreate();
        mainCmp =
                DaggerMainComponent.builder().mainModule(new MainModule()).build();
    }

    public MainComponent getMainCmp() {
        return mainCmp;
    }

    public ActivityComponent getActivityCmp(Activity ativity) {
        return mainCmp.inject(new ActivityModule(ativity));
    }
}
