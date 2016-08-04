package com.example.steve.test10_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String easyMessage = intent.getExtras().getString("message");

        TextView textView = (TextView) findViewById(R.id.nameText);
        textView.setText(easyMessage);

        String message2 = intent.getExtras().getString("message2");
        TextView textView2 = (TextView) findViewById(R.id.lastText);
        textView2.setText(message2);

    }

}
