package com.netelement.gc986.testmvp.p.mainActivity;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by gc986 on 27.09.16.
 */

public interface ViewMainActivity {

    TextView getTextView();

    Button getButton();

    Context getContext();

    void viewMessage(String message);

}
