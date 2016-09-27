package com.netelement.gc986.testmvp.p.di;

import android.content.Context;

import com.netelement.gc986.testmvp.m.data.ImplTextStorage;
import com.netelement.gc986.testmvp.m.data.TextStorage;
import com.netelement.gc986.testmvp.p.mainActivity.ImplPresenterMainActivity;
import com.netelement.gc986.testmvp.p.mainActivity.PresenterMainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gc986 on 27.09.16.
 */
@Module
public class AppModule {

    Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    public TextStorage provideTextStorage(){
        return new ImplTextStorage();
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    public PresenterMainView providePresenterMainView(TextStorage textStorage){
        return new ImplPresenterMainActivity(textStorage);
    }

}
