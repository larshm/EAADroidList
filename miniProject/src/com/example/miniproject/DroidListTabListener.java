package com.example.miniproject;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class DroidListTabListener<T extends Fragment> implements TabListener {
	private Fragment fragment;
	private final Activity activity;
	private final String tag;
	private final Class<T> mClass;
	
	public DroidListTabListener(Activity activity, String tag, Class<T> clz) {
		this.activity = activity;
		this.tag = tag;
		this.mClass = clz;
	}
	
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		if(fragment == null) {
			fragment = Fragment.instantiate(activity, mClass.getName());
			ft.add(android.R.id.content, fragment, tag);
		}
		else {
			ft.attach(fragment);
		}
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		if(fragment != null)
			ft.detach(fragment);
	}

}
