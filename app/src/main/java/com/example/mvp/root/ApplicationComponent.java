package com.example.mvp.root;

import com.example.mvp.login.LoginActivity;
import com.example.mvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by laurent on 1/30/17.
 */

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
