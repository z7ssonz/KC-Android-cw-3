package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.Title);
        TextView title2 = findViewById(R.id.Title2);

        EditText first = findViewById(R.id.First);
        EditText second = findViewById(R.id.Second);

        Button button = findViewById(R.id.Button);
}
}