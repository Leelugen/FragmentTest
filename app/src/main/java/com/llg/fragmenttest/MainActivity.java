package com.llg.fragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


/**
 * 探究activity 与fragment生命周期的关系
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG," Aty onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.e(TAG," Aty onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG," Aty onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG," Aty onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.e(TAG," Aty onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG," Aty onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG," Aty onDestroy");
        super.onDestroy();
    }
}
