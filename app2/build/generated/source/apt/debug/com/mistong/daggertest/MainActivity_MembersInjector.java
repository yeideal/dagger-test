// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mistong.daggertest;

import android.app.Fragment;
import com.mistong.daggertest.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingFragmentInjectorProvider;

  private final Provider<HelloSingle> helloSingleProvider;

  private final Provider<HelloA> helloAProvider;

  private final Provider<HelloB> helloBProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingFragmentInjectorProvider,
      Provider<HelloSingle> helloSingleProvider,
      Provider<HelloA> helloAProvider,
      Provider<HelloB> helloBProvider) {
    this.dispatchingFragmentInjectorProvider = dispatchingFragmentInjectorProvider;
    this.helloSingleProvider = helloSingleProvider;
    this.helloAProvider = helloAProvider;
    this.helloBProvider = helloBProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingFragmentInjectorProvider,
      Provider<HelloSingle> helloSingleProvider,
      Provider<HelloA> helloAProvider,
      Provider<HelloB> helloBProvider) {
    return new MainActivity_MembersInjector(
        dispatchingFragmentInjectorProvider, helloSingleProvider, helloAProvider, helloBProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    BaseActivity_MembersInjector.injectDispatchingFragmentInjector(
        instance, dispatchingFragmentInjectorProvider.get());
    injectHelloSingle(instance, helloSingleProvider.get());
    injectHelloA(instance, helloAProvider.get());
    injectHelloB(instance, helloBProvider.get());
  }

  public static void injectHelloSingle(MainActivity instance, HelloSingle helloSingle) {
    instance.helloSingle = helloSingle;
  }

  public static void injectHelloA(MainActivity instance, HelloA helloA) {
    instance.helloA = helloA;
  }

  public static void injectHelloB(MainActivity instance, HelloB helloB) {
    instance.helloB = helloB;
  }
}
