package com.example.miniproject;

import java.util.ArrayList;

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
import android.widget.Toast;

public class ShoppingListeFragment extends ListFragment {
	ArrayList<Vare> currShoppinglistVarer;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		if(savedInstanceState != null)
			if(savedInstanceState.containsKey("shoppinglist"))
				currShoppinglistVarer = (ArrayList<Vare>)savedInstanceState.getSerializable("shoppinglist");
			else
				currShoppinglistVarer = new ArrayList<Vare>();
		else
			currShoppinglistVarer = new ArrayList<Vare>();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
		getListView().setAdapter(new ArrayAdapter<Vare>(getListView().getContext(), android.R.layout.simple_list_item_1, currShoppinglistVarer));
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		String txt = "fejl";
		
		Activity a = getActivity();
		
		if(a != null) {
			ListAdapter la = getListAdapter();
			
			
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		outState.putSerializable("shoppinglist", currShoppinglistVarer);
	}
	
	public void addVareToShoppingListe(Vare v) {
		currShoppinglistVarer.add(v);
	}
}
