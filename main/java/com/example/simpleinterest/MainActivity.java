package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar SPrincipal, SRate, SYear;
    TextView TPrincipal, TRate, TYear, TResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SPrincipal = findViewById(R.id.SPrincipal);
        SRate = findViewById(R.id.SRate);
        SYear = findViewById(R.id.SYear);
        TPrincipal = findViewById(R.id.TPrincipal);
        TRate = findViewById(R.id.TRate);
        TYear = findViewById(R.id.TYear);
        TResult = findViewById(R.id.TResult);


        SPrincipal.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TPrincipal.setText(""+i);
                int num1 = Integer.parseInt(TPrincipal.getText().toString());
                int num2 = Integer.parseInt(TRate.getText().toString());;
                int num = Integer.parseInt(TYear.getText().toString());
                double si = (num1*100000 * num2 * num) / 100;



                TResult.setText(""+si);




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });


        SYear.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TYear.setText(""+i);
                int num1 = Integer.parseInt(TPrincipal.getText().toString());
                int num2 = Integer.parseInt(TRate.getText().toString());;
                int num = Integer.parseInt(TYear.getText().toString());
                double si = (num1*100000 * num2 * num) / 100;


                TResult.setText(""+si);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SRate.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TRate.setText(""+i);
                int num1 = Integer.parseInt(TPrincipal.getText().toString());
                int num2 = Integer.parseInt(TRate.getText().toString());;
                int num = Integer.parseInt(TYear.getText().toString());
                double si = (num1*100000 * num2 * num) / 100;


                TResult.setText(""+si);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}