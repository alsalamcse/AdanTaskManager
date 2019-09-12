package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;

public class settings extends AppCompatActivity {
    private EditText edtSound;
    private Switch switch;
    private EditText edtSound;
    private SeekBar seekBar2;
    private Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        edtSound=(EditText) findViewById(R.id.edtSound);
        switch=(Switch)findViewById(R.id.switch);
        edtSound=(EditText) findViewById(R.id.edtSound);
        seekBar2=(SeekBar) findViewById(R.id.seekBar2);




    }
}
