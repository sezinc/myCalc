package com.sezinc.mycalc;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTxt;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnErase,btnEqual,btnPlus,btnMinus,btnDivide,btnMultiply;
    double sayi1=0;
    double sayi2=0;
    double sonuc=0;
    String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxt = (EditText) findViewById(R.id.editText);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnErase = (Button) findViewById(R.id.btnErase);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnErase.setOnClickListener(this);

    }
    public void onClick(View v){

        if(v.equals(btn0))
        {
            editTxt.setText(editTxt.getText() + "0");
        }
        else if(v.equals(btn1))
        {
            editTxt.setText(editTxt.getText() + "1");
        }
        else if(v.equals(btn2))
        {
            editTxt.setText(editTxt.getText() + "2");
        }
        else if(v.equals(btn3))
        {
            editTxt.setText(editTxt.getText() + "3");
        }
        else if(v.equals(btn4))
        {
            editTxt.setText(editTxt.getText() + "4");
        }
        else if(v.equals(btn5))
        {
            editTxt.setText(editTxt.getText() + "5");
        }
        else if(v.equals(btn6))
        {
            editTxt.setText(editTxt.getText() + "6");
        }
        else if(v.equals(btn7))
        {
            editTxt.setText(editTxt.getText() + "7");
        }
        else if(v.equals(btn8))
        {
            editTxt.setText(editTxt.getText() + "8");
        }
        else if(v.equals(btn9))
        {
            editTxt.setText(editTxt.getText() + "9");
        }
        else if(v.equals(btnPlus))
        {
            if(!(editTxt.getText().toString().equals("")))
            {
                sayi1 =Double.parseDouble(editTxt.getText().toString());
                editTxt.setText("");
                islem ="+";
            }
        }

        else if(v.equals(btnDivide))
        {
            if(!(editTxt.getText().toString().equals("")))
            {
                sayi1 =Double.parseDouble(editTxt.getText().toString());
                editTxt.setText("");
                islem ="/";
            }
        }
        else if(v.equals(btnMultiply))
        {
            if(!(editTxt.getText().toString().equals("")))
            {
                sayi1 =Double.parseDouble(editTxt.getText().toString());
                editTxt.setText("");
                islem ="*";
            }
        }
        else if(v.equals(btnMinus))
        {
            if(!(editTxt.getText().toString().equals("")))
            {
                sayi1 =Double.parseDouble(editTxt.getText().toString());
                editTxt.setText("");
                islem ="-";
            }
        }

        else if(v.equals(btnErase))
        {
            editTxt.setText("");
            islem="";
            sayi1=0;
            sayi2=0;
        }
        else //(v.equals(btnEqual))
        {
          sayi2=Double.parseDouble(editTxt.getText().toString());
            if(islem.equals("+"))
            {
                sonuc = sayi1+sayi2;
                sayi1=0;
                sayi2=0;
            }
            else if(islem.equals("-"))
            {
                sonuc = sayi1-sayi2;
                sayi1=0;
                sayi2=0;
            }
            else if(islem.equals("*"))
            {
                sonuc = sayi1*sayi2;
                sayi1=0;
                sayi2=0;
            }
            else if(islem.equals("/"))
            {
                sonuc = sayi1/sayi2;
                sayi1=0;
                sayi2=0;
            }
            editTxt.setText(Double.toString(sonuc));
        }

    }

}
