package com.netelement.gc986.testmvp.v.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.netelement.gc986.testmvp.App;
import com.netelement.gc986.testmvp.R;
import com.netelement.gc986.testmvp.p.mainActivity.PresenterMainView;
import com.netelement.gc986.testmvp.p.mainActivity.ViewMainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ViewMainActivity {

    @BindView(R.id.tvHello) TextView tvHello;
    @BindView(R.id.btOne) Button btOne;

    @Inject
    PresenterMainView presenterMainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getInstance().getComponent().inject(this);

        presenterMainView.init(this,this);

        ButterKnife.bind(this);
    }



    @Override
    public TextView getTextView() {
        return tvHello;
    }

    @Override
    public Button getButton() {
        return btOne;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void viewMessage(String message) {

    }

    @OnClick(R.id.btOne)
    void clickChangeText(){
        presenterMainView.changeText();
    }

}
