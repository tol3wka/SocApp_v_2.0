package com.example.aliya.socapp_v_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.backendless.Backendless;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String appVersion = "v1";
        Backendless.initApp( this, "F94FC560-2F4D-3702-FF94-6E51F390DA00", "436BE60E-E37B-D480-FF58-7EA3CF500C00", appVersion );

    }
}
