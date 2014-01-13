package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OcenaBezpieczenstwa extends Activity implements OnClickListener {

	Button b1, b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ocena_bezpieczenstwa);
		initializeWidgets();
	}

	public void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonJestBezpiecznie);
		b2 = (Button) findViewById(R.id.buttonNieJestBezpiecznie);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;

		switch (v.getId()) {
		case R.id.buttonJestBezpiecznie:
		
			if (OcenaSytuacji.jestSwiadomy) {
				intent = new Intent(getApplicationContext(), RozmowaZPoszkodowanym.class);
			} else {
			intent = new Intent(getApplicationContext(),
					OcenaPrzytomnosci.class);
			}
			//lub RozmowaZPoszkodowanym
			
			break;
		case R.id.buttonNieJestBezpiecznie:
			intent = new Intent(getApplicationContext(), NieJestBezpiecznie.class);
			break;
		}

		if (intent != null) {
			startActivity(intent);
		}

	}

}
