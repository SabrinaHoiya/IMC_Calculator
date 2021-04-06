package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this

        setContentView(R.layout.activity_main);

        Button calculate_button = findViewById(R.id.cal) ;
        EditText height_value= findViewById(R.id.tail);
        EditText weight_value = findViewById(R.id.poid);

        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {
                if (height_value.getText().length() >0 && weight_value.getText().length() >0){
                    float height = Float.parseFloat(height_value.getText().toString());
                    float weight = Float.parseFloat(weight_value.getText().toString());
                    float imc = CalculateIMC (weight, height);

                    if (imc <16){
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle(Html.fromHtml("<font color='#E91E63'>Votre IMC=  </font>"+imc+"<font color='#E91E63'>... OOPS ..Vous etes Trop Maigre</font>"));


                        builder.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();

                        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                        //Set positive button background
                        pbutton.setBackgroundColor(Color.YELLOW);
                        //Set positive button text color
                        pbutton.setTextColor(Color.MAGENTA);
                    }
                    else if (imc <18.5){
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle(Html.fromHtml("<font color='#E91E63'>Votre IMC=  </font>"+imc+"<font color='#E91E63'>... OOPS ..Vous etes Maigre</font>"));


                        builder.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();

                        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                        //Set positive button background
                        pbutton.setBackgroundColor(Color.YELLOW);
                        //Set positive button text color
                        pbutton.setTextColor(Color.MAGENTA);
                    }
                    else if (imc <25){
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle(Html.fromHtml("<font color='#E91E63'>Votre IMC=  </font>"+imc+"<font color='#E91E63'>... OOPS ..Vous etes Normal</font>"));


                        builder.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();

                        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                        //Set positive button background
                        pbutton.setBackgroundColor(Color.YELLOW);
                        //Set positive button text color
                        pbutton.setTextColor(Color.MAGENTA);                }
                    else if (imc <30){
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle(Html.fromHtml("<font color='#E91E63'>Votre IMC=  </font>"+imc+"<font color='#E91E63'>... OOPS ..Vous etes Gros(se)</font>"));


                        builder.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();

                        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                        //Set positive button background
                        pbutton.setBackgroundColor(Color.YELLOW);
                        //Set positive button text color
                        pbutton.setTextColor(Color.MAGENTA);                      }
                    else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle(Html.fromHtml("<font color='#E91E63'>Votre IMC=  </font>"+imc+"<font color='#E91E63'>... OOPS ..Vous etes obése </font>"));


                        builder.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();

                        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                        //Set positive button background
                        pbutton.setBackgroundColor(Color.YELLOW);
                        //Set positive button text color
                        pbutton.setTextColor(Color.MAGENTA);                 }

                }
            }
        });

    }


    float CalculateIMC(float weight, float height){
        height= (height/100) ;
        return (float) (weight/(height*height));
    }
}
