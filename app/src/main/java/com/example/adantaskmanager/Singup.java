package com.example.adantaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Singup extends AppCompatActivity {
    private EditText firstname;
    private EditText lastname;
    private EditText phone;
    private EditText email;
    private EditText password1;
    private EditText password2;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        password1 = (EditText) findViewById(R.id.password1);
        password2 = (EditText) findViewById(R.id.password2);
        btnsave = (Button) findViewById(R.id.btnsave);
    }

        private void dataHndler() {
            boolean isok = true;
            String email = EditText.getText().toString();
            String password1 = EditText.getText().toString();
            String firstname = EditText.getText().toString();
            String lastname = EditText.getText().toString();
            String phone = EditText.getText().toString();
            String retpass = EditText.getText().toString();
            String password2 = EditText.getText().toString();
            if (email.length() < 4 ||
                    email.indexOf('@') < 0 ||
                    email.indexOf('.') < 0) {
                email.setError.("wrong Email");

            }
            if (password1.length() < 8 || password1.equals(password2) == false) {
                password1.setError("Have to be at least 8 char and the same password ");
                password2.setError("Have to be at least 8 char and the same password ");

                isok = false;
            }
            if (lastname.length() == 0) {
                firstname.setError("enter name");
                isok = false;
            }
            if (isok) {
                creatAcount(email, password1, password2, phone, lastname);
            }
        }
        private void creatAcount(final String email, String password1, String password2, String firstname , String lastname) {
            FirebaseAuth auth = FirebaseAuth.getInstance();
            auth.createUserWithEmailAndPassword(email,password1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if ((task.isSuccessful())) {
                        finish();

                    }
                    else
                        {
                        email.setError("Sign n up fialed");
                    }
                }
            });

        }

    }


