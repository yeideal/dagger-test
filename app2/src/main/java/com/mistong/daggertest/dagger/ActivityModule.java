package com.mistong.daggertest.dagger;

import android.app.Activity;

import com.mistong.daggertest.HelloB;
import com.mistong.daggertest.dagger.annotation.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ye on 2017/10/17.
 */
@ActivityScope
@Module
public class ActivityModule {
    @Provides
    @ActivityScope
    public HelloB provideActivity(Activity activity) {
        return new HelloB(activity);
    }
}


