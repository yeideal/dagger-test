package com.mistong.daggertest.base;


import com.mistong.daggertest.dagger.annotation.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by ye on 2017/10/10.
 */
@ActivityScope
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseActivityComponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {
        public abstract BaseActivityComponent build();
    }
}
