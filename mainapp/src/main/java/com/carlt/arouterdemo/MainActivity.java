package com.carlt.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.carlt.modulelib.ARouterConstant;

@Route(path = ARouterConstant.MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {
    private boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextOne(View view) {
        ARouter.getInstance()
                .build(ARouterConstant.MODULEONE_FIRST_ACTIVITY)
                .navigation(this, new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {

                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {
                        Log.e("MainActivity----", "拦截了");
                    }
                });
    }

    public void nextTwo(View view) {
        ARouter.getInstance().build(ARouterConstant.MODULETWO_FIRST_ACTIVITY).navigation();
    }
}
