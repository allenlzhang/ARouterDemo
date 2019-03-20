package com.carlt.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.carlt.modulelib.ARouterConstant;

@Route(path = ARouterConstant.MODULETWO_FIRST_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module_two);
    }

    public void goMain(View view) {
        ARouter.getInstance().build(ARouterConstant.SCROLL_ACTIVITY).navigation();
    }
}
