package com.example.app;

import android.app.Application;

import com.example.utils.CrashHandler;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().setEnableCatch(true);
        this.registerActivityLifecycleCallbacks(new TestLify());

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                TestUtil.test();
//            }
//        }).start();
    }
}
