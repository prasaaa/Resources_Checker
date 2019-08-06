package com.prasa.rchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView bgapp;
    Animation loganim;
    LinearLayout textsplash,logintext,menus;
    private CardView c_view1,c_view2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        //clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        logintext = (LinearLayout) findViewById(R.id.logintext);
        menus = (LinearLayout) findViewById(R.id.menus);

        bgapp.animate().translationY(-1000).setDuration(6000).setStartDelay(0);

        textsplash.animate().translationY(140).alpha(0).setDuration(4000).setStartDelay(500);
        menus.animate().translationY(140).setStartDelay(8000).setDuration(8000);

       // loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

       // bganim = AnimationUtils.loadAnimation(this,R.anim.bganim);


        logintext.startAnimation(loganim);
        menus.startAnimation(loganim);


        c_view1 = (CardView) findViewById(R.id.cardview_Emp_Mgt_1);//define cardview
        c_view2 = (CardView) findViewById(R.id.cardview_Emp_Mgt_2);//define cardview

        //add click listner
        c_view1.setOnClickListener(this);
        c_view2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardview_Emp_Mgt_1: i = new Intent(this,Emp_Main_Activity.class);startActivity(i);
                break;
            case R.id.cardview_Emp_Mgt_2: i = new Intent(this,Emp_View_Activity.class);startActivity(i);
                break;
                default:break;
        }
    }
}
