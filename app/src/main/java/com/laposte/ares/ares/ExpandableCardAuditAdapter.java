package com.laposte.ares.ares;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by PECH652 on 23/05/2018.
 */

public class ExpandableCardAuditAdapter extends BaseExpandableListAdapter{

    private Context _context;
    private List<CardAudit> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<CardAudit>> _listDataChild;

    public ExpandableCardAuditAdapter(Context context, List<CardAudit> listDataHeader,
    HashMap<String, List<CardAudit>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        System.out.println("test");
        final CardAudit child = (CardAudit) getGroup(groupPosition);

        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.card_audit_fils, null);
        }

        TextView statut = (TextView) convertView.findViewById(R.id.statut);
        TextView date_debut = (TextView) convertView.findViewById(R.id.date_debut);
        TextView date_fin = (TextView) convertView.findViewById(R.id.date_fin);
        TextView vuln_fortes = (TextView) convertView.findViewById(R.id.vuln_fortes);
        TextView vuln_moyennes = (TextView) convertView.findViewById(R.id.vuln_moyennes);
        TextView vuln_faibles = (TextView) convertView.findViewById(R.id.vun_faibles);

        statut.setText(child.getStatut());
        date_debut.setText(child.getDate_debut());
        date_fin.setText(child.getDate_fin());
        vuln_fortes.setText(child.getVuln_forte());
        vuln_moyennes.setText(child.getVuln_moyenne());
        vuln_faibles.setText(child.getVuln_faible());

        return convertView;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        System.out.println("tarazeeryryuiest");

        CardAudit headerTitle = (CardAudit) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.card_audits, null);
        }

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView projet = (TextView) convertView.findViewById(R.id.projet);
        TextView nom = (TextView) convertView.findViewById(R.id.nom);

        id.setText(headerTitle.getId());
        projet.setText(headerTitle.getProjet());
        nom.setText(headerTitle.getNom());

        return convertView;
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
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
