package com.example.mrpython.elsreen;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by NhanIT on 3/8/2018.
 */

public class MainService extends Service {

    @Override
    public IBinder onBind(Intent arg0)
    {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
}
