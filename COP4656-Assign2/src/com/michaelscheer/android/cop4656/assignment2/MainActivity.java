package com.michaelscheer.android.cop4656.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity {

	ViewSwitcher imgSwitch;
	Button btnChangePic;
	
	private int switchPic = 0;
	int[] images = { R.drawable.nole, R.drawable.koolgator };
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    protected void init() {
    	imgSwitch = (ViewSwitcher)findViewById(R.id.viewSwitcher1);
    	btnChangePic = (Button)findViewById(R.id.button1);

    	//Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.test);
    	//imgSwitch.startAnimation(hyperspaceJump);
    	
    	btnChangePic.setText(R.string.showNole);
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
    		imgSwitch.showNext();
    		switchPic = 1;
    	}
    	else {
    		imgSwitch.showPrevious();
    		switchPic = 0;
    	}
    	
    }
    
    
    
}
