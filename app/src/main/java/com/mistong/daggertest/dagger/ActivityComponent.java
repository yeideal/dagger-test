package com.mistong.daggertest.dagger;

import com.mistong.daggertest.MainActivity;
import com.mistong.daggertest.MainActivity2;
import com.mistong.daggertest.dagger.annotation.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by ye on 2017/10/17.
 */
@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(MainActivity2 mainActivity2);
}
