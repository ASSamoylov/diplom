package com.sfu.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MemoryAlt extends AppCompatActivity {

    private int posCount = 0, negCount = 0, count = 0;
    private Button btnNo, btnYes, btnRdy;
    private TextView textPosCount, textNegCount, textNumber, textPosEx, textNegEx;
    private int[] arr = new int[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_alt);

        btnNo = findViewById(R.id.btnNo);
        btnYes = findViewById(R.id.btnYes);
        btnRdy = findViewById(R.id.btnRdy);
        textNegCount = findViewById(R.id.textNegCount);
        textPosCount = findViewById(R.id.textPosCount);
        textPosEx = findViewById(R.id.textPosEx);
        textNegEx = findViewById(R.id.textNegEx);
        textNumber = findViewById(R.id.textNumber);

        fillArray();
        textNumber.setText(String.valueOf(arr[0]));

        btnNo.setEnabled(false);
        btnYes.setEnabled(false);

        btnRdy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNo.setEnabled(true);
                btnYes.setEnabled(true);
                btnRdy.setEnabled(false);
                btnRdy.setVisibility(View.GONE);
                count++;
                textNumber.setText(String.valueOf(arr[count]));
            }
        });


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arr[count] == arr[count-1]){
                    posCount++;
                } else {
                    negCount++;
                }
                checking();
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arr[count] != arr[count-1]){
                    posCount++;
                } else {
                    negCount++;
                }
                checking();
            }
        });

    }

    public void checking(){
        if (count < 25){
            count++;
            textNumber.setText(String.valueOf(arr[count]));
        } else {
            btnNo.setEnabled(false);
            btnYes.setEnabled(false);
            textPosCount.setText(String.valueOf(posCount));
            textNegCount.setText(String.valueOf(negCount));
            textPosCount.setVisibility(View.VISIBLE);
            textNegCount.setVisibility(View.VISIBLE);
            textPosEx.setVisibility(View.VISIBLE);
            textNegEx.setVisibility(View.VISIBLE);
        }
    }

    public void fillArray() {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1 + (int) (Math.random() * 100);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[(int) (Math.random() * 4)];
        }
    }

}