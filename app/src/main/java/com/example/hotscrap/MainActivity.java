package com.example.hotscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sell_scrap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sell_scrap = (Button) findViewById(R.id.btn_sell_scrap);

        btn_sell_scrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sell_scrap = new Intent(MainActivity.this, Menu.class);
                startActivity(sell_scrap);
            }
        });


    }
}
