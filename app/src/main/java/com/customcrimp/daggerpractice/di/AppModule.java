package com.customcrimp.daggerpractice.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dustin Kendall on 1/22/21.
 */

/**
 * Will put instances of objects that will be access from any
 * spot in the application, and these objects will live throughout the
 * lifecycle of the application instance.
 */
@Module
public class AppModule {


    /**
     * Should use 'static' with @Provides annotation, because it is more efficient.
     * @return
     */
    @Provides
    static String someString(){
        return "Test String";
    }

    @Provides
    static boolean getApp(Application application){
        return application == null;
    }

    @Provides
    static int someInt(String string){
        if(string.equals("Test String")){
            return 1;
        }
        return 0;
    }


}
