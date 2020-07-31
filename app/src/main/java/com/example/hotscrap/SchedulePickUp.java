package com.example.hotscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SchedulePickUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_pick_up);

    }

    public void onOutLinedButtonClicked(View view){
        Button button = findViewById(view.getId());

        //change color of button
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(2,getResources().getColor(R.color.colorYellow));
        button.setBackground(gradientDrawable);

    }
}
