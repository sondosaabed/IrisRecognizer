package com.irisrecognizer.activities;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;
import com.irisrecognizer.config.Preferences;

public class IntroductoryActivity extends AppCompatActivity {
    /*
        Custom Introductory Activity Based on user prefrences
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        Check if first time users go to getting started
        otherwise go to welcome back
         */
        if (!Preferences.isFirstTime(this)) {
            setContentView(R.layout.welcome_back);

        } else {
            Preferences.setNotFirstTime(this);
            setContentView(R.layout.getting_started);
        }
    }
}