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

public class Audits extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MyExpandableAuditListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<List<String>>> listDataChild;

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

        expListView = (ExpandableListView) findViewById(R.id.listAudits);

        prepareListData();

        listAdapter = new MyExpandableAuditListAdapter(this, listDataHeader, listDataChild);

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
        listDataHeader.add("Audit001");
        listDataHeader.add("Audit002");
        listDataHeader.add("Audit003");
        listDataHeader.add("Audit004");
        listDataHeader.add("Audit005");
        listDataHeader.add("Audit006");
        listDataHeader.add("Audit007");
        listDataHeader.add("Audit008");
        listDataHeader.add("Audit009");
        listDataHeader.add("Audit010");
        listDataHeader.add("Audit011");
        listDataHeader.add("Audit012");
        listDataHeader.add("Audit013");
        listDataHeader.add("Audit014");
        listDataHeader.add("Audit015");
        listDataHeader.add("Audit016");
        listDataHeader.add("Audit017");
        listDataHeader.add("Audit018");

        // Adding child data
        List<List<String>> audit001 = new ArrayList<>();
        List<String> contentaudit001 = new ArrayList<>();
        contentaudit001.add("Statut001");
        contentaudit001.add("Date debut 001");
        contentaudit001.add("Date fin 001");
        contentaudit001.add("1");
        contentaudit001.add("14");
        contentaudit001.add("100");
        audit001.add(contentaudit001);
        List<List<String>> audit002 = new ArrayList<>();
        List<String> contentaudit002 = new ArrayList<>();
        contentaudit002.add("Statut002");
        contentaudit002.add("Date debut 002");
        contentaudit002.add("Date fin 002");
        contentaudit002.add("1");
        contentaudit002.add("14");
        contentaudit002.add("100");
        audit002.add(contentaudit002);
        List<List<String>> audit003 = new ArrayList<>();
        List<String> contentaudit003 = new ArrayList<>();
        contentaudit003.add("Statut003");
        contentaudit003.add("Date debut 003");
        contentaudit003.add("Date fin 003");
        contentaudit003.add("1");
        contentaudit003.add("14");
        contentaudit003.add("100");
        audit003.add(contentaudit003);
        List<List<String>> audit004 = new ArrayList<>();
        List<String> contentaudit004 = new ArrayList<>();
        contentaudit004.add("Statut004");
        contentaudit004.add("Date debut 004");
        contentaudit004.add("Date fin 004");
        contentaudit004.add("1");
        contentaudit004.add("14");
        contentaudit004.add("100");
        audit004.add(contentaudit004);
        List<List<String>> audit005 = new ArrayList<>();
        List<String> contentaudit005 = new ArrayList<>();
        contentaudit005.add("Statut005");
        contentaudit005.add("Date debut 005");
        contentaudit005.add("Date fin 005");
        contentaudit005.add("1");
        contentaudit005.add("14");
        contentaudit005.add("100");
        audit005.add(contentaudit005);
        List<List<String>> audit006 = new ArrayList<>();
        List<String> contentaudit006 = new ArrayList<>();
        contentaudit006.add("Statut006");
        contentaudit006.add("Date debut 006");
        contentaudit006.add("Date fin 006");
        contentaudit006.add("1");
        contentaudit006.add("14");
        contentaudit006.add("100");
        audit006.add(contentaudit006);
        List<List<String>> audit007 = new ArrayList<>();
        List<String> contentaudit007 = new ArrayList<>();
        contentaudit007.add("Statut007");
        contentaudit007.add("Date debut 007");
        contentaudit007.add("Date fin 007");
        contentaudit007.add("1");
        contentaudit007.add("14");
        contentaudit007.add("100");
        audit007.add(contentaudit007);
        List<List<String>> audit008 = new ArrayList<>();
        List<String> contentaudit008 = new ArrayList<>();
        contentaudit008.add("Statut008");
        contentaudit008.add("Date debut 008");
        contentaudit008.add("Date fin 008");
        contentaudit008.add("1");
        contentaudit008.add("14");
        contentaudit008.add("100");
        audit008.add(contentaudit008);
        List<List<String>> audit009 = new ArrayList<>();
        List<String> contentaudit009 = new ArrayList<>();
        contentaudit009.add("Statut009");
        contentaudit009.add("Date debut 009");
        contentaudit009.add("Date fin 009");
        contentaudit009.add("1");
        contentaudit009.add("14");
        contentaudit009.add("100");
        audit009.add(contentaudit009);
        List<List<String>> audit010 = new ArrayList<>();
        List<String> contentaudit010 = new ArrayList<>();
        contentaudit010.add("Statut010");
        contentaudit010.add("Date debut 010");
        contentaudit010.add("Date fin 010");
        contentaudit010.add("1");
        contentaudit010.add("14");
        contentaudit010.add("100");
        audit010.add(contentaudit010);
        List<List<String>> audit011 = new ArrayList<>();
        List<String> contentaudit011 = new ArrayList<>();
        contentaudit011.add("Statut011");
        contentaudit011.add("Date debut 011");
        contentaudit011.add("Date fin 011");
        contentaudit011.add("1");
        contentaudit011.add("14");
        contentaudit011.add("100");
        audit011.add(contentaudit011);
        List<List<String>> audit012 = new ArrayList<>();
        List<String> contentaudit012 = new ArrayList<>();
        contentaudit012.add("Statut012");
        contentaudit012.add("Date debut 012");
        contentaudit012.add("Date fin 012");
        contentaudit012.add("1");
        contentaudit012.add("14");
        contentaudit012.add("100");
        audit012.add(contentaudit012);
        List<List<String>> audit013 = new ArrayList<>();
        List<String> contentaudit013 = new ArrayList<>();
        contentaudit013.add("Statut013");
        contentaudit013.add("Date debut 013");
        contentaudit013.add("Date fin 013");
        contentaudit013.add("1");
        contentaudit013.add("14");
        contentaudit013.add("100");
        audit013.add(contentaudit013);
        List<List<String>> audit014 = new ArrayList<>();
        List<String> contentaudit014 = new ArrayList<>();
        contentaudit014.add("Statut014");
        contentaudit014.add("Date debut 014");
        contentaudit014.add("Date fin 014");
        contentaudit014.add("1");
        contentaudit014.add("14");
        contentaudit014.add("100");
        audit014.add(contentaudit014);
        List<List<String>> audit015 = new ArrayList<>();
        List<String> contentaudit015 = new ArrayList<>();
        contentaudit015.add("Statut015");
        contentaudit015.add("Date debut 015");
        contentaudit015.add("Date fin 015");
        contentaudit015.add("1");
        contentaudit015.add("14");
        contentaudit015.add("100");
        audit015.add(contentaudit015);
        List<List<String>> audit016 = new ArrayList<>();
        List<String> contentaudit016 = new ArrayList<>();
        contentaudit016.add("Statut016");
        contentaudit016.add("Date debut 016");
        contentaudit016.add("Date fin 016");
        contentaudit016.add("1");
        contentaudit016.add("14");
        contentaudit016.add("100");
        audit016.add(contentaudit016);
        List<List<String>> audit017 = new ArrayList<>();
        List<String> contentaudit017 = new ArrayList<>();
        contentaudit017.add("Statut017");
        contentaudit017.add("Date debut 017");
        contentaudit017.add("Date fin 017");
        contentaudit017.add("1");
        contentaudit017.add("14");
        contentaudit017.add("100");
        audit017.add(contentaudit017);
        List<List<String>> audit018 = new ArrayList<>();
        List<String> contentaudit018 = new ArrayList<>();
        contentaudit018.add("Statut018");
        contentaudit018.add("Date debut 018");
        contentaudit018.add("Date fin 018");
        contentaudit018.add("1");
        contentaudit018.add("14");
        contentaudit018.add("100");
        audit018.add(contentaudit018);

        listDataChild.put(listDataHeader.get(0), audit001);
        listDataChild.put(listDataHeader.get(1), audit002);
        listDataChild.put(listDataHeader.get(2), audit003);
        listDataChild.put(listDataHeader.get(3), audit004);
        listDataChild.put(listDataHeader.get(4), audit005);
        listDataChild.put(listDataHeader.get(5), audit006);
        listDataChild.put(listDataHeader.get(6), audit007);
        listDataChild.put(listDataHeader.get(7), audit008);
        listDataChild.put(listDataHeader.get(8), audit009);
        listDataChild.put(listDataHeader.get(9), audit010);
        listDataChild.put(listDataHeader.get(10), audit011);
        listDataChild.put(listDataHeader.get(11), audit012);
        listDataChild.put(listDataHeader.get(12), audit013);
        listDataChild.put(listDataHeader.get(13), audit014);
        listDataChild.put(listDataHeader.get(14), audit015);
        listDataChild.put(listDataHeader.get(15), audit016);
        listDataChild.put(listDataHeader.get(16), audit017);
        listDataChild.put(listDataHeader.get(17), audit018);
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
            Intent intent = new Intent(Audits.this, Projets.class);
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
