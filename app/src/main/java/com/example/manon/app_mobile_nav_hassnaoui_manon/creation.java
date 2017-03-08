package com.example.manon.app_mobile_nav_hassnaoui_manon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class creation extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private EditText mail;
    private Button valid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);

        name=(EditText) findViewById(R.id.editName);
        pass=(EditText) findViewById(R.id.editPass);
        mail=(EditText) findViewById(R.id.editMail);
        valid=(Button)findViewById(R.id.Bvalider);

        valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToNextActivity();
                result();
            }
        });

    }

    private void result(){
        Intent intent = new Intent();

        intent.putExtra("pseudo", name.getText().toString());
        intent.putExtra("mdp", pass.getText().toString());
        intent.putExtra("email", mail.getText().toString());

        setResult(RESULT_OK, intent);
        finish();
    }

    private void goToNextActivity(){
        Intent intent = new Intent(creation.this, MainActivity.class);
        startActivity(intent);
    }
}
