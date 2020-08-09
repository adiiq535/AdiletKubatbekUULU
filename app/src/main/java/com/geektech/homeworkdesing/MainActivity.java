package com.geektech.homeworkdesing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = findViewById(R.id.et_login);
        final EditText pass = findViewById(R.id.et_pass);
        final TextView textView = findViewById(R.id.tv_error);
        findViewById(R.id.btn_enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText() == null || pass.getText() == null){
                    textView.setText("Вы вели не правильные данные");
                }else {
                    textView.setText("Успешно");
                }
            }
        });
    }
}