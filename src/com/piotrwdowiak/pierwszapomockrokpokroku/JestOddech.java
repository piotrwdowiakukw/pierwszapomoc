package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class JestOddech extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jest_oddech);
		initializeWidgets();
	}

	
	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonJestOddechWidzeKrew);
		b2 = (Button) findViewById(R.id.buttonJestOddechNieMaKrwi);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonJestOddechNieMaKrwi:
			intent = new Intent(getApplicationContext(), PozycjaBoczna.class);
			break;
		case R.id.buttonJestOddechWidzeKrew:
			intent = new Intent(getApplicationContext(), Krwawienie.class);
			break;
		}
		if(intent!=null) {
			startActivity(intent);
		}
		
		
	}
}
