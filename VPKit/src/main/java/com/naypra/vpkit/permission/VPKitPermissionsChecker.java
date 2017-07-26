package com.naypra.vpkit.permission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;


public class VPKitPermissionsChecker {
    private static Context context = null;

    /** Initializes VPKitPermissionsChecker */
    public static void initialize(Context mContext) {
        context = mContext;
    }

    public static boolean lacksPermissions(String... permissions) {
        for (String permission : permissions) {
            if (lacksPermission(permission)) {
                return true;
            }
        }
        return false;
    }

    private static boolean lacksPermission(String permission) {
        return ContextCompat.checkSelfPermission(context, permission)
                == PackageManager.PERMISSION_DENIED;
    }
}
