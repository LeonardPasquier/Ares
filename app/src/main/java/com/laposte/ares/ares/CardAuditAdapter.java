package com.laposte.ares.ares;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by PECH652 on 19/04/2018.
 */

public class CardAuditAdapter extends ArrayAdapter<CardAudit> {
    public CardAuditAdapter(Context context, List<CardAudit> cards){
        super(context, 0, cards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card_audits, parent, false);
        }

        CardAuditViewHolder viewHolder = (CardAuditViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CardAuditViewHolder();
            viewHolder.id = (TextView) convertView.findViewById(R.id.id);
            viewHolder.projet = (TextView) convertView.findViewById(R.id.projet);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            convertView.setTag(viewHolder);
        }

        CardAudit card = getItem(position);

        viewHolder.id.setText(card.getId());
        viewHolder.projet.setText(card.getProjet());
        viewHolder.nom.setText(card.getNom());

        return convertView;
    }

    private class CardAuditViewHolder{
        public TextView id;
        public TextView projet;
        public TextView nom;
    }
}
