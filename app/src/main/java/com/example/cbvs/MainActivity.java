package com.example.cbvs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Aadhar_Card myDb;
    ImageButton TAPb;
    ImageButton CJPb;
    ImageButton CONTb;
    TextView TAP1;
    TextView CJP1;
    TextView CONT1;
    int count1;
    int count2;
    int count3;
    boolean clicked = false;
    EditText aadhar_id;
    Intent i1;
    String s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new Aadhar_Card(this);
        SQLiteDatabase db=myDb.getReadableDatabase();
        CONT1 = findViewById(R.id.CONT_1);
        CJP1 = findViewById(R.id.CJP_1);
        TAP1 = findViewById(R.id.TAP_1);

        CONTb = findViewById(R.id.CONT);
        CJPb = findViewById(R.id.CJP);
        TAPb = findViewById(R.id.TAP);

        Intent intent = getIntent();
        s2 = intent.getStringExtra("s2");
        final String ward = myDb.ww(s2);

//------------------------------------------------------------------------------------------------
        CONTb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CONTV = CONT1.getText().toString().trim();
               // count1 = Integer.parseInt(CONTV);
                count1=1;
                CONT1.setText(String.valueOf(count1));

               Boolean p1 = myDb.p1(s2);
                if (p1 == true) {
                    Boolean a1 = myDb.a1(ward,"TAP");
                    Intent i = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(i);

                }
                }
        });
        //-----------------------------------------------------------------------------------------
        CJPb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String CJPV = CJP1.getText().toString().trim();
                //count2 = Integer.parseInt(CJPV);
                count2=1;
                CJP1.setText(String.valueOf(count2));
                Boolean p1 = myDb.p1(s2);
                if (p1 == true) {
                    Boolean a1 = myDb.a1(ward,"CONT");
                    Intent i = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(i);
                }
            }
        });
        //-------------------------------------------------------------------------------------------------
        TAPb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TAPV = TAP1.getText().toString().trim();
                //count3 = Integer.parseInt(TAPV);
                count3=1;
                TAP1.setText(String.valueOf(count3));
                Boolean p1 = myDb.p1(s2);
                if (p1 == true) {
                    Boolean a1 = myDb.a1(ward,"CJP");
                    Intent i = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(i);
                }
            }
        });

    }
}

//--------------------------------------------------------------------------------------------------------------------



