package com.example.mrpython.elsreen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by vuong on 3/24/2018.
 */

public class StartMyServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent serviceIntent = new Intent(context, MainService.class);
            context.startService(serviceIntent);
            Log.v("TEST", "Service loaded at start");
        }
    }
}
