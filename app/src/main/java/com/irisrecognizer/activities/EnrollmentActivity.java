package com.irisrecognizer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;

public class EnrollmentActivity extends AppCompatActivity {
    Button gallery, authenticate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enrollment);
        initialize();
    }

    private void initialize() {
        setAuthenticate(findViewById(R.id.camera));
        setGallery(findViewById(R.id.gallery));
        handle_Gallery(getGallery());
        handle_authenticate(getAuthenticate());
    }

    private void handle_authenticate(Button authenticate) {
        authenticate.setOnClickListener(e->{
            Intent intent = new Intent(this, AuthenticationActivity.class);
            startActivity(intent);
        });
    }

    private void handle_Gallery(Button gallery) {
        gallery.setOnClickListener(e->{
            Intent intent = new Intent(this, AnswerActivity.class);
            intent.putExtra("answer", false);
            startActivity(intent);
        });
    }

    /*
    Getters & Setters
    */
    public Button getGallery() {
        return gallery;
    }
    public void setGallery(Button gallery) {
        this.gallery = gallery;
    }
    public Button getAuthenticate() {
        return authenticate;
    }
    public void setAuthenticate(Button authenticate) {
        this.authenticate = authenticate;
    }
}