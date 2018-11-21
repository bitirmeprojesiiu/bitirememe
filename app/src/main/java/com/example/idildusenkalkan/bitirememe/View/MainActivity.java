package com.example.idildusenkalkan.bitirememe.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.idildusenkalkan.bitirememe.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button exit = (Button) findViewById(R.id.button2);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }

        });
    }

    public void needAuthentication(View view){
        final Intent intent = new Intent(getBaseContext(), AuthenticationActivity.class);
         startActivity(intent);
    }
}