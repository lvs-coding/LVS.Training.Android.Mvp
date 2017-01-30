package com.example.mvp.root;

import android.app.Application;

import com.example.mvp.login.LoginModule;

import dagger.internal.DaggerCollections;

/**
 * Created by laurent on 1/30/17.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
