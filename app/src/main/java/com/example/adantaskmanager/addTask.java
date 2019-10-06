package com.example.adantaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import data.MyTask;

public class addTask extends AppCompatActivity {
    private EditText edTitle;
    private EditText edSub ;
    private EditText edPo;
    private SeekBar seekB ;
    private Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        edTitle = (EditText) findViewById(R.id.edTitle);
        edSub = (EditText) findViewById(R.id.edSub);
        edPo = (EditText) findViewById(R.id.etpnionity);
        seekB = (SeekBar) findViewById(R.id.seekB);
        btnsave = (Button) findViewById(R.id.btnsave);

       btnsave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dataHandler();

           }

           }
    });
}

       private void dataHandler()
       {
           String Title=edTitle.getText().toString();
           String Subject=edSub.getText().toString();
           String pnionity=edPo.getText().toString();
           int seekbar=seekB.getProgress();
           boolean isOk=false;
           if (isOk) {
               MyTask t = new MyTask();
               t.setTitle(Title);
               t.setSubject(Subject);

           }
       }
       public void creatTask(MyTask t){
    //.1
           FirebaseDatabase database= FirebaseDatabase.getIntent();
           DatabaseReference reference=database.getRefernce();
           String key=reference.child("tasks").push().getkey();
           reference.child("task").child(key).setValue(t).addOnCompleteListener(activity:AddTask.Activity.this,new MediaPlayer.OnCompletionListener<void>()){
               @Override
                       public void onComplete(Task<void>task)|{
                   if (task.isSuccesful()){
                       Toast.makeText(AddTask.this, text"add Succesful",Toast.LENGTH_SHORT).show();
                       finish();
                   }
                   else
                   {
                       Toast.makeText()
                   }
               }
           }

       }













