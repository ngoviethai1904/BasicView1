package com.example.basicview;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btncancle = (Button)findViewById(R.id.btncancle);
        Button btnInfo = (Button)findViewById(R.id.btnInfo);
        final EditText editten = (EditText)findViewById(R.id.txtten);
        final EditText editemail = (EditText)findViewById(R.id.txtemail);
        final RadioButton rbds =(RadioButton)findViewById(R.id.rbtnsach);
        final RadioButton rbdl =(RadioButton)findViewById(R.id.rbtndl);
        final RadioButton rbcode = (RadioButton)findViewById(R.id.rbtncode);
        final RadioButton rbnam = (RadioButton)findViewById(R.id.rbtnnam);
        final RadioButton rbnu = (RadioButton)findViewById(R.id.rbtnnu);

       btnInfo.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){

               String msg = "Tên: " + editten.getText().toString() + System.getProperty("line.separator") + "Enail: " + editemail.getText().toString();
               msg += System.getProperty("line.separator") + "My Hobbies: ";

               if(rbds.isChecked())
                   msg += rbds.getText().toString() ;
               if(rbdl.isChecked())
                   msg += rbdl.getText().toString() ;
               if(rbcode.isChecked())
                   msg += rbcode.getText().toString() ;
               if(rbnam.isChecked())
                   msg += rbnam.getText().toString();
               if(rbnu.isChecked())
                   msg += rbnu.getText().toString();

               msg += System.getProperty("line.separator") + "Do you have experience with Java frameworks: ";

               editten.setText("");
               editemail.setText("");
               rbds.setChecked(false);
               rbdl.setChecked(false);
               rbcode.setChecked(false);
               rbnam.setChecked(false);
               rbnu.setChecked(false);
           }
       });

    }
    public void cancel(View v){
        System.exit(0);
    }

    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("Basic view");
        dlgAlert.setPositiveButton("OK" ,null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}
