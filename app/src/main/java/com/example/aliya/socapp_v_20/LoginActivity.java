package com.example.aliya.socapp_v_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.local.UserTokenStorageFactory;

public class LoginActivity extends AppCompatActivity {

    String appVersion = "v1";
    EditText Email, Psswd;
    Button LgnBtn;
    TextView RegTxt;
    Intent RegInt, LogAttemptInt;
    String userToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Backendless.initApp( this, "F94FC560-2F4D-3702-FF94-6E51F390DA00", "436BE60E-E37B-D480-FF58-7EA3CF500C00", appVersion );
        userToken = UserTokenStorageFactory.instance().getStorage().get();
        Email = (EditText) findViewById(R.id.EmailEdt);
        Psswd = (EditText) findViewById(R.id.PswEdt);
        LgnBtn = (Button) findViewById(R.id.LoginBtn);
        RegTxt = (TextView) findViewById(R.id.RegTxt);
        RegInt = new Intent(LoginActivity.this,RegActivity.class);
        LogAttemptInt = new Intent(LoginActivity.this,MainActivity.class);

        if (userToken != null && !userToken.equals("")) {
            startActivity(LogAttemptInt);
        }

        LgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Backendless.UserService.login(Email.getText().toString(), Psswd.getText().toString(), new AsyncCallback<BackendlessUser>() {
                    public void handleResponse(BackendlessUser user) {
                        startActivity(LogAttemptInt);
                    }

                    public void handleFault(BackendlessFault fault) {
                        Toast toast = Toast.makeText(LoginActivity.this,R.string.LogInErr,Toast.LENGTH_SHORT);
                        toast.show();
                    }
                },true);
            }
        });
        RegTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(RegInt);
            }
        });
    }
}
