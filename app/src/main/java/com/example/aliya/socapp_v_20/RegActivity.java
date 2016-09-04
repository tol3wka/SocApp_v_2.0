package com.example.aliya.socapp_v_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;


public class RegActivity extends AppCompatActivity {

    EditText Name, Age, Email, Psd;
    Button Reg, Add;
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
    void saveUser(){
        Users_data users_data = new Users_data();
        users_data.setName(Name.getText().toString());
        users_data.setGen(Gen.getSelectedItem().toString());
        users_data.setAge(Integer.parseInt(Age.getText().toString()));
        Backendless.Persistence.save( users_data, new AsyncCallback<Users_data>() {
            public void handleResponse( Users_data response )
            {
                Toast success = Toast.makeText(RegActivity.this,"Запись успешно добавлена в базу",Toast.LENGTH_SHORT);
                success.show();
            }

            public void handleFault( BackendlessFault fault )
            {
                Toast err = Toast.makeText(RegActivity.this,"Произошла ошибка добавления в базу",Toast.LENGTH_SHORT);
                err.show();
            }
        });

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
        Add = (Button)findViewById(R.id.button);
        Gen = (Spinner) findViewById(R.id.AgeSpinner);

        ArrayAdapter<?> GenAdapter = ArrayAdapter.createFromResource(this, R.array.Gen, android.R.layout.simple_spinner_item);
        GenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gen.setAdapter(GenAdapter);

        Name.addTextChangedListener(mTextWatcher);
        Age.addTextChangedListener(mTextWatcher);
        Email.addTextChangedListener(mTextWatcher);
        Psd.addTextChangedListener(mTextWatcher);

        checkFieldsForEmptyValues();

        Reg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                BackendlessUser user = new BackendlessUser();
                user.setEmail(Email.getText().toString());
                user.setPassword(Psd.getText().toString());

                Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
                    public void handleResponse(BackendlessUser registeredUser) {
                        Toast success = Toast.makeText(RegActivity.this,"Успешно зарегистрированы",Toast.LENGTH_SHORT);
                        success.show();
                    }

                    public void handleFault(BackendlessFault fault) {
                        Toast err = Toast.makeText(RegActivity.this,"Произошла ошибка",Toast.LENGTH_SHORT);
                        err.show();
                    }
                });
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUser();

            }
        });

    }
}
