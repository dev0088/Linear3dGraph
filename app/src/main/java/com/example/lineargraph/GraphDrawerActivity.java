package com.example.lineargraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */


public class GraphDrawerActivity extends AppCompatActivity {

    private Linear3DSurfaceView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = new Linear3DSurfaceView(this);
        setContentView(mView);
    }
}
