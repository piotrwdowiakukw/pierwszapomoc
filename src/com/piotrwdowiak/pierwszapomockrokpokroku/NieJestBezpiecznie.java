package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NieJestBezpiecznie extends Activity implements OnClickListener {

	Button b1, b2, b997, b112;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nie_jest_bezpiecznie);
		initializeWidgets();
	}

	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonZmianaOtoczenie);
		b2 = (Button) findViewById(R.id.buttonPrzyjazdSluzb);
		b997 = (Button) findViewById(R.id.buttonDzwonNa997);
		b112 = (Button) findViewById(R.id.buttonDzwonNa112);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b997.setOnClickListener(this);
		b112.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;
		String url;

		switch (v.getId()) {

		case R.id.buttonDzwonNa997:
			url = "tel:997";
			intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
			startActivity(intent);
			break;

		case R.id.buttonDzwonNa112:
			url = "tel:112";
			intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
			startActivity(intent);
			break;

		case R.id.buttonZmianaOtoczenie:

			if (OcenaSytuacji.jestSwiadomy) {
				intent = new Intent(getApplicationContext(), RozmowaZPoszkodowanym.class);
			} else {
			intent = new Intent(getApplicationContext(),
					OcenaPrzytomnosci.class);
			}

			break;
		case R.id.buttonPrzyjazdSluzb:
			intent = new Intent(getApplicationContext(),
					PrzyjazdSluzb.class);
			break;
		}

		if (intent != null) {
			startActivity(intent);
		}

	}
}
