package com.example.idfinder;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            TextView idView = findViewById(R.id.idView);
            String androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            if (androidId == null) androidId = "পাওয়া যায়নি";
            idView.setText(androidId);
        } catch (Exception e) {
            TextView t = new TextView(this);
            t.setText("Error: " + e.toString());
            setContentView(t);
        }
    }
}
