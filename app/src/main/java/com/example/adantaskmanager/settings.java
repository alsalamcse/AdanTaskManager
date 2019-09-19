package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;

public class settings extends AppCompatActivity {
    private EditText edtsound;
    private Switch switchOnOff;
    private SeekBar seekBar2;
    private Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        switchOnOff=(Switch)findViewById(R.id.switchOnOff);
        edtsound=(EditText) findViewById(R.id.edtsound);
        seekBar2=(SeekBar) findViewById(R.id.seekBar2);




    }
}
