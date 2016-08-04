package com.example.steve.test10_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void moveNext(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.text1);
        String passMessage = editText1.getText().toString();
        intent.putExtra("message", passMessage);
        EditText editText2 = (EditText) findViewById((R.id.text2));
        String passMessage2 = editText2.getText().toString();
        intent.putExtra("message2", passMessage2);

        startActivity(intent);

    }
}
