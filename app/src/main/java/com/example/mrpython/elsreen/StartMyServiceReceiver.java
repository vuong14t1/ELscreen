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
            _processStartService(context);
            Toast.makeText(context, "boot ", Toast.LENGTH_SHORT).show();
        }
        if( Intent.ACTION_SCREEN_ON.equals(intent.getAction())){

            _processStartService(context);

        }
        if( Intent.ACTION_SCREEN_OFF.equals(intent.getAction())){

        }
    }

    // goi toi service
    private void _processStartService(Context context){
        Intent serviceIntent = new Intent(context, MainService.class);
        context.startService(serviceIntent);
    }
}
