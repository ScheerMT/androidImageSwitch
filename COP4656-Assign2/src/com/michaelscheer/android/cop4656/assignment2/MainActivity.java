package com.michaelscheer.android.cop4656.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageSwitcher;

public class MainActivity extends Activity {

	final ImageSwitcher imgSwitch = (ImageSwitcher)findViewById(R.id.imageSwitcher1);
	private int switchPic = 0;
	private final int[] images = { R.drawable.nole, R.drawable.koolgator };
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Initial Image of FSU
        imgSwitch.setImageResource(images[switchPic]);
       
    
    }


    private void switchImage() {
    	if (switchPic == 0)
    		imgSwitch.setImageResource(images[++switchPic]);
    	else
    		imgSwitch.setImageResource(images[--switchPic]);
    	
    }
}
