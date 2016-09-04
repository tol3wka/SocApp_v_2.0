package com.example.aliya.socapp_v_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegActivity extends AppCompatActivity {

    EditText Name, Age, Email, Psd;
    Button Reg;
    Spinner Gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        Name = (EditText) findViewById(R.id.NameEdt);
        Age = (EditText) findViewById(R.id.AgeEdt);
        Email = (EditText) findViewById(R.id.EmailReg);
        Psd = (EditText) findViewById(R.id.PsdEdt);
        Reg = (Button)findViewById(R.id.RegBtn);
        Gen = (Spinner) findViewById(R.id.AgeSpinner);

        ArrayAdapter<?> GenAdapter = ArrayAdapter.createFromResource(this, R.array.Gen, android.R.layout.simple_spinner_item);
        GenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gen.setAdapter(GenAdapter);


    }
}
