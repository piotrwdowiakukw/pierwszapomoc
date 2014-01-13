package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OcenaPrzytomnosci extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ocena_przytomnosci);
		initializeWidgets();
	}
	
	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonReaguje);
		b2 = (Button) findViewById(R.id.buttonNieReaguje);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonReaguje:
			intent = new Intent(getApplicationContext(), RozmowaZPoszkodowanym.class);
			break;
		case R.id.buttonNieReaguje:
			intent = new Intent(getApplicationContext(), OcenaOddechu.class);
			break;
		}
		if(intent!=null) {
			startActivity(intent);
		}
		
		
	}

}
