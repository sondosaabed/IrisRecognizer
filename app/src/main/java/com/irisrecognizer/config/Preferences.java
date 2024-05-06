package com.irisrecognizer.config;

import com.irisrecognizer.activities.AuthenticationActivity;
import com.irisrecognizer.activities.IntroductoryActivity;

public class Preferences {
    public static boolean isFirstTime(IntroductoryActivity authenticationActivity) {
        return true;
    }

    public static void setNotFirstTime(IntroductoryActivity authenticationActivity) {
    }

    public static void setLanguageFromPreferences(AuthenticationActivity authenticationActivity) {
    }

    public static void change_language(AuthenticationActivity authenticationActivity) {
    }
}
