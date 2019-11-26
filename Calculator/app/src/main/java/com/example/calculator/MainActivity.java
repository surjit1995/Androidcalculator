package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText etFirst,etSecond,etResult;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst=findViewById(R.id.n1);
        etSecond=findViewById(R.id.n2);
        etResult=findViewById(R.id.res);
        rg=findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(this);


    }

    public void onCheckedChanged(RadioGroup rg,int id)
    {
        double first=0,second = 0;
        if(etFirst.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Enter First Number", Toast.LENGTH_SHORT).show();

        else
            first=Double.parseDouble((etFirst.getText().toString()));

        if(etSecond.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Enter Second Number", Toast.LENGTH_SHORT).show();

        else
            second=Double.parseDouble((etSecond.getText().toString()));


        double result = 0;
        switch (id)
        {
            case R.id.add :
                result = first+second;
                break;

            case R.id.sub :
                result = first-second;
                break;

            case R.id.mul :
                result = first*second;
                break;

            case R.id.div :
                result = first/second;
                break;

        }

        Double res = new Double(result);
        etResult.setText(res.toString());


    }

}
