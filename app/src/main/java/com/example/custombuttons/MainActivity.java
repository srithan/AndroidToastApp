package com.example.custombuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
    }

    private void showToast() {
        Toast.makeText(MainActivity.this, "Srithan Reddy Savela \n savela.s@northeastern.edu",
                Toast.LENGTH_LONG).show();
    }

}