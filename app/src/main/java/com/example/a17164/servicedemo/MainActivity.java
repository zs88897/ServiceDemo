package com.example.a17164.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startService(View view){
        startService(new Intent(getBaseContext(),ServiceDemo.class));
    }
//    public void bindService(View view){
//        bindService(new Intent(),);
//    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(),ServiceDemo.class));
    }
}
