package com.example.hotscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickUpDetails extends AppCompatActivity {

    Button pick_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_details);

        pick_up = (Button) findViewById(R.id.btn_pickupdetails_next);

        pick_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sell_scrap = new Intent(PickUpDetails.this, SchedulePickUp.class);
                startActivity(sell_scrap);
            }
        });
    }

    public void onOutLinedButtonClicked(View view){
        Button button = findViewById(view.getId());

        //change color of button
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(2,getResources().getColor(R.color.colorYellow));
        button.setBackground(gradientDrawable);

    }
}
