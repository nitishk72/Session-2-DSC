package com.companyname.session2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        e1 = findViewById(R.id.first_num);
        e2 = findViewById(R.id.second_num);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Some values missing",Toast.LENGTH_SHORT).show();
                }
                else{
                    int a,b;
                    a=Integer.parseInt(e1.getText().toString());
                    b=Integer.parseInt(e2.getText().toString());
                    int c = a*b;
                    showResult(c);
                }

            }
        });
    }

    private void showResult(int c) {
        new AlertDialog.Builder(this)
                .setMessage("Result is : "+String.valueOf(c))
                .setTitle("Result")
                .show();
    }

}
