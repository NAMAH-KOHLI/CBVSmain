package com.example.cbvs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InvalidClassException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Permission;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Main2Activity extends AppCompatActivity {
    EditText aadhar_id;
    TextView data;
    Aadhar_Card myDb;
    Button btn_vote;
    Integer s2=1;
    String s1;
    String sup= String.valueOf(00000);
    String supp= String.valueOf(11111);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //data = findViewById(R.id.data);

        {
        aadhar_id = findViewById(R.id.aadhar_enter);
        myDb = new Aadhar_Card(this);
        SQLiteDatabase db=myDb.getReadableDatabase();


            btn_vote = findViewById(R.id.btn_vote);
            btn_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = aadhar_id.getText().toString();
                if (s1.equals(sup)){
                    String result = myDb.allData();
                    data.setText(String.valueOf(result));
                }
                else {
                    if (s1.equals(supp))
                    {

                    }
                    else {
                        if (s1.equals("")) {
                            Toast.makeText(getApplicationContext(), "Field is empty", Toast.LENGTH_LONG).show();
                        } else {
                            Boolean checkMail = myDb.checkMail(s1);
                            if (checkMail == true) {
                                Boolean checkMail2 = myDb.checkMail2(s1);
                                Toast.makeText(getApplicationContext(), "Vote responsibly", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                                startActivity(i);
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.putExtra("s2", s1);
                                startActivity(intent);
                            } else {
                                Toast.makeText(getApplicationContext(), "Aadhar number invalid OR You are under age OR You have already Voted", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                                startActivity(i);
                            }
                        }
                    }
                }
            }
        });

    }


}

}
