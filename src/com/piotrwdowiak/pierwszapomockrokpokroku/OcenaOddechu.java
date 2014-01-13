package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OcenaOddechu extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ocena_oddechu);
		initializeWidgets();
	}
	
	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonOddycha);
		b2 = (Button) findViewById(R.id.buttonNieOddycha);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonNieOddycha:
			intent = new Intent(getApplicationContext(), BrakOddechu.class);
			break;
		case R.id.buttonOddycha:
			intent = new Intent(getApplicationContext(), JestOddech.class);

			break;
		}
		if(intent!=null) {
			startActivity(intent);
		}
		
		
	}

}
