package com.fancy.nezha.nezhatest;

import android.app.Application;
import android.util.Log;

import com.fancy.nezha.lib.i.ITrackingListener;
import com.fancy.nezha.lib.sdk.NeZhaSdk;


/**
 * Author: Jay Zhao
 * Date: 2019-08-23, Fri
 * Time: 15:56
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NeZhaSdk.init(this, "");
        NeZhaSdk.startTracking(new ITrackingListener() {
            @Override
            public void onSuccess() {
                Log.d("NE_ZHA", "onSuccess: ");
            }

            @Override
            public void onFailed() {
                Log.d("NE_ZHA", "onFailed: ");
            }
        });
    }
}
