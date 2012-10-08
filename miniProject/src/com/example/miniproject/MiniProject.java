package com.example.miniproject;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;

public class MiniProject extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_project);
        
        //init db
//        DroidListDatabaseHelper dbh = new DroidListDatabaseHelper(getApplicationContext());
//        SQLiteDatabase db = dbh.getReadableDatabase();
//        
//        ContentValues cv = new ContentValues();
//        cv.put("navn", "PS3");
//        cv.put("volume", 10);
//        cv.put("pris", 2300);
//        cv.put("volumeUnit", 0);
//        
//        db.insert("Varer", "id", cv);
//        
//        cv = new ContentValues();
//        cv.put("navn", "Xbox 360");
//        cv.put("volume", 10);
//        cv.put("pris", 2500);
//        cv.put("volumeUnit", 1);
//        
//        db.insert("Varer", "id", cv);
        
        //init actionbar
        ActionBar ab = getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.setDisplayShowTitleEnabled(false);
        
        Tab tabVareListe = ab.newTab()
        					.setText(R.string.vareliste_tab)
        					.setTabListener(new DroidListTabListener<VareListeFragment>(this, "vareliste", VareListeFragment.class));
        
        ab.addTab(tabVareListe);
        
        Tab tabShoppingListe = ab.newTab()
    							.setText(R.string.shoppingliste_tab)
    							.setTabListener(new DroidListTabListener<ShoppingListeFragment>(this, "shoppingliste", ShoppingListeFragment.class));
        
        ab.addTab(tabShoppingListe);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mini_project, menu);
        return true;
    }
}
