package com.example.miniproject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Service {
	public static ArrayList<Vare> getAllVarer(Context context) {
		DroidListDatabaseHelper dbh = new DroidListDatabaseHelper(context);
		SQLiteDatabase db = dbh.getReadableDatabase();

		Cursor cur = db.rawQuery("SELECT * FROM Varer", null);

		ArrayList<Vare> varer = new ArrayList<Vare>();
		while (cur.moveToNext()) {
			String navn = cur.getString(cur.getColumnIndex("navn"));
			int volume = cur.getInt(cur.getColumnIndex("volume"));
			double pris = cur.getDouble(cur.getColumnIndex("pris"));
			VolumeUnit vu = VolumeUnit.values()[cur.getInt(cur
					.getColumnIndex("volumeUnit"))];
			varer.add(new Vare(navn, volume, pris, vu));
		}

		return varer;
	}

	public static void storeData(Context context) {
		DroidListDatabaseHelper dbh = new DroidListDatabaseHelper(context);
		SQLiteDatabase dbDatabase = dbh.getWritableDatabase();
		
//ShoppingListeFragment slf = MiniProject
	}
}