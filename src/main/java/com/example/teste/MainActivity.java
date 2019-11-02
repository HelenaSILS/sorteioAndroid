package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){
        TextView textView = findViewById(R.id.text_r);
        EditText editText = findViewById(R.id.editText);

        int max = 0;

        try {
            max = Integer.parseInt(editText.getText().toString());
        }catch (NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

        Random random = new Random(System.currentTimeMillis());
        int res = new Random().nextInt(max+1);

        textView.setText("->" + res);

    }
}
