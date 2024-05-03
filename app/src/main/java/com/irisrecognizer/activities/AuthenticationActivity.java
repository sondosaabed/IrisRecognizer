package com.irisrecognizer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;
import com.irisrecognizer.config.Preferences;

/*
    In this activity the user is greeted and they are able to
    change the language of the Layouts, they are also able to
    start using the application when clicking on start
 */
public class AuthenticationActivity extends AppCompatActivity {
    Button start, language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
            Check if it's the first time for the user using taskaty
            if so show them getting started otherwise show them welcome back
            for more personalized experience
         */
        if (Preferences.isFirstTime(this)) {
            Preferences.setNotFirstTime(this);
            setContentView(R.layout.getting_started);
        } else {
            setContentView(R.layout.welcome_back);
        }
        initialize();
    }
    /*
        Initialize the scene
     */
    private void initialize() {
//        setStart(findViewById(R.id.start));
//        setLanguage(findViewById(R.id.languageBtn));

        handle_start(getStart());
        handle_change(getLanguage());

        Preferences.setLanguageFromPreferences(this);// Set the language based on preferences
    }

    private void handle_start(Button start) {
        /* This method is used to handle the starting button */
        start.setOnClickListener(view -> openSelectImage());
    }

    public void openSelectImage() {
        /* This method is used to start the next activity */
//        Intent intent = new Intent(this, SelectImage.class);
//        startActivity(intent);
    }

    private void handle_change(Button language) {
        /* This method is used to switch the UI langugae */
        language.setOnClickListener(view -> Preferences.change_language(this));
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

    public Button getLanguage() {
        return language;
    }

    public void setLanguage(Button language) {
        this.language = language;
    }
}