package com.acadview.sqlite_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class updateDelete extends AppCompatActivity {

    EditText Name ,UpdateName;
    Button Delete, Update;

    private DBClass dbClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);

        Name = findViewById(R.id.nameEdit);
        UpdateName = findViewById(R.id.updateName);
        Delete = findViewById(R.id.delete);
        Update = findViewById(R.id.update);

        dbClass = new DBClass(this);



        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dbClass.onDelete(Name.getText().toString());

            }
        });

        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbClass.onUpdate(Name.getText().toString());

            }
        });

    }
}
