package com.example.drawmovingshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GraphicsView graphicsView = new GraphicsView(this);

        setContentView(graphicsView);
    }
}
