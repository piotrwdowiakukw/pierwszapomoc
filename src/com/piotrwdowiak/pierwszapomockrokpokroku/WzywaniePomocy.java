package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WzywaniePomocy extends Activity implements OnClickListener {

	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wzywanie_pomocy);
		initializeWidgets();
		removeCallingIfAlreadyDone();
		OcenaSytuacji.pomocZostalaWezwana = true;
	}

	private void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonStracilemKontakt);
		b2 = (Button) findViewById(R.id.buttonPrzyjechaloPogotowie);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	// Jest mo¿liwe, ¿e u¿ytkownik wejdzie do tego activity po raz kolejny, lub
	// wezwa³ pomoc w innym. Je¿eli tak siê sta³o, metoda usuwa polecenie
	// wzywania pomocy
	private void removeCallingIfAlreadyDone() {
		if (OcenaSytuacji.pomocZostalaWezwana == true) {
			TextView tv1, tv2, tv3, tv4, tv5;
			tv1 = (TextView) findViewById(R.id.TextViewwzywaniePomocyHeader);
			tv2 = (TextView) findViewById(R.id.TextViewwzywaniePomocyPolecenie1);
			tv3 = (TextView) findViewById(R.id.TextViewwzywaniePomocyPolecenie2);
			tv4 = (TextView) findViewById(R.id.TextViewwzywaniePomocyPolecenie3);
			tv5 = (TextView) findViewById(R.id.TextViewwzywaniePomocyPolecenie4);
			tv1.setVisibility(View.GONE);
			tv2.setVisibility(View.GONE);
			tv3.setVisibility(View.GONE);
			tv4.setVisibility(View.GONE);
			tv5.setVisibility(View.GONE);		
		}
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;

		switch (v.getId()) {
		case R.id.buttonStracilemKontakt:
			intent = new Intent(getApplicationContext(),
					OcenaPrzytomnosci.class);
			break;
		case R.id.buttonPrzyjechaloPogotowie:
			intent = new Intent(getApplicationContext(), PrzyjazdSluzb.class);
			break;
		}
		if (intent != null)
			startActivity(intent);

	}

}
