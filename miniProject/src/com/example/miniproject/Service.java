package com.example.miniproject;

import java.util.ArrayList;

import android.app.*;
import android.content.*;
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
		db.close();
		return varer;
	}

	/**
	 * 
	 * @param context
	 * @param arr
	 */
	public static void storeData(Context context, ArrayList<Vare> arr) {
		DroidListDatabaseHelper dbh = new DroidListDatabaseHelper(context);
		SQLiteDatabase db = dbh.getWritableDatabase();

		for (Vare vare : arr) {
			ContentValues cv = new ContentValues();
			cv.put("navn", vare.getNavn());
			cv.put("volume", vare.getVolume());
			cv.put("pris", vare.getPris());
			cv.put("volumeUnit", vare.getVolumeUnit().toString());

			db.insert("Varer", "id", cv);//Check hvad vi gør med id

		}
		db.close();
	}
}