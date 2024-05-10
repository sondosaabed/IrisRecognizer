package com.irisrecognizer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;

public class AuthenticationActivity extends AppCompatActivity {
    Button camera, enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentication);
        initialize();
    }
    /*
        Initialize the scene
     */
    private void initialize() {
        setCamera(findViewById(R.id.gallery));
        setEnroll(findViewById(R.id.camera)); // TODO I'll change names later
        handle_camera(getCamera());
        handle_enroll(getEnroll());
    }

    private void handle_enroll(Button enroll) {
        enroll.setOnClickListener(e->{
            Intent intent = new Intent(this, EnrollmentActivity.class);
            startActivity(intent);
        });
    }

    private void handle_camera(Button camera) {
        /* This method is used to handle the camera button */
        camera.setOnClickListener(view -> {

                }
        );
    }

    /*
        Getters & Setters
     */
    public Button getCamera() {
        return camera;
    }
    public void setCamera(Button camera) {
        this.camera = camera;
    }
    public Button getEnroll() {
        return enroll;
    }
    public void setEnroll(Button enroll) {
        this.enroll = enroll;
    }
}