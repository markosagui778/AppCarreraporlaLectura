package com.te.unan.appestudianteswm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView nivel1,nivel2,nivel3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        nivel1 = (ImageView) findViewById(R.id.nivel1);
        nivel2 = (ImageView) findViewById(R.id.nivel2);
        nivel3 = (ImageView) findViewById(R.id.nivel3);



        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),MenuNivel1.class);
                startActivity(intent);

            }
        });

        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),MenuNivel2.class);
                startActivity(intent);

            }
        });

        nivel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),MenuNivel3.class);
                startActivity(intent);

            }
        });

    }
}
