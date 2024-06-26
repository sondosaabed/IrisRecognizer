package com.irisrecognizer.activities;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.irisrecognizer.R;

public class AnswerActivity extends AppCompatActivity {
    Button tryAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Boolean x = getIntent().getBooleanExtra("answer", false);
        if (x == true){
            setContentView(R.layout.authorized);
        }else{
            setContentView(R.layout.try_again);
        }
        initialize();
    }
    /*
        Initialize the scene
     */
    private void initialize() {
        settryAgain(findViewById(R.id.tryAgain));
        handle_tryAgain(gettryAgain());
    }

    private void handle_tryAgain(Button tryAgain) {
        /* This method is used to handle the try again or logout button */
        tryAgain.setOnClickListener(view -> {
            Intent intent = new Intent(this, AuthenticationActivity.class);
            startActivity(intent);
        });
    }

    /*
        Getters & Setters
     */
    public Button gettryAgain() {
        return tryAgain;
    }

    public void settryAgain(Button start) {
        this.tryAgain = start;
    }
}