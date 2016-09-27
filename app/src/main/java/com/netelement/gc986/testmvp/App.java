package com.netelement.gc986.testmvp;

import com.netelement.gc986.testmvp.p.di.AppComponent;
import com.netelement.gc986.testmvp.p.di.AppModule;
import com.netelement.gc986.testmvp.p.di.DaggerAppComponent;

/**
 * Created by gc986 on 27.09.16.
 */

public class App extends android.app.Application {

    private static App instance;
    AppComponent appComponent;

    public static App getInstance() {
        return instance;
    }

    public AppComponent getComponent() {
        return appComponent;
    }

    @Override
    public void onCreate(){
        super.onCreate();

        instance = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

}
