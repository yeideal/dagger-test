package com.mistong.daggertest.dagger;

import com.mistong.daggertest.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ye on 2017/10/17.
 */
@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(App app);

    ActivityComponent inject(ActivityModule activityModule);
}
