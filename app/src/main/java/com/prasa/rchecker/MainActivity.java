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
    private ImageView bgapp;
    private Animation loganim;
    private LinearLayout textsplash,logintext,main_1,main_2;
    private CardView Main_c_view1,Main_c_view2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        //clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        logintext = (LinearLayout) findViewById(R.id.logintext);
        main_1 = (LinearLayout) findViewById(R.id.main_1);
        main_2 = (LinearLayout) findViewById(R.id.main_1);

        bgapp.animate().translationY(-1000).setDuration(6000).setStartDelay(0);

        textsplash.animate().translationY(140).alpha(0).setDuration(4000).setStartDelay(500);
        main_1.animate().setDuration(8000).setStartDelay(300);
        main_2.animate().setDuration(8000).setStartDelay(300);
        //menus.animate().translationY(140).setStartDelay(8000).setDuration(8000);



        logintext.startAnimation(loganim);
       // menus.startAnimation(loganim);
        main_1.startAnimation(loganim);
        main_2.startAnimation(loganim);



        Main_c_view1 = (CardView) findViewById(R.id.cardview_Main_5);//define cardview
        Main_c_view2 = (CardView) findViewById(R.id.cardview_Main_2);//define cardview

        //add click listner
        Main_c_view1.setOnClickListener(this);
        Main_c_view2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardview_Main_5: i = new Intent(this,Emp_Main_Activity.class);startActivity(i);
                break;
            case R.id.cardview_Main_2: i = new Intent(this,Emp_View_Activity.class);startActivity(i);
                break;
                default:break;
        }
    }
}
