// First check on Git

package com.ak.activities;

import com.ak.passmanager.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	EditText editTextPassword;
	Button buttonEnter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_login);
		
		this.editTextPassword = (EditText)this.findViewById(R.id.editTextPassword);
		this.editTextPassword.setOnFocusChangeListener(editTextPassword_onFocusChange);
		
		this.buttonEnter = (Button)this.findViewById(R.id.buttonEnter);
		this.buttonEnter.setOnClickListener(buttonEnter_onClick);
		this.buttonEnter.setOnTouchListener(buttonEnter_onTouch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
	
	OnClickListener buttonEnter_onClick = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Toast.makeText(getApplicationContext(), "onClick", RESULT_OK).show();
		}
	};
	
	OnTouchListener buttonEnter_onTouch = new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			
			switch(event.getAction()) {
			
				case MotionEvent.ACTION_DOWN:
					if(1 < 2) {
						//LoginActivity.this.buttonEnter.setTextColor(Color.GREEN);
						LoginActivity.this.buttonEnter.setBackgroundResource(R.drawable.button_green);
					}
					break;
					
				case MotionEvent.ACTION_UP:
					//LoginActivity.this.buttonEnter.setTextColor(Color.WHITE);
					break;
			}
			
			return true;
		}
	};
	
	OnFocusChangeListener editTextPassword_onFocusChange = new OnFocusChangeListener() {
		
		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			
			
		}
	};
}
