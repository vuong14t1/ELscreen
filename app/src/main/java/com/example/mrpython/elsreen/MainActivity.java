package com.example.mrpython.elsreen;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignView();

    }

    private void assignView()
    {
        btnExit = (Button)findViewById(R.id.btnExit);
    }

    public void exitClick(View view) {
        finish();
        System.exit(0);
    }

//    @Override
//    public void onAttachedToWindow()
//    {
//        super.onAttachedToWindow();
//        this.getWindow().setType(WindowManager.LayoutParams.TYPE_APPLICATION);
//    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_HOME)
        {
            Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
        }

        if(keyCode==KeyEvent.KEYCODE_BACK)
        {
            Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_SHORT).show();
        }

        if (keyCode == KeyEvent.KEYCODE_MENU)
        {
            Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}

