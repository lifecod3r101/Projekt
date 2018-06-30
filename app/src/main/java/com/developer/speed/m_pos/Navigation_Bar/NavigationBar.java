package com.developer.speed.m_pos.Navigation_Bar;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.R.string;

public class NavigationBar extends AppCompatActivity implements OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.navigation_bar);
        Toolbar toolbar = this.findViewById(id.toolbar);
        this.setSupportActionBar(toolbar);
        DrawerLayout drawer = this.findViewById(id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, string.navigation_drawer_open, string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = this.findViewById(id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = this.findViewById(id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.getMenuInflater().inflate(menu.navigation_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == id.nav_services) {
        } else if (id == id.nav_settings) {
        } else if (id == id.nav_support) {
        } else {
        }
        DrawerLayout drawer = this.findViewById(id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

