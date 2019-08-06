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

public class Emp_Main_Activity extends AppCompatActivity implements View.OnClickListener{

    private CardView c_view_Emp1,c_view_Emp2;
    private ImageView bgapp;
    private Animation loganim;
    private LinearLayout logintext,emp_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_main);

        loganim = AnimationUtils.loadAnimation(this,R.anim.loganim);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        logintext = (LinearLayout) findViewById(R.id.logintext);
        emp_menu = (LinearLayout) findViewById(R.id.emp_menu);

        bgapp.animate().translationY(-1000).setDuration(3000).setStartDelay(0);
        emp_menu.animate().setStartDelay(1000).setStartDelay(2000);

        logintext.startAnimation(loganim);
        emp_menu.startAnimation(loganim);

        c_view_Emp1 = (CardView) findViewById(R.id.cardview_Emp_Mgt_1);//define cardview
        c_view_Emp2 = (CardView) findViewById(R.id.cardview_Emp_Mgt_2);//define cardview

        //add click listner
        c_view_Emp1.setOnClickListener(this);
        c_view_Emp2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardview_Emp_Mgt_1: i = new Intent(this,Emp_Add_Activity.class);startActivity(i);
                break;
            case R.id.cardview_Emp_Mgt_2: i = new Intent(this,Emp_View_Activity.class);startActivity(i);
                break;
            default:break;
        }
    }
}
