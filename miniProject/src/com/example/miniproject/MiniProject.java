package com.example.miniproject;

import java.util.ArrayList;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MiniProject extends Activity implements OnVareSelectedListener {
	private ArrayList<Vare> currShoppingList;
	
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
        
        currShoppingList = new ArrayList<Vare>();
        
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
//    							.setTabListener(new DroidListTabListener<FragmentTest>(this, "shoppingliste", FragmentTest.class));
    							.setTabListener(new DroidListTabListener<ShoppingListeFragment>(this, "shoppingliste", ShoppingListeFragment.class));
        
        ab.addTab(tabShoppingListe);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mini_project, menu);
        return true;
    }

    public ArrayList<Vare> getCurrentShoppingList() {
    	return currShoppingList;
    }
    
	public void onVareSelected(int position, Vare vare) {
//		ShoppingListeFragment slf = (ShoppingListeFragment)getFragmentManager().findFragmentById(R.id.shoppingListe);
//		slf.addVareToShoppingListe(vare);
		currShoppingList.add(vare);
	}
}
