package com.example.nbetieczaneler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ListView listView;
    List<Eczane> eczaneList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner1);
        listView=findViewById(R.id.mylistview);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String ilce= parent.getItemAtPosition(position).toString();
               try {
                   pullAndPress(ilce);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
    }

    public void pullAndPress(final String ilce) throws InterruptedException {

        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    getdata eczaneleriGetir = new getdata();
                    eczaneList=  eczaneleriGetir.rtEczaneListesi(ilce);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        thread.start();
        thread.join();
           final ListView listView = (ListView) findViewById(R.id.mylistview);
        CustomAdapter adapter = new CustomAdapter(this, eczaneList);
        listView.setAdapter(adapter);


    }

}
