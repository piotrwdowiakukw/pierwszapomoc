package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OcenaSytuacji extends Activity implements OnClickListener {

	public static boolean jestSwiadomy;
	public static boolean pomocZostalaWezwana;

	
	Button bJestReakcja, bNieMaReakcji;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ocena_sytuacji);
		initializeWidgets();
	}

	public void initializeWidgets() {
		bJestReakcja = (Button) findViewById(R.id.buttonJestReakcja);
		bNieMaReakcji = (Button) findViewById(R.id.buttonBrakReakcji);
		bJestReakcja.setOnClickListener(this);
		bNieMaReakcji.setOnClickListener(this);
		pomocZostalaWezwana = false;
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;

		switch (v.getId()) {
		case R.id.buttonJestReakcja:
			jestSwiadomy = true;
			intent = new Intent(getApplicationContext(),
					OcenaBezpieczenstwa.class);
			break;
		case R.id.buttonBrakReakcji:
			jestSwiadomy = false;
			intent = new Intent(getApplicationContext(),
					OcenaBezpieczenstwa.class);
			break;
		}

		if (intent != null) {
			startActivity(intent);
		}

	}
}
