package com.mistong.daggertest.dagger;

import com.mistong.daggertest.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by ye on 2017/10/10.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,//普通的fragment使用dagger需要
        //    AndroidSupportInjectionModule.class,//使用support的fragment需要用到

        MainModule.class,
        ActivityAllModule.class
})
public interface MainComponent {
    void inject(App app);
}
