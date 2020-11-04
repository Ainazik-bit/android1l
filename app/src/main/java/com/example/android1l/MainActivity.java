package com.example.android1l;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button knopka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        knopka = findViewById(R.id.knopka);

        knopka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login != null && password.length()>5)
                {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Не правильный логин или пароль", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}