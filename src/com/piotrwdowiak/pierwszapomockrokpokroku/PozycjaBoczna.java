package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PozycjaBoczna extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pozycja_boczna);
		initializeWidgets();
	}
	
	
	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonPozycjaBocznaStracilOddech);
		b2 = (Button) findViewById(R.id.buttonPozycjaBocznaPrzyjechaloPogotowie);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonPozycjaBocznaStracilOddech:
			intent = new Intent(getApplicationContext(), BrakOddechu.class);
			break;
		case R.id.buttonPozycjaBocznaPrzyjechaloPogotowie:
			intent = new Intent(getApplicationContext(), PrzyjazdSluzb.class);

			break;
		}
		if(intent!=null) {
			startActivity(intent);
		}
		
		
	}
}
