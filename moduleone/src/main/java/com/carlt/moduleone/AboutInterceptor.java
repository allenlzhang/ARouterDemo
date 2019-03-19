package com.carlt.moduleone;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.carlt.modulelib.ARouterConstant;


// 比较经典的应用就是在跳转过程中处理登陆事件，这样就不需要在目标页重复做登陆检查
// 拦截器会在跳转之间执行，多个拦截器会按优先级顺序依次执行
@Interceptor(priority = 1, name = "登录拦截")
public class AboutInterceptor implements IInterceptor {
    @Override
    public void process(final Postcard postcard, final InterceptorCallback callback) {
        //        String groups = postcard.getGroup();
        //        if ("needLogin".equals(groups)) {
        //            if (true) {
        //                //登录判断 Log.e("你需要登录", "你需要登录");
        //                ARouter.getInstance().build(ARouterConstant.MAIN_LOGINACTIVITY).navigation();
        //                callback.onInterrupt(null);
        //            }
        //        } else {
        //            // 处理完成，交还控制权
        //            callback.onContinue(postcard);
        //        }

        // 以上两种至少需要调用其中一种，否则不会继续路由

        if (ARouterConstant.MODULEONE_FIRST_ACTIVITY.equals(postcard.getPath())) {
            ARouter.getInstance().build(ARouterConstant.MAIN_LOGINACTIVITY).navigation();
            callback.onInterrupt(null);
            // 这里的弹窗仅做举例，代码写法不具有可参考价值
//            final AlertDialog.Builder ab = new AlertDialog.Builder(FirstActivity.getActivity());
//            ab.setCancelable(false);
//            ab.setTitle("温馨提醒");
//            ab.setMessage("想要跳转到Test4Activity么？(触发了\"/inter/test1\"拦截器，拦截了本次跳转)");
//            ab.setNegativeButton("继续", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    callback.onContinue(postcard);
//                }
//            });
//            ab.setNeutralButton("算了", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    callback.onInterrupt(null);
//                }
//            });
//            ab.setPositiveButton("加点料", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    postcard.withString("extra", "我是在拦截器中附加的参数");
//                    callback.onContinue(postcard);
//                }
//            });
//
//            MainLooper.runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    ab.create().show();
//                }
//            });
        } else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
    }
}
