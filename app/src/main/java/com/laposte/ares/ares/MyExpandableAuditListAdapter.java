package com.laposte.ares.ares;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by PECH652 on 25/06/2018.
 */

public class MyExpandableAuditListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<List<String>>> _listDataChild;

    public MyExpandableAuditListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<List<String>>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final List<String> childArray = (List<String>) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.card_audit_fils, null);
        }

        TextView statut = (TextView) convertView.findViewById(R.id.statut);
        TextView date_debut = (TextView) convertView.findViewById(R.id.date_debut);
        TextView date_fin = (TextView) convertView.findViewById(R.id.date_fin);
        TextView vuln_fortes = (TextView) convertView.findViewById(R.id.vuln_fortes);
        TextView vuln_moyennes = (TextView) convertView.findViewById(R.id.vuln_moyennes);
        TextView vuln_faibles = (TextView) convertView.findViewById(R.id.vun_faibles);
        Button consulter = (Button) convertView.findViewById(R.id.consulter);
        Button editer = (Button) convertView.findViewById(R.id.Editer);

        statut.setText(childArray.get(0));
        date_debut.setText(childArray.get(1));
        date_fin.setText(childArray.get(2));
        vuln_fortes.setText(childArray.get(3));
        vuln_moyennes.setText(childArray.get(4));
        vuln_faibles.setText(childArray.get(5));

        consulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(_context, Consult_audit.class);
                _context.startActivity(intent);
            }
        });

        editer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(_context, "Nous éditons le projet "+childArray.get(0), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.card_liste_pere, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.nom);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}