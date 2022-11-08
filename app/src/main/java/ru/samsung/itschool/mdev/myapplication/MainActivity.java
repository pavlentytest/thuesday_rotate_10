package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private int counter = 0;
    private TextView tv;
    public static final String KEY = "val";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRRR","onCreate()");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> incCounter());
        tv = findViewById(R.id.textView);
    }

    public void incCounter() {
        counter++;
        tv.setText(Integer.toString(counter));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY,counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(KEY);
        tv.setText(Integer.toString(counter));
    }

    /*
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {

        } else {

        }
    }
  */









    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRRR","onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRRR","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRRR","onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRRR","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRRR","onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRRR","onResume()");
    }


}