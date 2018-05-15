package com.quiz.sistemar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity1 extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        siguiente = (Button)findViewById(R.id.btn1);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent siguiete = new Intent(MainActivity1.this, MainActivity2.class);
            }
        });


    }


}
