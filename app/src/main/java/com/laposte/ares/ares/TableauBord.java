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

public class TableauBord extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MyExpandableProjectListAdapter projectListAdapter;
    MyExpandableAuditListAdapter auditListAdapter;
    ExpandableListView expListViewAudit;
    ExpandableListView expListViewProject;
    List<String> listDataHeaderProject;
    HashMap<String, List<List<String>>> listDataChildProject;
    List<String> listDataHeaderAudit;
    HashMap<String, List<List<String>>> listDataChildAudit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableau_bord);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        expListViewProject = (ExpandableListView) findViewById(R.id.projetListView);
        expListViewAudit = (ExpandableListView) findViewById(R.id.auditListView);

        prepareListDataProject();
        prepareListDataAudit();

        projectListAdapter = new MyExpandableProjectListAdapter(this, listDataHeaderProject, listDataChildProject);
        auditListAdapter = new MyExpandableAuditListAdapter(this, listDataHeaderAudit, listDataChildAudit);

        // setting list adapter
        expListViewProject.setAdapter(projectListAdapter);
        expListViewAudit.setAdapter(auditListAdapter);

        // Listview Group click listener
        expListViewProject.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

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
        expListViewProject.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListViewProject.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListViewProject.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

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
        // Listview Group click listener
        expListViewAudit.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

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
        expListViewAudit.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListViewAudit.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListViewAudit.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
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

    private void prepareListDataProject() {
        listDataHeaderProject = new ArrayList<String>();
        listDataChildProject = new HashMap<String, List<List<String>>>();

        // Adding child data
        listDataHeaderProject.add("LastProject");

        // Adding child data
        List<List<String>> lastProject = new ArrayList<>();
        List<String> contentLastProject = new ArrayList<>();
        contentLastProject.add("DescriptionLastProject");
        contentLastProject.add("10");
        contentLastProject.add("140");
        contentLastProject.add("1000");
        lastProject.add(contentLastProject);

        listDataChildProject.put(listDataHeaderProject.get(0), lastProject);

    }

    private void prepareListDataAudit() {
        listDataHeaderAudit = new ArrayList<String>();
        listDataChildAudit = new HashMap<String, List<List<String>>>();

        // Adding child data
        listDataHeaderAudit.add("LastAudit");

        // Adding child data
        List<List<String>> lastAudit = new ArrayList<>();
        List<String> contentLastAudit = new ArrayList<>();
        contentLastAudit.add("Statut dernier audit");
        contentLastAudit.add("Date debut dernier audit");
        contentLastAudit.add("Date fin dernier audit");
        contentLastAudit.add("10");
        contentLastAudit.add("140");
        contentLastAudit.add("1000");
        lastAudit.add(contentLastAudit);

        listDataChildAudit.put(listDataHeaderAudit.get(0), lastAudit);

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
        getMenuInflater().inflate(R.menu.tableau_bord, menu);
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
        }
        else if (id == R.id.projets) {
            Intent intent = new Intent(TableauBord.this, Projets.class);
            startActivity(intent);
        }
        else if (id == R.id.audits) {
            Intent intent = new Intent(TableauBord.this, Audits.class);
            startActivity(intent);
        }
        else if (id == R.id.rapports) {
            Intent intent = new Intent(TableauBord.this, Rapports.class);
            startActivity(intent);
        }
        else if (id == R.id.jobs) {
            Intent intent = new Intent(TableauBord.this, Jobs.class);
            startActivity(intent);
        }
        else if (id == R.id.users) {
            Intent intent = new Intent(TableauBord.this, Users.class);
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
