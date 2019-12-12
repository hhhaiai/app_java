package com.example.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TestLify implements Application.ActivityLifecycleCallbacks {


    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        Log.i("wupan", "onActivityCreated");

        if (activity.getApplication() == null) {
            Log.i("wupan", "activity.getApplicationContext():is null");
        } else {
            Log.i("wupan", "activity.getApplicationContext():is not null");
        }

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        Log.i("wupan", "onActivityStarted");
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        Log.i("wupan", "onActivityResumed");
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }
}
