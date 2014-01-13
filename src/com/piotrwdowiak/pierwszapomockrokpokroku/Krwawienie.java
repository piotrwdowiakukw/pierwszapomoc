package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Krwawienie extends Activity implements OnClickListener {

	Button b1, b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.krwawienie);
		initializeWidgets();
	}
	
	private void initializeWidgets() {
		b1 = (Button) findViewById(R.id.buttonKrwawienieStracilemKontakt);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.buttonKrwawienieZrobionyOpatrunek);
		b2.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {

		Intent intent = null;
		
		switch (v.getId()) {
		case R.id.buttonKrwawienieStracilemKontakt:
			intent = new Intent(getApplicationContext(), OcenaOddechu.class);
			break;
		case R.id.buttonKrwawienieZrobionyOpatrunek:
			intent = new Intent(getApplicationContext(), WzywaniePomocy.class);
			break;
		}
		if(intent!=null)
			startActivity(intent);
		
	}

}
