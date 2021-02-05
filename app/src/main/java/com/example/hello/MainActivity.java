package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button h;
    EditText t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h=(Button)findViewById(R.id.button);
        t=(EditText)findViewById(R.id.name);


        h.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String s = t.getText().toString();
                TextView vt=(TextView)findViewById(R.id.text);
                vt.setText("Hello," + s);

            }
        });

    }


}