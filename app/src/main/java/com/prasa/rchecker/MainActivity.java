package com.prasa.rchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView bgapp,clover;
    Animation loganim;
    LinearLayout textsplash,logintext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        //clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        logintext = (LinearLayout) findViewById(R.id.logintext);

        bgapp.animate().translationY(-1000).setDuration(4000).setStartDelay(300);
        //clover.animate().alpha(0).setDuration(500).setStartDelay(100);
        textsplash.animate().translationY(140).alpha(0).setDuration(4000).setStartDelay(300);

       // loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

       // bganim = AnimationUtils.loadAnimation(this,R.anim.bganim);




        logintext.startAnimation(loganim);
    }
}
