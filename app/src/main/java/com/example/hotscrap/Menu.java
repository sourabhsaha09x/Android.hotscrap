package com.example.hotscrap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationView;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    boolean newspaperNotSelected = true;
    boolean cardboardNotSelected = true;
    boolean plasticbottlesNotSelected = true;
    boolean metalcansNotSelected = true;
    boolean booksNotNotSelected = true;
    boolean batteryNotSelected = true;
    boolean eWasteNotSelected = true;
    boolean glassbottlesNotSelected = true;
    boolean otherNotSelected = true;

    public void selectMetalcans(View view){
        ImageView metalcans = (ImageView) findViewById(R.id.metalcans);
        ImageView selectmetalcans = (ImageView) findViewById(R.id.selectedmetalcans);

        if(metalcansNotSelected){
            metalcansNotSelected = false;
            metalcans.animate().alpha(0).setDuration(1000);
            selectmetalcans.animate().alpha(1).setDuration(1000);
        }else {
            metalcansNotSelected = true;
            metalcans.animate().alpha(1).setDuration(1000);
            selectmetalcans.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectFurniture(View view){
        ImageView furniture = (ImageView) findViewById(R.id.other);
        ImageView selectfurniture = (ImageView) findViewById(R.id.selectother);

        if(otherNotSelected){
            otherNotSelected = false;
            furniture.animate().alpha(0).setDuration(1000);
            selectfurniture.animate().alpha(1).setDuration(1000);
        }else {
            otherNotSelected = true;
            furniture.animate().alpha(1).setDuration(1000);
            selectfurniture.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectGlassbottles(View view){
        ImageView glassbottles = (ImageView) findViewById(R.id.glassbottles);
        ImageView selecglassbottles = (ImageView) findViewById(R.id.selectglassbottles);

        if(glassbottlesNotSelected){
            glassbottlesNotSelected = false;
            glassbottles.animate().alpha(0).setDuration(1000);
            selecglassbottles.animate().alpha(1).setDuration(1000);
        }else {
            glassbottlesNotSelected = true;
            glassbottles.animate().alpha(1).setDuration(1000);
            selecglassbottles.animate().alpha(0).setDuration(1000);
        }
    }

    public void selecteWaste(View view){
        ImageView ewaste = (ImageView) findViewById(R.id.ewaste);
        ImageView selectewaste = (ImageView) findViewById(R.id.selectewaste);

        if(eWasteNotSelected){
            eWasteNotSelected = false;
            ewaste.animate().alpha(0).setDuration(1000);
            selectewaste.animate().alpha(1).setDuration(1000);
        }else {
            eWasteNotSelected = true;
            ewaste.animate().alpha(1).setDuration(1000);
            selectewaste.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectBattery(View view){
        ImageView battery = (ImageView) findViewById(R.id.battery);
        ImageView selectbattery = (ImageView) findViewById(R.id.selectbattery);

        if(batteryNotSelected){
            batteryNotSelected = false;
            battery.animate().alpha(0).setDuration(1000);
            selectbattery.animate().alpha(1).setDuration(1000);
        }else {
            batteryNotSelected = true;
            battery.animate().alpha(1).setDuration(1000);
            selectbattery.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectbooks(View view){
        ImageView books = (ImageView) findViewById(R.id.books);
        ImageView selectbooks = (ImageView) findViewById(R.id.selectbooks);

        if(booksNotNotSelected){
            booksNotNotSelected =false;
            books.animate().alpha(0).setDuration(1000);
            selectbooks.animate().alpha(1).setDuration(1000);
        }else {
            booksNotNotSelected =true;
            books.animate().alpha(1).setDuration(1000);
            selectbooks.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectNewspaper(View view){
        ImageView newspaper = (ImageView) findViewById(R.id.newspaper);
        ImageView selecnewspaper = (ImageView) findViewById(R.id.selectnewspaper);

        if(newspaperNotSelected){
            newspaperNotSelected = false;
            newspaper.animate().alpha(0).setDuration(1000);
            selecnewspaper.animate().alpha(1).setDuration(1000);
        }else{
            newspaperNotSelected = true;
            newspaper.animate().alpha(1).setDuration(1000);
            selecnewspaper.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectCardboard(View view){
        ImageView cardboard = (ImageView) findViewById(R.id.cardboard);
        ImageView selectcardboard = (ImageView) findViewById(R.id.selectcardboard);

        if(cardboardNotSelected){
            cardboardNotSelected = false;
            cardboard.animate().alpha(0).setDuration(1000);
            selectcardboard.animate().alpha(1).setDuration(1000);
        }else {
            cardboardNotSelected = true;
            cardboard.animate().alpha(1).setDuration(1000);
            selectcardboard.animate().alpha(0).setDuration(1000);
        }
    }

    public void selectPlasticBottles(View view){
        ImageView plasticbottles = (ImageView) findViewById(R.id.plasticbottles);
        ImageView selectplasticbottles = (ImageView) findViewById(R.id.selectplasticbottles);

        if(plasticbottlesNotSelected){
            plasticbottlesNotSelected = false;
            plasticbottles.animate().alpha(0).setDuration(1000);
            selectplasticbottles.animate().alpha(1).setDuration(1000);
        }else{
            plasticbottlesNotSelected = true;
            plasticbottles.animate().alpha(1).setDuration(1000);
            selectplasticbottles.animate().alpha(0).setDuration(1000);
        }
    }

    private DrawerLayout drawer;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_next = (Button) findViewById(R.id.btn_menupage_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Menu.this, PhoneNumber.class);

                startActivity(next);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.my_account:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Account()).addToBackStack(null).commit();
                break;
            case R.id.my_request:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Request()).addToBackStack(null).commit();
                break;
            case R.id.schedule_reminder:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Schedule()).addToBackStack(null).commit();
                break;
            case R.id.rate_chart:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RateChartFragment()).addToBackStack(null).commit();
                break;
            case R.id.support:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SupportFragment()).addToBackStack(null).commit();
                break;
            case R.id.about_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutUsFragment()).addToBackStack(null).commit();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    public void OnBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }

}
