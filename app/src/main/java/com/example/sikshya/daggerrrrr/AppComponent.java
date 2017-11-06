package com.example.sikshya.daggerrrrr;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Sikshya on 11/6/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
