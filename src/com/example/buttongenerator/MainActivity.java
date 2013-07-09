package com.example.buttongenerator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final RadioGroup colorGroup = (RadioGroup) findViewById(R.id.radioGroupColor);
		final RadioGroup iconGroup = (RadioGroup) findViewById(R.id.radioGroupIcon);
		final EditText captionET = (EditText) findViewById(R.id.captionET);
		Button generateButton = (Button) findViewById(R.id.generateButton);
		generateButton.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub

				if(event.getAction()==MotionEvent.ACTION_DOWN){

					int colorID = 0;
					int iconID = 0;

					switch(colorGroup.getCheckedRadioButtonId()){

					case R.id.radioOrange:
						colorID = R.drawable.button_orange;
						break;
					case R.id.radioBlue:
						colorID = R.drawable.button_blue;
						break;
					case R.id.radioRed:
						colorID = R.drawable.button_red;
						break;
					case R.id.radioGreen:
						colorID = R.drawable.button_green;
						break;
					}

					switch(iconGroup.getCheckedRadioButtonId()){

					case R.id.radioLock:
						iconID = R.drawable.lock;
						break;
					case R.id.radioMail:
						iconID = R.drawable.mail;
						break;
					case R.id.radioCamera:
						iconID = R.drawable.camera;
						break;
					case R.id.radioPapers:
						iconID = R.drawable.papers;
						break;
					}

					Intent i = new Intent(MainActivity.this,PreviewActivity.class);
					i.putExtra("color", colorID);
					i.putExtra("icon", iconID);
					i.putExtra("caption", captionET.getText().toString());
					startActivity(i);
				}
				return false;
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
