package com.netelement.gc986.testmvp.p.di;

import com.netelement.gc986.testmvp.v.activity.MainActivity;

import dagger.Component;

/**
 * Created by gc986 on 27.09.16.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);

}
