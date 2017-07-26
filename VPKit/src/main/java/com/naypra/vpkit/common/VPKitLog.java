package com.naypra.vpkit.common;



/**
 * Created by vipulmac on 26/07/17.
 */

public class VPKitLog {

    public static boolean DEBUG = true;
    public static String TAG = "";


    public static void e(String msg) {
        if (DEBUG)
            android.util.Log.e(TAG, msg);
    }
    public static void d(String msg) {
        if (DEBUG)
            android.util.Log.d(TAG, msg);
    }

    public static void v(String msg) {
        if (DEBUG)
            android.util.Log.v(TAG, msg);
    }

    public static void v(Exception e) {
        if (DEBUG)
            e.printStackTrace();
    }

    public static void v(String... args) {
        if (DEBUG) {
            StringBuffer strBuffer = new StringBuffer();
            for (String temp : args) {
                strBuffer.append(temp).append(" ");
            }
            android.util.Log.v(TAG, strBuffer.toString());
        }
    }
}
