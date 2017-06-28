package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);

        b=(Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                String s3=et3.getText().toString();
                String s4=et4.getText().toString();
                String s5=et5.getText().toString();

                if (s1.isEmpty())
                     et1.setError("Empty");
                else if (s2.isEmpty())
                    et2.setError("Empty");
                else if (s3.isEmpty())
                    et3.setError("Empty");
                else if (s4.isEmpty())
                    et4.setError("Empty");
                else if (s5.isEmpty())
                    et5.setError("Empty");
                else if(s4.equals(s5))
                     Toast.makeText(MainActivity.this,"REGISTERED",Toast.LENGTH_LONG).show();
                else
                    et5.setError("PWD Mismatch");
            }
        });

    }
}
