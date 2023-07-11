package com.waduzzaman.divisibiliychecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edText1;
    Button btnCal;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText1=findViewById(R.id.edText1);
        btnCal=findViewById(R.id.btnCal);
        tvResult=findViewById(R.id.tvResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myString1=edText1.getText().toString();
                int myNumber1=Integer.parseInt(myString1);


                if (myNumber1%5==0 && myNumber1%11 !=0 ){
                //Toast takes to context> first is the name of the class and the name of the context i want to print. Toast lenght and.show
                    Toast.makeText(MainActivity.this, myNumber1+" is divisible by only 5" , Toast.LENGTH_SHORT).show();
                    tvResult.setText("Number is divisible by only 5");

                } else if (myNumber1%11==0 && myNumber1%5!=0 ) {
                    Toast.makeText(MainActivity.this, myNumber1+" is divisible by only 11" , Toast.LENGTH_SHORT).show();
                    tvResult.setText("Number is divisible by only 11");

                } else if (myNumber1%5==0 && myNumber1%11==0) {
                    Toast.makeText(MainActivity.this, myNumber1+" is divisible by both 5 & 11" , Toast.LENGTH_SHORT).show();
                    tvResult.setText("Number is divisible by both 5 & 11");

                } else {
                    Toast.makeText(MainActivity.this, myNumber1+" is not divisible by 5, 11 or both", Toast.LENGTH_SHORT).show();
                    tvResult.setText("Number is not divisible by 5, 11 or both");
                }

            }
        });
    }
}