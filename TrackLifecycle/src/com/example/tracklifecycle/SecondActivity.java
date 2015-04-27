package com.example.tracklifecycle;

import android.support.v7.app.ActionBarActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends BroadcastReceiver {

	private final String TAG = "Receiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "The intent was received");
 		Toast.makeText(context, "Success!", Toast.LENGTH_LONG).show();
		
	}
}
