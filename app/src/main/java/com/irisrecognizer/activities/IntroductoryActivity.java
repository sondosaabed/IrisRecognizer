package com.irisrecognizer.activities;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;
import com.irisrecognizer.config.Preferences;

public class IntroductoryActivity extends AppCompatActivity {
    Button start;
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
        boolean first = true;
        if (!Preferences.isFirstTime(this)) {
            setContentView(R.layout.welcome_back);
            first = false;
        } else {
            Preferences.setNotFirstTime(this);
            setContentView(R.layout.getting_started);
        }
        setStart(findViewById(R.id.start));
        handle_start(getStart(),first);
    }

    private void handle_start(Button start, boolean first) {
        /**
            * If its first time go to enrollment, if it's not go to authenticate.
         */
        start.setOnClickListener(e->{
            if(first == true){
                Intent intent = new Intent(this, EnrollmentActivity.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, AuthenticationActivity.class);
                startActivity(intent);
            }
        });
    }

    /*
    Getters & Setters
 */
    public Button getStart() {
        return start;
    }

    public void setStart(Button start) {
        this.start = start;
    }
}