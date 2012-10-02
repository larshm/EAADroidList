package com.example.miniproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MiniProject extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_project);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mini_project, menu);
        return true;
    }
    
}
