package com.example.aliya.socapp_v_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegActivity extends AppCompatActivity {

    EditText Name, Age, Email, Psd;
    Button Reg;
    Spinner Gen;

    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // check Fields For Empty Values
            checkFieldsForEmptyValues();
        }
    };
    void checkFieldsForEmptyValues(){
        Reg = (Button)findViewById(R.id.RegBtn);

        if(Name.getText().toString().equals("")|| Age.getText().toString().equals("")|| Email.getText().toString().equals("")|| Psd.getText().toString().equals("")){
            Reg.setEnabled(false);
        } else {
            Reg.setEnabled(true);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        Name = (EditText) findViewById(R.id.NameEdt);
        Age = (EditText) findViewById(R.id.AgeEdt);
        Email = (EditText) findViewById(R.id.EmailReg);
        Psd = (EditText) findViewById(R.id.PsdEdt);
        //Reg = (Button)findViewById(R.id.RegBtn);
        Gen = (Spinner) findViewById(R.id.AgeSpinner);

        ArrayAdapter<?> GenAdapter = ArrayAdapter.createFromResource(this, R.array.Gen, android.R.layout.simple_spinner_item);
        GenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gen.setAdapter(GenAdapter);

        Name.addTextChangedListener(mTextWatcher);
        Age.addTextChangedListener(mTextWatcher);
        Email.addTextChangedListener(mTextWatcher);
        Psd.addTextChangedListener(mTextWatcher);

        checkFieldsForEmptyValues();



    }
}
