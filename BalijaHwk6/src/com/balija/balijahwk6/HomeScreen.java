package com.balija.balijahwk6;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class HomeScreen extends Activity
{
	private static final int INPUT_REQUEST=0;

	public class ButtonHandler implements View.OnClickListener
	{


	public void onClick(View v)
	{
	handleButtonClick();
	}
	}
	private void handleButtonClick()
	{
	startActivityForResult(new Intent(this,Configurepreferences.class), INPUT_REQUEST);
	}	

public void onCreate(Bundle savedInstanceState)
{

super.onCreate(savedInstanceState);
setContentView(R.layout.homescreen); 


final Button configuration = (Button) findViewById(R.id.configure_Pref);
configuration.setOnClickListener(new ButtonHandler());

}


protected void onActvityResult(int requestCode, int resultCode, Intent data)
{
super.onActivityResult(requestCode, resultCode, data);
if (requestCode==INPUT_REQUEST)
{	 
if(resultCode==Activity.RESULT_CANCELED)
{
Toast.makeText(this, "activity cancelled", Toast.LENGTH_SHORT).show();
}
else if(resultCode==Activity.RESULT_OK)
{
String input = data.getStringExtra("input");
Toast.makeText(this,"activity ok, input = "+ input, Toast.LENGTH_SHORT).show();

}
}	

}

}
