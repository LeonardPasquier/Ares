package com.laposte.ares.ares;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Audits extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ExpandableListView liste_audits;
    private ExpandableListAdapter listAdapter;
    List<CardAudit> listDataHeader;
    HashMap<String, List<CardAudit>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audits);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        liste_audits = (ExpandableListView) findViewById(R.id.listAudits);
        prepareListData();

        listAdapter = new ExpandableCardAuditAdapter(this, listDataHeader, listDataChild);

        liste_audits.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<CardAudit>();
        listDataChild = new HashMap<String, List<CardAudit>>();
        CardAudit ares = new CardAudit("1", "Ares", "Premier Audit" , "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit bres = new CardAudit("2", "Bres", "Second Audit", "terminé", "3 mars", "4 juillet", 36, 12, 0 );
        CardAudit cres = new CardAudit("3", "Cres", "Nom d'Audit", "terminé", "3 mars", "4 juillet", 36, 12, 0 );
        CardAudit dres = new CardAudit("4", "Dres", "Blabla",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit eres = new CardAudit("5", "Eres", "Car",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit fres = new CardAudit("6", "Fres", "ouiii",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit gres = new CardAudit("7", "Gres", "osef",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit hres = new CardAudit("8", "Hres", "Lorem Ipsum",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit ires = new CardAudit("9", "Ires", "hanhan",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit jres = new CardAudit("10", "Jres", "Ananas",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit kres = new CardAudit("11", "Kres", "Pizza",  "terminé", "3 mars", "4 juillet", 36, 12, 0);
        CardAudit lres = new CardAudit("12", "Lres", "Pizzananas",  "terminé", "3 mars", "4 juillet", 36, 12, 0);

        listDataHeader.add(ares);
        listDataHeader.add(bres);
        listDataHeader.add(cres);
        listDataHeader.add(dres);
        listDataHeader.add(eres);
        listDataHeader.add(fres);
        listDataHeader.add(gres);
        listDataHeader.add(hres);
        listDataHeader.add(ires);
        listDataHeader.add(jres);
        listDataHeader.add(kres);
        listDataHeader.add(lres);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.audits, menu);
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
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tab_bord) {
            Intent intent = new Intent(Audits.this, TableauBord.class);
            startActivity(intent);
        }
        else if (id == R.id.projets) {
            Intent intent = new Intent(Audits.this, Projetsv2.class);
            startActivity(intent);
        }
        else if (id == R.id.audits) {
        }
        else if (id == R.id.rapports) {
            Intent intent = new Intent(Audits.this, Rapports.class);
            startActivity(intent);
        }
        else if (id == R.id.jobs) {
            Intent intent = new Intent(Audits.this, Jobs.class);
            startActivity(intent);
        }
        else if (id == R.id.users) {
            Intent intent = new Intent(Audits.this, Users.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onLogoutClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ActivityMain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
    }
}
