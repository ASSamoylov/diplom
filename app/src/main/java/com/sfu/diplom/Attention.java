package com.sfu.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Attention extends AppCompatActivity {

    int count = 0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;
    private TextView text_findDigit;
    private TextView textExplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        text_findDigit = findViewById(R.id.text_findDigit);
        textExplain = findViewById(R.id.textExplain);

        updateBtn();

        btn1.setOnClickListener(view -> {
            String btnNum = btn1.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn2.setOnClickListener(view -> {
            String btnNum = btn2.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn3.setOnClickListener(view -> {
            String btnNum = btn3.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn4.setOnClickListener(view -> {
            String btnNum = btn4.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn5.setOnClickListener(view -> {
            String btnNum = btn5.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn6.setOnClickListener(view -> {
            String btnNum = btn6.getText().toString();
            String countStr = String.valueOf(count);
            if (btnNum.equals(countStr)){
                updateBtn();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Вы ошиблись. Попробуйте еще раз",
                        Toast.LENGTH_LONG).show();
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn7.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn8.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn9.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn10.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn11.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn12.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn13.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn14.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn15.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn16.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn17.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn18.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn19.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn20.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn21.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn22.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn23.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn24.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btnNum = btn25.getText().toString();
                String countStr = String.valueOf(count);
                if (btnNum.equals(countStr)){
                    updateBtn();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Вы ошиблись. Попробуйте еще раз",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void setRandomDigits (){
        int[] arr = new int[25];
        int a = 1, b = 25, check;
        boolean exit;
        for (int i = 0; i < 25; i++) {
            do {
                check = 0;
                exit = true;
                arr[i] = a +(int) (Math.random()*b);
                for (int j = 0 ; j < i; j++){
                    if (arr[i] == arr[j])
                        check++;
                }
                if (check == 0)
                    exit = false;
            } while (exit);
        }
        btn1.setText(String.valueOf(arr[1]));
        btn2.setText(String.valueOf(arr[2]));
        btn3.setText(String.valueOf(arr[3]));
        btn4.setText(String.valueOf(arr[4]));
        btn5.setText(String.valueOf(arr[5]));
        btn6.setText(String.valueOf(arr[6]));
        btn7.setText(String.valueOf(arr[7]));
        btn8.setText(String.valueOf(arr[8]));
        btn9.setText(String.valueOf(arr[9]));
        btn10.setText(String.valueOf(arr[10]));
        btn11.setText(String.valueOf(arr[11]));
        btn12.setText(String.valueOf(arr[12]));
        btn13.setText(String.valueOf(arr[13]));
        btn14.setText(String.valueOf(arr[14]));
        btn15.setText(String.valueOf(arr[15]));
        btn16.setText(String.valueOf(arr[16]));
        btn17.setText(String.valueOf(arr[17]));
        btn18.setText(String.valueOf(arr[18]));
        btn19.setText(String.valueOf(arr[19]));
        btn20.setText(String.valueOf(arr[20]));
        btn21.setText(String.valueOf(arr[21]));
        btn22.setText(String.valueOf(arr[22]));
        btn23.setText(String.valueOf(arr[23]));
        btn24.setText(String.valueOf(arr[24]));
        btn25.setText(String.valueOf(arr[0]));
    }

    public void updateBtn(){
        count++;
        String digit = String.valueOf(count);
        text_findDigit.setText(digit);
        setRandomDigits();
        if (count > 25) {
            disableBtn();
            textExplain.setVisibility(View.GONE);
            text_findDigit.setVisibility(View.GONE);
            Toast.makeText(
                    getApplicationContext(),
                    "Тренажер пройден, поздравляем!",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void disableBtn (){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
        btn25.setEnabled(false);
    }

}