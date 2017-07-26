package com.naypra.vpkit;

import android.content.Context;

import com.naypra.vpkit.preference.VPKitPreferences;
import com.naypra.vpkit.permission.VPKitPermissionsChecker;

/**
 * Created by vipulmac on 26/07/17.
 */

public class VPKit {


    /**
     * Initializes VPKit with the default config.
     */
    public static void initialize(Context context) {
        VPKitPreferences.initialize(context);
        VPKitPermissionsChecker.initialize(context);
    }


}
