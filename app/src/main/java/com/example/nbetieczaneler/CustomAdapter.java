package com.example.nbetieczaneler;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private LayoutInflater userInflater;
    private List<Eczane> eczaneList;

    public CustomAdapter(Activity activity, List<Eczane> eczaneList) {
        userInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.eczaneList = eczaneList;
    }

    @Override
    public int getCount() {
        return eczaneList.size();
    }

    @Override
    public Object getItem(int position) {
        return eczaneList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View lineView;
        lineView = userInflater.inflate(R.layout.custom_layout,null);
        TextView textViewEczaneAd=(TextView) lineView.findViewById(R.id.eczaneadi);
        TextView textViewEczaneAdres=(TextView) lineView.findViewById(R.id.ecaneAdress);
        TextView textViewEczaneTel=(TextView) lineView.findViewById(R.id.ecaneTel);

        Eczane eczane = eczaneList.get(position);

        textViewEczaneAd.setText(eczane.getEczaneAdi());
        textViewEczaneAdres.setText(eczane.getAdres());
        textViewEczaneTel.setText(eczane.getTelefonNumari());
        return lineView;
    }
}
