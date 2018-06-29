package com.laposte.ares.ares;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Projets extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MyExpandableProjectListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<List<String>>> listDataChild;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetsv2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        expListView = (ExpandableListView) findViewById(R.id.listProjets);

        prepareListData();

        listAdapter = new MyExpandableProjectListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return false;
            }
        });
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<List<String>>>();

        // Adding child data
        listDataHeader.add("Projet001");
        listDataHeader.add("Projet002");
        listDataHeader.add("Projet003");
        listDataHeader.add("Projet004");
        listDataHeader.add("Projet005");
        listDataHeader.add("Projet006");
        listDataHeader.add("Projet007");
        listDataHeader.add("Projet008");
        listDataHeader.add("Projet009");
        listDataHeader.add("Projet010");
        listDataHeader.add("Projet011");
        listDataHeader.add("Projet012");
        listDataHeader.add("Projet013");
        listDataHeader.add("Projet014");
        listDataHeader.add("Projet015");
        listDataHeader.add("Projet016");
        listDataHeader.add("Projet017");
        listDataHeader.add("Projet018");

        // Adding child data
        List<List<String>> projet001 = new ArrayList<>();
        List<String> contentprojet001 = new ArrayList<>();
        contentprojet001.add("Description001");
        contentprojet001.add("1");
        contentprojet001.add("14");
        contentprojet001.add("100");
        projet001.add(contentprojet001);
        List<List<String>> projet002 = new ArrayList<>();
        List<String> contentprojet002 = new ArrayList<>();
        contentprojet002.add("Description002");
        contentprojet002.add("1");
        contentprojet002.add("14");
        contentprojet002.add("100");
        projet002.add(contentprojet002);
        List<List<String>> projet003 = new ArrayList<>();
        List<String> contentprojet003 = new ArrayList<>();
        contentprojet003.add("Description003");
        contentprojet003.add("1");
        contentprojet003.add("14");
        contentprojet003.add("100");
        projet003.add(contentprojet003);
        List<List<String>> projet004 = new ArrayList<>();
        List<String> contentprojet004 = new ArrayList<>();
        contentprojet004.add("Description004");
        contentprojet004.add("1");
        contentprojet004.add("14");
        contentprojet004.add("100");
        projet004.add(contentprojet004);
        List<List<String>> projet005 = new ArrayList<>();
        List<String> contentprojet005 = new ArrayList<>();
        contentprojet005.add("Description005");
        contentprojet005.add("1");
        contentprojet005.add("14");
        contentprojet005.add("100");
        projet005.add(contentprojet005);
        List<List<String>> projet006 = new ArrayList<>();
        List<String> contentprojet006 = new ArrayList<>();
        contentprojet006.add("Description006");
        contentprojet006.add("1");
        contentprojet006.add("14");
        contentprojet006.add("100");
        projet006.add(contentprojet006);
        List<List<String>> projet007 = new ArrayList<>();
        List<String> contentprojet007 = new ArrayList<>();
        contentprojet007.add("Description007");
        contentprojet007.add("1");
        contentprojet007.add("14");
        contentprojet007.add("100");
        projet007.add(contentprojet007);
        List<List<String>> projet008 = new ArrayList<>();
        List<String> contentprojet008 = new ArrayList<>();
        contentprojet008.add("Description008");
        contentprojet008.add("1");
        contentprojet008.add("14");
        contentprojet008.add("100");
        projet008.add(contentprojet008);
        List<List<String>> projet009 = new ArrayList<>();
        List<String> contentprojet009 = new ArrayList<>();
        contentprojet009.add("Description009");
        contentprojet009.add("1");
        contentprojet009.add("14");
        contentprojet009.add("100");
        projet009.add(contentprojet009);
        List<List<String>> projet010 = new ArrayList<>();
        List<String> contentprojet010 = new ArrayList<>();
        contentprojet010.add("Description010");
        contentprojet010.add("1");
        contentprojet010.add("14");
        contentprojet010.add("100");
        projet010.add(contentprojet010);
        List<List<String>> projet011 = new ArrayList<>();
        List<String> contentprojet011 = new ArrayList<>();
        contentprojet011.add("Description011");
        contentprojet011.add("1");
        contentprojet011.add("14");
        contentprojet011.add("100");
        projet011.add(contentprojet011);
        List<List<String>> projet012 = new ArrayList<>();
        List<String> contentprojet012 = new ArrayList<>();
        contentprojet012.add("Description012");
        contentprojet012.add("1");
        contentprojet012.add("14");
        contentprojet012.add("100");
        projet012.add(contentprojet012);
        List<List<String>> projet013 = new ArrayList<>();
        List<String> contentprojet013 = new ArrayList<>();
        contentprojet013.add("Description013");
        contentprojet013.add("1");
        contentprojet013.add("14");
        contentprojet013.add("100");
        projet013.add(contentprojet013);
        List<List<String>> projet014 = new ArrayList<>();
        List<String> contentprojet014 = new ArrayList<>();
        contentprojet014.add("Description014");
        contentprojet014.add("1");
        contentprojet014.add("14");
        contentprojet014.add("100");
        projet014.add(contentprojet014);
        List<List<String>> projet015 = new ArrayList<>();
        List<String> contentprojet015 = new ArrayList<>();
        contentprojet015.add("Description015");
        contentprojet015.add("1");
        contentprojet015.add("14");
        contentprojet015.add("100");
        projet015.add(contentprojet015);
        List<List<String>> projet016 = new ArrayList<>();
        List<String> contentprojet016 = new ArrayList<>();
        contentprojet016.add("Description016");
        contentprojet016.add("1");
        contentprojet016.add("14");
        contentprojet016.add("100");
        projet016.add(contentprojet016);
        List<List<String>> projet017 = new ArrayList<>();
        List<String> contentprojet017 = new ArrayList<>();
        contentprojet017.add("Description017");
        contentprojet017.add("1");
        contentprojet017.add("14");
        contentprojet017.add("100");
        projet017.add(contentprojet017);
        List<List<String>> projet018 = new ArrayList<>();
        List<String> contentprojet018 = new ArrayList<>();
        contentprojet018.add("Description018");
        contentprojet018.add("1");
        contentprojet018.add("14");
        contentprojet018.add("100");
        projet018.add(contentprojet018);

        listDataChild.put(listDataHeader.get(0), projet001);
        listDataChild.put(listDataHeader.get(1), projet002);
        listDataChild.put(listDataHeader.get(2), projet003);
        listDataChild.put(listDataHeader.get(3), projet004);
        listDataChild.put(listDataHeader.get(4), projet005);
        listDataChild.put(listDataHeader.get(5), projet006);
        listDataChild.put(listDataHeader.get(6), projet007);
        listDataChild.put(listDataHeader.get(7), projet008);
        listDataChild.put(listDataHeader.get(8), projet009);
        listDataChild.put(listDataHeader.get(9), projet010);
        listDataChild.put(listDataHeader.get(10), projet011);
        listDataChild.put(listDataHeader.get(11), projet012);
        listDataChild.put(listDataHeader.get(12), projet013);
        listDataChild.put(listDataHeader.get(13), projet014);
        listDataChild.put(listDataHeader.get(14), projet015);
        listDataChild.put(listDataHeader.get(15), projet016);
        listDataChild.put(listDataHeader.get(16), projet017);
        listDataChild.put(listDataHeader.get(17), projet018);
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
        getMenuInflater().inflate(R.menu.projetsv2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.tri_nom) {
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
            Intent intent = new Intent(Projets.this, TableauBord.class);
            startActivity(intent);
        }
        else if (id == R.id.projets) {

        }
        else if (id == R.id.audits) {
            Intent intent = new Intent(Projets.this, Audits.class);
            startActivity(intent);
        }
        else if (id == R.id.rapports) {
            Intent intent = new Intent(Projets.this, Rapports.class);
            startActivity(intent);
        }
        else if (id == R.id.jobs) {
            Intent intent = new Intent(Projets.this, Jobs.class);
            startActivity(intent);
        }
        else if (id == R.id.users) {
            Intent intent = new Intent(Projets.this, Users.class);
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
