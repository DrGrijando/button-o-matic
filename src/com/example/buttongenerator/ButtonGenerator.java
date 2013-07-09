package com.example.buttongenerator;

import android.R.id;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Button;

public class ButtonGenerator extends Activity {

	public Button generateButton(Context ctx, Button b, int color, int icon, String caption){

		// Set the icon
		b.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);

		// Set the text (we add 3 blank spaces to add 
		// some margin between the icon and the text
		if(!caption.equals(""))
			b.setText("  "+caption);

		// Set the background
		b.setBackgroundResource(color);
		
		// Load font and set it for the button text
		Typeface font = Typeface.createFromAsset(ctx.getAssets(), "fonts/CABIN.ttf");
		b.setTypeface(font);

		// Change button font color to white
		b.setTextColor(Color.parseColor("#ffffff"));

		// Change button text size
		b.setTextSize(24);
		
		return b;
	}

}
