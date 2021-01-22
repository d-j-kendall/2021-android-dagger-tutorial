package com.customcrimp.daggerpractice;

import com.customcrimp.daggerpractice.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by Dustin Kendall on 1/22/21.
 */

/**
 * New base application extends convenience class DaggerApplication
 * which provides access to applicationInjector method which provides an injector.
 *
 * BaseApplication is a client of the application component.
 */
public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}
