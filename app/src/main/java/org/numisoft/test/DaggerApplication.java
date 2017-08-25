package org.numisoft.test;

import android.app.Application;

import org.numisoft.test.inject.AppComponent;
import org.numisoft.test.inject.AppModule;
import org.numisoft.test.inject.DaggerAppComponent;

/**
 * Created by kurilenok on 8/25/17.
 */

public class DaggerApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        super.onCreate();
    }

    public static AppComponent getDaggerComponent() {
        return appComponent;
    }
}
