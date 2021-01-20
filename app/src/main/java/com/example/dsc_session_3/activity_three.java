package com.example.dsc_session_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class activity_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Hey", Toast.LENGTH_SHORT).show();
    }
}