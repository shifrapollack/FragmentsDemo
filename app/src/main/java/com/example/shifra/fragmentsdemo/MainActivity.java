package com.example.shifra.fragmentsdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction ft = fragmentManager.beginTransaction();
//
//        //detect orientation
//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
//            FragmentA fragmentA = new FragmentA();
//            ft.replace(android.R.id.content, fragmentA);
//        } else {
//            FragmentB fragmentB = new FragmentB();
//            ft.replace(android.R.id.content, fragmentB);
//        }
//
//        ft.commit();
    }


}
