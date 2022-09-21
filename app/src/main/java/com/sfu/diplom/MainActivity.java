package com.sfu.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button attantion_btn;
    private Button memory_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attantion_btn = findViewById(R.id.attantion_btn);
        memory_btn = findViewById(R.id.react_btn);

        attantion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.sfu.diplom.Attention");
                startActivity(intent);
            }
        });

        memory_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.sfu.diplom.MemoryAlt");
                startActivity(intent);
            }
        });

    }
}