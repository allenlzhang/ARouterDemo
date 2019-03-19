package com.carlt.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.carlt.modulelib.ARouterConstant;

@Route(path = ARouterConstant.MODULETWO_FIRST_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module_two);
    }


}
