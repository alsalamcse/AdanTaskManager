package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class addTask extends AppCompatActivity {
    private EditText edTitle;
    private EditText edSub ;
    private EditText edPo;
    private SeekBar seekB ;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        edTitle=(EditText)findViewById(R.id.edTitle);
        edSub=findViewById(R.id.edSub);
        edPo=findViewById(R.id.edPo);
        seekB=findViewById(R.id.seekB);
        buttonSave=findViewById(R.id.buttonSave);


seds
    }
}
