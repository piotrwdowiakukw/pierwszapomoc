package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrzyjazdSluzb extends Activity implements OnClickListener {

	Button b;
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.przyjazd_sluzb);
	initializeWidgets();
}

private void initializeWidgets() {

	b = (Button) findViewById(R.id.buttonDoEkranuGlownego);
	b.setOnClickListener(this);
	
}

@Override
public void onClick(View v) {
	Intent intent = new Intent(getApplicationContext(), ActivityStartowe.class);
	startActivity(intent);
	
	
}


}
