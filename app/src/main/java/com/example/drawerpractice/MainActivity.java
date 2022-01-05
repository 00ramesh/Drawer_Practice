package com.example.drawerpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar topToolBar;
    DrawerLayout navDrawer;
    NavigationView navigationViewContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topToolBar = findViewById(R.id.main_top_app_tool_bar);
        navDrawer = findViewById(R.id.main_nav_drawer_layout);
        navigationViewContainer = findViewById(R.id.main_nav_drawer_container);

        topToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  navDrawer.openDrawer(GravityCompat.START);
            }
        });
        navigationViewContainer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home_activity : Toast.makeText(getApplicationContext(),"You are on Home Screen", Toast.LENGTH_SHORT).show();
                                              navDrawer.closeDrawer(GravityCompat.START);
                                              break;

                    case R.id.home_work_activity: Toast.makeText(getApplicationContext(),"You are on Homework Screen", Toast.LENGTH_SHORT).show();
                        navDrawer.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.people_activity : Toast.makeText(getApplicationContext(),"You are on People Screen", Toast.LENGTH_SHORT).show();
                        navDrawer.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.settings :  Toast.makeText(getApplicationContext(),"You are on Setting Screen", Toast.LENGTH_SHORT).show();
                        navDrawer.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.log_out: Toast.makeText(getApplicationContext(),"You have been Logout..", Toast.LENGTH_SHORT).show();
                        navDrawer.closeDrawer(GravityCompat.START);
                        break;
                }


                return true;
            }
        });
    }
}