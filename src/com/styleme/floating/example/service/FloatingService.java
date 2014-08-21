package com.styleme.floating.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.styleme.floating.example.views.FloatingImage;

public class FloatingService extends Service {
	FloatingImage floatingImage;

	/**
	 * @param intent
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	public void onCreate() {
		super.onCreate();
		floatingImage = new FloatingImage(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		floatingImage.setImageResource(0); // removing the imageView
		// P.S this isn't an efficient way to remove the imageView, but for the
		// sake of the tutorial we just gonna use this.
	}
}
