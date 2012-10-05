package com.example.miniproject;

import java.util.ArrayList;
import java.util.List;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class VareListeFragment extends ListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = super.onCreateView(inflater, container, savedInstanceState);
		
		List<String> arrTest = new ArrayList<String>();
		arrTest.add("Test 1");
		arrTest.add("Test 2");
		arrTest.add("Test 3");		
		
		setListAdapter(new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, arrTest));
		
		return v;
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
