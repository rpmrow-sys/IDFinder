package com.example.idfinder;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView t = new TextView(this);
        try {
            String androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            t.setText("Android ID: " + androidId);
        } catch (Throwable e) {
            t.setText("ERROR: " + e.toString());
        }
        t.setTextSize(20);
        t.setPadding(30, 100, 30, 30);
        setContentView(t);
    }
}
