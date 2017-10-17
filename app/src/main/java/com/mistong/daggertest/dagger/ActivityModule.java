package com.mistong.daggertest.dagger;

import android.app.Activity;

import com.mistong.daggertest.HelloB;
import com.mistong.daggertest.dagger.annotation.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ye on 2017/10/17.
 */
@Module
public class ActivityModule {
    Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    protected HelloB provideHelloB() {
        return new HelloB(activity);
    }
}
