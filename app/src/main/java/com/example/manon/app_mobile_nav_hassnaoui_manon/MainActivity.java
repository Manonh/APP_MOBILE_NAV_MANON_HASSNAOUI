package com.example.manon.app_mobile_nav_hassnaoui_manon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int RESULT_SELECTION=1;
    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create=(Button) findViewById(R.id.creation);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }
        });
    }


    //retour de l'activité avec des résultat
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        Toast.makeText(MainActivity.this, intent.getStringExtra("pseudo"), Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, intent.getStringExtra("mdp"), Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, intent.getStringExtra("email"), Toast.LENGTH_SHORT).show();

        Log.v("user name: ", intent.getStringExtra("pseudo"));
        Log.v("user pass: ", intent.getStringExtra("mdp"));
        Log.v("user mail: ", intent.getStringExtra("email"));


    }

    private void goToNextActivity(){
        Intent intent = new Intent(MainActivity.this, creation.class);
        startActivityForResult(intent, RESULT_SELECTION);
    }
}
