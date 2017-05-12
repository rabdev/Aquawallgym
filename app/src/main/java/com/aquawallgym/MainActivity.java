package com.aquawallgym;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.AppCompatButton;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.aquawallgym.fragments.Administration;
import com.aquawallgym.fragments.Balance;
import com.aquawallgym.fragments.MyTrainings;
import com.aquawallgym.fragments.Notifications;
import com.aquawallgym.fragments.Settings;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    AppCompatButton informations, services, balance;
    int count = getFragmentManager().getBackStackEntryCount();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerIndicatorEnabled(false);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        ImageView profile = (ImageView) findViewById(R.id.ic_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                if(drawer.isDrawerOpen(GravityCompat.END))
                    drawer.closeDrawer(GravityCompat.END);
                else
                    drawer.openDrawer(Gravity.END);
            }
        });

        ImageView notifications = (ImageView) findViewById(R.id.ic_notifications);
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notifications notificationsfr = new Notifications();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, notificationsfr, notificationsfr.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        informations = (AppCompatButton) findViewById(R.id.btn_informations);
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentInformations fragmentInformations = new FragmentInformations();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, fragmentInformations, fragmentInformations.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        balance = (AppCompatButton) findViewById(R.id.btn_balance);
        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Balance balancefr = new Balance();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, balancefr, balancefr.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        services = (AppCompatButton) findViewById(R.id.btn_services);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTrainings fragmentTrainings = new FragmentTrainings();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, fragmentTrainings, fragmentTrainings.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            if (count == 0) {
                super.onBackPressed();
            } else {
                getFragmentManager().popBackStack();
            }
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_mytrainings) {
            // Handle the camera action
            MyTrainings myTrainings = new MyTrainings();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_frame, myTrainings, myTrainings.getTag())
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_balance) {
            Balance balancefr2 = new Balance();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_frame, balancefr2, balancefr2.getTag())
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_administration) {
            Administration administration = new Administration();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_frame, administration, administration.getTag())
                    .addToBackStack(null)
                    .commit();


        } else if (id == R.id.nav_settings) {
            Settings settings = new Settings();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_frame, settings, settings.getTag())
                    .addToBackStack(null)
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
}
