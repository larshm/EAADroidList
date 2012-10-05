package com.example.miniproject;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MiniProject extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_project);
        
        ActionBar ab = getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.setDisplayShowTitleEnabled(false);
        
        Tab tabVareListe = ab.newTab()
        					.setText(R.string.vareliste_tab)
        					.setTabListener(new DroidListTabListener<VareListeFragment>(this, "vareliste", VareListeFragment.class));
        
        ab.addTab(tabVareListe);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mini_project, menu);
        return true;
    }
    
    
}
