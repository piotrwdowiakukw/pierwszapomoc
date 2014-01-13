package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Resuscytacja extends Activity implements OnClickListener {

	Button b1, b2, b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resuscytacja);
		initializeWidgets();
	}

	private void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonResuscytacjaPrzyjazdPomocy);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.buttonResuscytacjaPoszkodowanyReaguje);
		b2.setOnClickListener(this);
		b3 = (Button) findViewById(R.id.buttonResuscytacjaDotarloAED);
		b3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;
		switch (v.getId()) {
		case R.id.buttonResuscytacjaPrzyjazdPomocy:
			intent = new Intent(getApplicationContext(), PrzyjazdSluzb.class);
			break;
		case R.id.buttonResuscytacjaPoszkodowanyReaguje:
			intent = new Intent(getApplicationContext(), OcenaOddechu.class);
			break;

		case R.id.buttonResuscytacjaDotarloAED:
			intent = new Intent(getApplicationContext(), DotarloAED.class);
			break;
		}
		if (intent != null)
			startActivity(intent);
	}
}
