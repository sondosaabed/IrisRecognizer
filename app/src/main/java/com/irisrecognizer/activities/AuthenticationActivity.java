package com.irisrecognizer.activities;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;

public class AuthenticationActivity extends AppCompatActivity {
    Button camera;

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
        setCamera(findViewById(R.id.camera));
        handle_camera(getCamera());
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
}