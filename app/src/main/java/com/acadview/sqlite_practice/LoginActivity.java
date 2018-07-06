package com.acadview.sqlite_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button Registration,Login,ShowDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login = findViewById(R.id.login);
        Registration = findViewById(R.id.register);
        ShowDetail = findViewById(R.id.show);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);



            }
        });



        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);

                    }
        });



        ShowDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,ShowActivity.class);
                startActivity(intent);
            }
        });




    }
}
