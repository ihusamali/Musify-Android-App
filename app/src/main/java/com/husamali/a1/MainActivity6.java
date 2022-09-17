package com.husamali.a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity6 extends AppCompatActivity {
//    DrawerLayout drawerLayout;
//    NavigationView navigationView;
//    Toolbar toolbar;
//    ActionBarDrawerToggle actionBarDrawerToggle;
//
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    ImageView imageView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imageView = findViewById(R.id.menu_img);
        drawerLayout = findViewById(R.id.drawer_layout);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

//        drawerLayout = findViewById(R.id.drawer_layout);
//        navigationView = findViewById(R.id.nav);
//        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open, R.string.menu_close);
//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
//        boolean b = true;
//        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(b);
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch(item.getItemId()){
//                    case R.id.i1:
//                        Log.i("MENU_DRAWER_TAG", "Edit Profile clicked ");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.i2:
//                        Log.i("MENU_DRAWER_TAG", "Change Password clicked ");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                }
//
//                return true;
//            }
//        });


    }
}