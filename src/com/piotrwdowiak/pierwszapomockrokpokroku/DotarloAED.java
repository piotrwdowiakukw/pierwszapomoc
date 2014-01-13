package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DotarloAED extends Activity implements OnClickListener {

	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dotarlo_aed);
		initializeWidgets();
	}

	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonDotarloAEDPrzyjechalySluzby);
		b2 = (Button) findViewById(R.id.buttonDotarloAEDReaguje);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;

		switch (v.getId()) {
		case R.id.buttonDotarloAEDPrzyjechalySluzby:
			intent = new Intent(getApplicationContext(), PrzyjazdSluzb.class);
			break;
		case R.id.buttonDotarloAEDReaguje:
			intent = new Intent(getApplicationContext(), OcenaOddechu.class);
			break;
		}

		if (intent != null) {
			startActivity(intent);
		}

	}

}
