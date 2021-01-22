package com.customcrimp.daggerpractice.di;

import com.customcrimp.daggerpractice.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Dustin Kendall on 1/22/21.
 */

/**
 * Modules are where the dependencies or objects live
 * Must be abstract when using @ContributesAndroidInjector
 */
@Module
public abstract class ActivityBuildersModule {

    /**
     * You will have one of these methods in this module for every
     * activity in the application
     * @return an instance of the activity
     */
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
