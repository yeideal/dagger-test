package com.mistong.daggertest.dagger;

import android.app.Activity;

import com.mistong.daggertest.MainActivity;
import com.mistong.daggertest.MainActivity2;
import com.mistong.daggertest.base.BaseActivityComponent;
import com.mistong.daggertest.dagger.annotation.ActivityScope;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ye on 2017/10/17.
 */
@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class ActivityAllModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class, ActivityModule.class})
    public abstract MainActivity buildMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule2.class, ActivityModule.class})
    public abstract MainActivity2 buildMainActivity2();

    @ActivityScope
    @Module
    public static class MainActivityModule {
        @Provides
        @ActivityScope
        public Activity provideActivity(MainActivity activity) {
            return activity;
        }
    }

    @ActivityScope
    @Module
    public static class MainActivityModule2 {
        @Provides
        @ActivityScope
        public Activity provideActivity(MainActivity2 activity) {
            return activity;
        }
    }

}
