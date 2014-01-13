package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BrakOddechu extends Activity implements OnClickListener {

	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.brak_oddechu);
		initializeWidgets();
		removeCallingIfAlreadyDone();
		OcenaSytuacji.pomocZostalaWezwana = true;
	}
	
	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonJestAED);
		b2 = (Button) findViewById(R.id.buttonNieMaAED);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}
	
	// Jest mo¿liwe, ¿e u¿ytkownik wejdzie do tego activity po raz kolejny, lub
		// wezwa³ pomoc w innym. Je¿eli tak siê sta³o, metoda usuwa polecenie
		// wzywania pomocy
		private void removeCallingIfAlreadyDone() {
			if (OcenaSytuacji.pomocZostalaWezwana == true) {
				TextView tv1, tv2, tv3, tv4;
				LinearLayout ll;
				tv1 = (TextView) findViewById(R.id.TextView_brak_oddechu_1);
				tv2 = (TextView) findViewById(R.id.TextView_brak_oddechu_2);
				tv3 = (TextView) findViewById(R.id.TextView_brak_oddechu_3);
				tv4 = (TextView) findViewById(R.id.TextView_brak_oddechu_4);
				ll = (LinearLayout) findViewById(R.id.linearLayoutBrakOddechuButtony);
				tv1.setVisibility(View.GONE);
				tv2.setVisibility(View.GONE);
				tv3.setVisibility(View.GONE);
				tv4.setVisibility(View.GONE);
				ll.setVisibility(View.GONE);		
			}
		}

	@Override
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonJestAED:
			intent = new Intent(getApplicationContext(), JestAED.class);
			break;
		case R.id.buttonNieMaAED:
			intent = new Intent(getApplicationContext(), Resuscytacja.class);
			break;
		}
		if(intent!=null) {
			startActivity(intent);
		}
		
		
	}

}
