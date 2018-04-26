package com.laposte.ares.ares;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by PECH652 on 26/04/2018.
 */

public abstract class CardAuditExpandableAdapter extends BaseExpandableListAdapter {

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        View v = convertView;
        Context ctx = parent.getContext();
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.card_audit_fils, parent, false);
        }

        TextView itemName = (TextView) v.findViewById(R.id.itemName);
        TextView itemDescr = (TextView) v.findViewById(R.id.itemDescr);
//
//        ItemDetail det = catList.get(groupPosition).getItemList().get(childPosition);
//
//        itemName.setText(det.getName());
//        itemDescr.setText(det.getDescr());

        return v;

    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

}
