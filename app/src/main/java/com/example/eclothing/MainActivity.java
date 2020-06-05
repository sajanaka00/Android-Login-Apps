package com.example.eclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accUsername = username.getText().toString();
                String accPassword = password.getText().toString();

                // Validating the login form
                if(username.getText().toString().equals("") || password.getText().toString().equals("")) {
                    // If name or password is not entered
                    System.out.println("Both Username and Password are required!");
                }
                else {
                    System.out.println("Username: " +accUsername);
                    System.out.println("Password: " +accPassword);
                }
            }
        });
    }

}