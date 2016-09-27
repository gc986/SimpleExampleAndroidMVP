package com.netelement.gc986.testmvp.p.mainActivity;

import android.app.Activity;

/**
 * Created by gc986 on 27.09.16.
 */

public interface PresenterMainView {

    void changeText(String newText);

    void changeText();

    void init(Activity activity, ViewMainActivity view);

}
