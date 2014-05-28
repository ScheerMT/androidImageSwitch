package com.michaelscheer.android.cop4656.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity {

	ViewSwitcher imgSwitch;
	Button btnChangePic;
	Animation vanish;
	Animation appear;
	
	private int switchPic = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    protected void init() {
    	imgSwitch = (ViewSwitcher)findViewById(R.id.viewSwitcher1);
    	btnChangePic = (Button)findViewById(R.id.button1);
    	vanish = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
    	appear  = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

    	// Animation idea from android tutorial
    	//Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.test);
    	//imgSwitch.startAnimation(hyperspaceJump);
    	
    	// Set initial text
    	btnChangePic.setText(R.string.showGator);
        btnChangePic.setOnClickListener(btnChangeListener);
    }
    
    View.OnClickListener btnChangeListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switchImage();
		}
	};
    
    private void switchImage() {
    	if (switchPic == 0) {
    		btnChangePic.startAnimation(vanish);
    		imgSwitch.showNext();
    		btnChangePic.setText(R.string.showNole);
    		btnChangePic.startAnimation(appear);
    		switchPic = 1;
    	}
    	else {
    		btnChangePic.startAnimation(vanish);
    		imgSwitch.showPrevious();
    		btnChangePic.setText(R.string.showGator);
    		btnChangePic.startAnimation(appear);
    		switchPic = 0;
    	}
    	
    }
    
    
    
}
