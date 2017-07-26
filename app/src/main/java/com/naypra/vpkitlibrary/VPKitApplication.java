package com.naypra.vpkitlibrary;

import android.app.Application;

import com.naypra.vpkit.VPKit;

/**
 * Created by vipulmac on 26/07/17.
 */

public class VPKitApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        VPKit.initialize(this);
    }
}
