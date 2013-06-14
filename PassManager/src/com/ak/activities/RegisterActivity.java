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

public class RegisterActivity extends Activity {

	EditText editTextPassword;
	EditText editTextConfirmPassword;
	EditText editTextSecurityAnswer;
	Button buttonRegister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_register);
		
		this.editTextPassword = (EditText)this.findViewById(R.id.editTextPassword);
		
		this.editTextConfirmPassword = (EditText)this.findViewById(R.id.editTextConfirmPassword);
		this.editTextConfirmPassword.setOnFocusChangeListener(editTextConfirmPassword_onFocusChange);
		
		this.buttonRegister = (Button)this.findViewById(R.id.buttonRegister);
		this.buttonRegister.setOnClickListener(buttonRegister_onClick);
		this.buttonRegister.setOnTouchListener(buttonRegister_onTouch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
	
	OnClickListener buttonRegister_onClick = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Toast.makeText(getApplicationContext(), "onClick", RESULT_OK).show();
		}
	};
	
	OnTouchListener buttonRegister_onTouch = new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			
			switch(event.getAction()) {
			
				case MotionEvent.ACTION_DOWN:
					if(1 < 2) {
						//LoginActivity.this.buttonEnter.setTextColor(Color.GREEN);
						RegisterActivity.this.buttonRegister.setBackgroundResource(R.drawable.button_green);
					}
					break;
					
				case MotionEvent.ACTION_UP:
					//LoginActivity.this.buttonEnter.setTextColor(Color.WHITE);
					break;
			}
			
			return true;
		}
	};
	
	OnFocusChangeListener editTextConfirmPassword_onFocusChange = new OnFocusChangeListener() {
		
		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			
			
		}
	};
}
