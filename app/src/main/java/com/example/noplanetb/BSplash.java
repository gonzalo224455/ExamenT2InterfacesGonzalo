package com.example.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class BSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        TextView titulo = (TextView) findViewById(R.id.tvNombre);
        TextView frase = (TextView) findViewById(R.id.tv_Frase);
        ImageView fondo = (ImageView) findViewById(R.id.fondoPlanet);
        //CircularImageView circularImageView = (CircularImageView)findViewById(R.id.i);

        //Para la imagen del fondo

        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()


                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(fondo);

        //Animaciones
        Animation derecha= AnimationUtils.loadAnimation(this, R.anim.hacialaderecha);
        Animation izquierda=AnimationUtils.loadAnimation(this, R.anim.hacialaizquierda);
        titulo.startAnimation(derecha);
        frase.startAnimation(izquierda);

        openApp(true);
    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
