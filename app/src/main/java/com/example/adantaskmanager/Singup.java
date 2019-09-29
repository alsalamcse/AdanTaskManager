package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Singup extends AppCompatActivity {
    private EditText firstname;
    private EditText lastname;
    private EditText phone;
    private EditText email;
    private EditText password;
    private EditText retpass;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        retpass = (EditText) findViewById(R.id.retpass);
        btnsave = (Button) findViewById(R.id.btnsave);
    }

        private void dataHndler()
        {
            boolean isok=true;
            String email=EditText.getText().toString();
            String  password=EditText.getText().toString();
            String firstname=EditText.getText().toString();
            String lastname=EditText.getText().toString();
            String phone=EditText.getText().toString();
            String retpass=EditText.getText().toString();
            String btnsave=EditText.getText().toString();
            if (email)

        }

    }

}
