package com.mistong.daggertest.dagger.annotation;

/**
 * Created by yh on 2016/4/13.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
