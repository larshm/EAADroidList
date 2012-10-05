package com.example.miniproject;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.view.*;

public class shoplist extends Fragment{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.shoplist, container, false);
    }


	/* (non-Javadoc)
	 * @see android.app.Fragment#onPause()
	 */
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	
}
