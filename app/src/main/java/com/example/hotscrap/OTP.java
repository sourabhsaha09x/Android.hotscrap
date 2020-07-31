package com.example.hotscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTP extends AppCompatActivity {

    Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        verify = (Button) findViewById(R.id.btn_verify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sell_scrap = new Intent(OTP.this, PickUpDetails.class);
                startActivity(sell_scrap);
            }
        });
    }
}
