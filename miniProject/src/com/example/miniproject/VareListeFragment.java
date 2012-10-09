package com.example.miniproject;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class VareListeFragment extends ListFragment {
	OnVareSelectedListener mCallback;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
		setListAdapter(new ArrayAdapter<Vare>(getView().getContext(), android.R.layout.simple_list_item_1, Service.getAllVarer(getView().getContext())));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Activity a = getActivity();
		
		if(a != null) {
			ListAdapter la = getListAdapter();
			Vare vare = (Vare)la.getItem(position);
			
			if(mCallback != null)
				mCallback.onVareSelected(position, vare);
		}				
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		try {
			mCallback = (OnVareSelectedListener)activity;
		}
		catch(ClassCastException cce) {
			cce.printStackTrace();
		}
	}
}
