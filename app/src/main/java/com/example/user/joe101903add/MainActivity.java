package com.example.user.joe101903add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v)
    {
        EditText ed1 = (EditText) findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        String a = ed1.getText().toString();
        String b = ed2.getText().toString();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        TextView tv = (TextView) findViewById(R.id.textView2);
        String sum =String.valueOf(num1+num2);
        tv.setText(sum);
    }
}
