package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class JestAED extends Activity implements OnClickListener {

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jest_aed);
		initializeWidgets();
	}
	
	private void initializeWidgets() {
		b = (Button) findViewById(R.id.jestAEDResuscytacja);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(getApplicationContext(), Resuscytacja.class);
		startActivity(intent);
	}

}
