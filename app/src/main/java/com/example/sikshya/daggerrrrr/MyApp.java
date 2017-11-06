package com.example.sikshya.daggerrrrr;

import android.app.Application;

/**
 * Created by Sikshya on 11/6/2017.
 */

public class MyApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
  appComponent = DaggerAppComponent.builder()
          .appModule(new AppModule(this))
          .netModule(new NetModule("https://api.github.com"))
          .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
