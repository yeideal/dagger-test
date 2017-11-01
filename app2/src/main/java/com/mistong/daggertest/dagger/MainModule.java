package com.mistong.daggertest.dagger;

import com.mistong.daggertest.HelloSingle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ye on 2017/10/17.
 */
@Module
public class MainModule {

    @Provides
    @Singleton
    protected HelloSingle provideHelloSingle() {
        return new HelloSingle();
    }
}
