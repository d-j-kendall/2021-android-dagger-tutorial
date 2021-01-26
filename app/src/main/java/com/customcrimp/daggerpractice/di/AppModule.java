package com.customcrimp.daggerpractice.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.customcrimp.daggerpractice.R;

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
    static RequestOptions provideRequestOptions(){
        return RequestOptions.placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }

}
