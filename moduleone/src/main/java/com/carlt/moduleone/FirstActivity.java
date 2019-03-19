package com.carlt.moduleone;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.carlt.modulelib.ARouterConstant;

@Route(path = ARouterConstant.MODULEONE_FIRST_ACTIVITY)
public class FirstActivity extends AppCompatActivity {
    private static FirstActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_moudle_one);
        instance = this;
    }

    public static Activity getActivity() {
        return instance;
    }
}
