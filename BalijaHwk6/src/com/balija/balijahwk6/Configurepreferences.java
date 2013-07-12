package com.balija.balijahwk6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Configurepreferences extends Activity {
	
	private class ButtonHandler implements View.OnClickListener
	{
		public void onClick(View v)
		{
			handleButtonClick();
		}
	}
	private void handleButtonClick()
	{
		Intent data= new Intent();
		final EditText email = (EditText)findViewById(R.id.email);
		data.putExtra("input",email.getText().toString());
	
		setResult(Activity.RESULT_OK, data);
		finish();
	}      
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configpreferences);
		final Button savesettings = (Button)findViewById(R.id.submit);
		savesettings.setOnClickListener(new ButtonHandler());
	}
}