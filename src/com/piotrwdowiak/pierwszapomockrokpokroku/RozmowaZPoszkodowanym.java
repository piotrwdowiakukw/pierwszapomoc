package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RozmowaZPoszkodowanym extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rozmowa_z_poszkodowanym);
		initializeWidgets();
	}
	
	public void initializeWidgets() {
		
		b1 = (Button) findViewById(R.id.buttonKrwawi);
		b2 = (Button) findViewById(R.id.buttonInnyProblem);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonKrwawi:
			intent = new Intent(getApplicationContext(), Krwawienie.class);
			break;
		case R.id.buttonInnyProblem:
			intent = new Intent(getApplicationContext(), WzywaniePomocy.class);
			break;
		}
		if (intent!=null)
		startActivity(intent);
		

	}

}
