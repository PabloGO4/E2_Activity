package com.example.e2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnClickBtn (View view){
        Intent i = new Intent(this,VisualizarColor.class);
        switch (view.getId()){
            case R.id.Ptn1:

                break;
            case R.id.Ptn2:

                break;
            case R.id.Ptn3:

                break;
            case R.id.Ptn4:

                break;
        }
    }
}