package com.example.buttongenerator;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class PreviewActivity extends Activity {

	ButtonGenerator bG = new ButtonGenerator();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preview);
		Bundle extras = getIntent().getExtras();		
		Button button = (Button) findViewById(R.id.previewButton);

		// Create the button using the ButtonGenerator class
		button=bG.generateButton(getApplicationContext(),button,extras.getInt("color"), extras.getInt("icon"), extras.getString("caption"));


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
