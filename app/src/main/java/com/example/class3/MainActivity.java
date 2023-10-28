package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtCounter = findViewById(R.id.txt_view);
        Button button = findViewById(R.id.btn_counter);
        Button btnReset = findViewById(R.id.btn_reset);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txtCounter.setText(String.valueOf(counter));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                txtCounter.setText(String.valueOf(counter));
            }
        });
    }
}
