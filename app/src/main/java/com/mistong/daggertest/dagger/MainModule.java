package com.mistong.daggertest.dagger;

import com.mistong.daggertest.HelloSingle;
import com.mistong.daggertest.HelloWorld;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ye on 2017/10/17.
 */
@Module
public class MainModule {

    @Singleton
    @Provides
    protected HelloSingle provideHelloSingle() {
        System.out.println("inint hello single");
        return new HelloSingle();
    }

    @Provides
    protected HelloWorld provideHelloWorld() {
        System.out.println("inint HelloWorld");
        return new HelloWorld();
    }
}
