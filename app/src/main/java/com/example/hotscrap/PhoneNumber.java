package com.example.hotscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhoneNumber extends AppCompatActivity {

    Button btn_next_phn_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);

        btn_next_phn_num = (Button) findViewById(R.id.phn_num_next);

        btn_next_phn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phn_num = new Intent(PhoneNumber.this, OTP.class);
                startActivity(phn_num);
            }
        });
    }
}
