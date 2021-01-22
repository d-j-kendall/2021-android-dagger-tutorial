package com.customcrimp.daggerpractice.di;

import android.app.Application;

import com.customcrimp.daggerpractice.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Dustin Kendall on 1/22/21.
 */

/**
 * Will always need an application component in every dagger project.
 * This is a server for BaseApplication
 */
@Component( modules = {
        //Determines which modules the particular component will pull its
        //dependencies from
        AndroidSupportInjectionModule.class,
})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application app);

        AppComponent build();

    }


}
