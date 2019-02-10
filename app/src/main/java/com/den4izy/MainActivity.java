package com.den4izy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private TextView mHelloTextView;
    private EditText mHelloTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.textView);
        mHelloTextView2 = findViewById(R.id.editText);
    }

    public void MyClick(View view) {
        mHelloTextView.setText("Hello " + mHelloTextView2.getText());
    }
}
