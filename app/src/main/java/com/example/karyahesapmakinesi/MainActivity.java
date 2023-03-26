package com.example.karyahesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.karyahesapmakinesi.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    boolean toplama, cikarma, carpma, bolme, yuzde;
    boolean virgul=true;
    float deger1,deger2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main);


        tasarim.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("0");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "0");

                }
            }
        });

        tasarim.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("1");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "1");

                }
            }
        });

        tasarim.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("2");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "2");

                }
            }
        });

        tasarim.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("3");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "3");

                }
            }
        });

        tasarim.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("4");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "4");

                }
            }
        });

        tasarim.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("5");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "5");

                }
            }
        });

        tasarim.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("6");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "6");

                }
            }
        });

        tasarim.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("7");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "7");

                }
            }
        });

        tasarim.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("8");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "8");

                }
            }
        });

        tasarim.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tasarim.sonuc.getText().equals("0")) {

                    tasarim.sonuc.setText("9");
                } else {
                    tasarim.sonuc.setText(tasarim.sonuc.getText() + "9");

                }
            }
        });

        tasarim.buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tasarim.sonuc.setText("0");
                virgul = true;
            }
        });

        tasarim.buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (virgul == true) {

                    tasarim.sonuc.setText(tasarim.sonuc.getText()+".");
                    virgul = false;
                }
            }
        });

        tasarim.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String x = String.valueOf(tasarim.sonuc.getText());
                x=x.substring(0,x.length()-1);

                if(x.length()==0){
                    x="0";
                }
                int m=0;
                while(x.length()>m){
                    if(x.charAt(m)=='.'){
                        virgul=false;
                        break;
                    }
                    else{
                        virgul=true;
                    }
                    m++;
                }
                tasarim.sonuc.setText(x);
            }

        });

        tasarim.buttonArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tasarim.sonuc.getText().equals("0")){
                    tasarim.sonuc.setText("0");

                }
                else{

                    deger1=Float.parseFloat(tasarim.sonuc.getText()+"");
                    toplama=true;
                    tasarim.sonuc.setText("0");
                    virgul=true;
                }
            }
        });

        tasarim.buttonEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(tasarim.sonuc.getText()+"");
                cikarma=true;
                tasarim.sonuc.setText("0");
                virgul=true;
            }
        });

        tasarim.buttonBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(tasarim.sonuc.getText()+"");
                bolme=true;
                tasarim.sonuc.setText("0");
                virgul=true;
            }
        });

        tasarim.buttonCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat((tasarim.sonuc.getText()+""));
                carpma=true;
                tasarim.sonuc.setText("");
                virgul=true;
            }
        });

        tasarim.buttonYuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat((tasarim.sonuc.getText()+""));
                yuzde=true;
                tasarim.sonuc.setText("");
                virgul=true;
            }
        });

        tasarim.buttonEsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger2=Float.parseFloat(tasarim.sonuc.getText()+"");
                if(toplama==true){
                    tasarim.sonuc.setText(deger1+deger2+"");
                    tasarim.islem.setText(deger1+"+"+deger2);
                    toplama=false;
                    virgul=true;
                }
                if(cikarma==true){
                    tasarim.sonuc.setText(deger1-deger2+"");
                    tasarim.islem.setText(deger1+"-"+deger2);
                    cikarma=false;
                    virgul=true;
                }
                if(carpma==true){
                    tasarim.sonuc.setText((deger1*deger2+""));
                    tasarim.islem.setText(deger1+"x"+deger2);
                    carpma=false;
                    virgul=true;
                }
                if(bolme==true){
                    tasarim.sonuc.setText(deger1/deger2+"");
                    tasarim.islem.setText(deger1+"÷"+deger2);
                    bolme=false;
                    virgul=true;
                }
                if(yuzde==true){
                    tasarim.sonuc.setText(deger1*deger2/100+"");
                    tasarim.islem.setText(deger1+"%"+deger2);
                    yuzde=false;
                    virgul=true;
                }
            }
        });



    }
}