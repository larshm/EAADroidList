package com.example.miniproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DroidListDatabaseHelper extends SQLiteOpenHelper {
	static final String dbname = "EAADroidList";
	
	public DroidListDatabaseHelper(Context context) {
		super(context, dbname, null, 1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE Varer (id INTEGER PRIMARY KEY, navn TEXT, volume NUMERIC, pris NUMERIC, volumeUnit NUMERIC);");
		db.execSQL("CREATE TABLE Shoppinglists (id INTEGER PRIMARY KEY, navn TEXT);");
		db.execSQL("CREATE TABLE Shoppinglists_items (id INTEGER PRIMARY KEY, Shoppinglist_id NUMERIC, vare_id NUMERIC);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS Varer");
		db.execSQL("DROP TABLE IF EXISTS Shoppinglists");
		db.execSQL("DROP TABLE IF EXISTS Shoppinglists_items");
		onCreate(db);
	}
}
