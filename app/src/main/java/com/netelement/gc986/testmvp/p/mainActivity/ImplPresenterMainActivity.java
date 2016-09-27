package com.netelement.gc986.testmvp.p.mainActivity;

import android.app.Activity;

import com.netelement.gc986.testmvp.m.data.TextStorage;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

/**
 * Created by gc986 on 27.09.16.
 */

public class ImplPresenterMainActivity implements PresenterMainView {

    private WeakReference<ViewMainActivity> mainView;

    TextStorage textStorage;

    @Inject
    public ImplPresenterMainActivity(TextStorage textStorage){
        this.textStorage = textStorage;
    }

    @Override
    public void changeText(String newText) {
        if(mainView==null) new IllegalStateException("MainView not specified. Call method init() before.");

        ViewMainActivity viewMainActivity = mainView.get();
        viewMainActivity.getTextView().setText(newText);
    }

    @Override
    public void changeText() {
        if(mainView==null) new IllegalStateException("MainView not specified. Call method init() before.");

        ViewMainActivity viewMainActivity = mainView.get();
        viewMainActivity.getTextView().setText(textStorage.getText1());
    }

    @Override
    public void init(Activity activity, ViewMainActivity view) {
        this.mainView = new WeakReference<>(view);
    }

}
