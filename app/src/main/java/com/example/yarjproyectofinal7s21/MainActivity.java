package com.example.yarjproyectofinal7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //agregar animaciones

        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);
        Animation animacion3 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_derecha);

        View animacion = findViewById(R.id.animacionone);
        ImageView tesoem = findViewById(R.id.logo);
        TextView texto = findViewById(R.id.textPortada);

        tesoem.setAnimation(animacion2);
        animacion.setAnimation(animacion1);
        texto.setAnimation(animacion3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Principal.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}