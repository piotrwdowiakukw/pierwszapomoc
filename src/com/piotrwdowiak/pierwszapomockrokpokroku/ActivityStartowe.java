package com.piotrwdowiak.pierwszapomockrokpokroku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityStartowe extends Activity  implements OnClickListener {	

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startowe);      
        
        Button b = (Button) findViewById(R.id.buttonJazda);
        b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent intent = new Intent(getApplicationContext(), OcenaSytuacji.class);
		startActivity(intent);
		
	}        
}
