package com.irisrecognizer.config;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.irisrecognizer.activities.AuthenticationActivity;

public class Preferences {
    private static final String FIRST_TIME = "is_first_time";
    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;

    /* These two methods are used to check if the user uses the app for the forst time */
    public static boolean isFirstTime(Context context) {
        preferences = getPreferences(context);
        return preferences.getBoolean(FIRST_TIME, true);
    }

    public static void setNotFirstTime(Context context) {
        preferences = getPreferences(context);
        editor = preferences.edit();
        editor.putBoolean(FIRST_TIME, false);
        editor.apply();
    }

    public static SharedPreferences getPreferences(Context context) {
        if (preferences == null) {
            preferences = PreferenceManager.getDefaultSharedPreferences(context);
            editor = preferences.edit();
        }
        return preferences;
    }
}
