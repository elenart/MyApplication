package com.example.larton.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button thirdButton = (Button) findViewById(R.id.thirdButton);
        Button Submit = (Button) findViewById(R.id.Submit);

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);

        firstButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("First button");
            }
        });
        secondButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("secondButton");
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("thirdButton");
            }
        });
        Submit.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(editText1.getText().toString() + " " + editText2.getText().toString());
            }
        });
    }

}
