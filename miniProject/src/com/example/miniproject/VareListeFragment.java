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
			
			ShoppingListeFragment slf = (ShoppingListeFragment)getFragmentManager().findFragmentById(R.id.shoppingListe);
			slf.addVareToShoppingListe(vare);
		}				
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
