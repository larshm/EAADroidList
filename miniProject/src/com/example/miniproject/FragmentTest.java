package com.example.miniproject;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentTest extends Fragment {
	ArrayList<Vare> varer = new ArrayList<Vare>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_test, container, false);
		
		varer.add(new Vare("lars", 123, 123.0, VolumeUnit.kilogram));
		
		
		
//		((ListView)view).setAdapter(new ArrayAdapter<Vare>(view.getContext(), android.R.layout.simple_list_item_1, varer));
		
		return view;
	}
	
	
}
