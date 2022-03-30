package com.emre.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button topla,fark,carp,bol;
    EditText first,second;
    TextView sonuc,test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topla=findViewById(R.id.topla);
        fark=findViewById(R.id.fark);
        carp =findViewById(R.id.carp);
        bol =findViewById(R.id.bol);
        first = findViewById(R.id.firstNumber);
        second=findViewById(R.id.secondNumber);
        sonuc=findViewById(R.id.textView);
        test =findViewById(R.id.textView2);
    }
    public void calculate(View view){
        double result,s1,s2;
        if (first.getText().toString().matches("") || second.getText().toString().matches(""))
            result=0;
        else
        {

            s1 = Double.parseDouble(first.getText().toString());
            s2 = Double.parseDouble(second.getText().toString());
            switch (view.getId()) {
                case R.id.topla:
                    result = s1 + s2;
                    break;
                case R.id.carp:
                    result = s1 * s2;
                    break;
                case R.id.fark:
                    result = s1 - s2;
                    break;
                case R.id.bol:
                    if (s2==0)
                        result =0;
                    else
                        result = s1 / s2;
                    break;
                default:
                    result = 0;
                    break;
            }
        }
        //test.setText("id="+view.getId());
        sonuc.setText("sonuc:"+result);
    }
}