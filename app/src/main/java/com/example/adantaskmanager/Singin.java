package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Singin extends AppCompatActivity {
    private EditText etAdd1;
    private EditText etAdd2;
    private Button sn1;
    private Button sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin2);
        etAdd1=findViewById(R.id.etAdd1);
        etAdd2=findViewById(R.id.etAdd2);
        sn1=findViewById(R.id.sn1);
        sp1=findViewById(R.id.sp1);

    }

}
