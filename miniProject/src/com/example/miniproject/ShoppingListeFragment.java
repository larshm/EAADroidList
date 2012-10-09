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
import android.widget.TextView;

public class ShoppingListeFragment extends ListFragment {
	ArrayList<Vare> currShoppinglistVarer;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		if(currShoppinglistVarer == null)
			currShoppinglistVarer = new ArrayList<Vare>();
		
		Log.v("LARSLOL", currShoppinglistVarer.size()+"");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.shoppinglist_fragment, container, false);
		//return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
		MiniProject mp = (MiniProject)getActivity();
		
		setListAdapter(new ArrayAdapter<Vare>(getListView().getContext(), android.R.layout.simple_list_item_1, mp.getCurrentShoppingList()));
		
		double sum = 0.0;
		for(Vare v : mp.getCurrentShoppingList())
			sum += v.getPris();
		
		((TextView)getView().findViewById(R.id.sum_text)).setText("Pris i alt: " + sum);
		
		mp = null;
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
}
