package testing.fcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class iot extends AppCompatActivity {

    public static final String urlon = "http://androcation.16mb.com/form.php?state=1";
    public static final String urloff = " http://androcation.16mb.com/form.php?state=0";
    SwitchCompat switchCompat;
    OkHttpClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        client = new OkHttpClient();
        switchCompat = (SwitchCompat)findViewById(R.id.s);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {

                    Request request = new Request.Builder()
                            .url(urlon)
                            .build();

                    try {
                        client.newCall(request).execute();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {

//
                    Request request = new Request.Builder()
                            .url(urloff)
                            .build();
                    try {
                        client.newCall(request).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

    }
}
