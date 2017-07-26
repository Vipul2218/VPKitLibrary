package com.naypra.vpkit.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by vipulmac on 26/07/17.
 */

public class VPKitPreferences {


    public static SharedPreferences sharedPref;

    /** Initializes VPKitPreferences */
    public static void initialize(Context mContext) {
        sharedPref = PreferenceManager.getDefaultSharedPreferences(mContext);
    }


    public static void storePreference(HashMap<String, String> parameters) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        Iterator<Map.Entry<String, String>> it = parameters.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pairs = it.next();
            editor.putString((String) pairs.getKey(), (String) pairs.getValue());
        }
        editor.commit();
    }

    public static void storePreference(String key, String value) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void storePreference(String key, int value) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void storePreference(String key, long value) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static void removePreference(String key) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.remove(key);
        editor.commit();
    }

    public static void removePreferences(String keys[]) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        for (String key : keys) {
            editor.remove(key);
        }
        editor.commit();
    }

    public static void clearPrefernces() {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.clear();
        editor.commit();
    }

    public static void storePreference(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPref
                .edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static HashMap<String, String> getPreference(String[] keys) {
        HashMap<String, String> parameters = new HashMap<String, String>();
        for (String key : keys) {
            parameters.put(key,
                    sharedPref.getString(key, null));
        }
        return parameters;
    }

    public static String getPreference(String key, String defValue) {
        return sharedPref.getString(key, defValue);
    }

    public static int getPreference(String key, Integer defValue) {
        return sharedPref.getInt(key, defValue);
    }

    public static long getPreference(String key, Long defValue) {
        return sharedPref.getLong(key, defValue);
    }

    public static Boolean getPreference(String key, Boolean defValue) {
        return sharedPref.getBoolean(key, defValue);
    }

}
