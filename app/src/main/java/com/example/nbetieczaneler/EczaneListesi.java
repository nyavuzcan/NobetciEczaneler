package com.example.nbetieczaneler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EczaneListesi {
    HashMap<String,String> liste= new HashMap<>();
    private static final String ADALAR ="https://www.istanbulnobetcieczaneler.com/adalar";
    private static final String ARNAVUTKOY ="https://www.istanbulnobetcieczaneler.com/arnavutkoy";
    private static final String ATASEHIR ="https://www.istanbulnobetcieczaneler.com/atasehir";
    private static final String AVCILAR ="https://www.istanbulnobetcieczaneler.com/avcilar";
    private static final String BAGCILAR ="https://www.istanbulnobetcieczaneler.com/bagcilar";
    private static final String BAHCELIEVLER="https://www.istanbulnobetcieczaneler.com/bahcelievler";
    private static final String BAKIRKOY ="https://www.istanbulnobetcieczaneler.com/bakirkoy";
    private static final String BASAKSEHIR ="https://www.istanbulnobetcieczaneler.com/basaksehir";
    private static final String BAYRAMPASA ="https://www.istanbulnobetcieczaneler.com/bayrampasa";
    private static final String BESIKTAS ="https://www.istanbulnobetcieczaneler.com/besiktas";
    private static final String BEYKOZ ="https://www.istanbulnobetcieczaneler.com/beykoz";
    private static final String BEYLIKDUZU ="https://www.istanbulnobetcieczaneler.com/beylikduzu";
    private static final String BEYOGLU ="https://www.istanbulnobetcieczaneler.com/beyoglu";
    private static final String BUYUKCEKMECE ="https://www.istanbulnobetcieczaneler.com/buyukcekmece";
    private static final String CATALACA ="https://www.istanbulnobetcieczaneler.com/catalca";
    private static final String CEKMEKOY ="https://www.istanbulnobetcieczaneler.com/cekmekoy";
    private static final String ESENLER ="https://www.istanbulnobetcieczaneler.com/esenler";
    private static final String ESENYURT ="https://www.istanbulnobetcieczaneler.com/esenyurt";
    private static final String EYUP ="https://www.istanbulnobetcieczaneler.com/eyup";
    private static final String FATIH ="https://www.istanbulnobetcieczaneler.com/fatih";
    private static final String GAZIOSMANPASA ="https://www.istanbulnobetcieczaneler.com/gaziosmanpasa";
    private static final String GUNGOREN ="https://www.istanbulnobetcieczaneler.com/gungoren";
    private static final String kadikoy = "https://www.istanbulnobetcieczaneler.com/kadikoy";
    private static final String kagithane = "https://www.istanbulnobetcieczaneler.com/kagithane";
    private static final String kartal = "https://www.istanbulnobetcieczaneler.com/kartal";
    private static final String kucukcekmece = "https://www.istanbulnobetcieczaneler.com/kucukcekmece";
    private static final String maltepe = "https://www.istanbulnobetcieczaneler.com/maltepe";
    private static final String pendik = "https://www.istanbulnobetcieczaneler.com/pendik";
    private static final String sancaktepe = "https://www.istanbulnobetcieczaneler.com/sancaktepe";
    private static final String sariyer = "https://www.istanbulnobetcieczaneler.com/sariyer";
    private static final String sile = "https://www.istanbulnobetcieczaneler.com/sile";
    private static final String silivri = "https://www.istanbulnobetcieczaneler.com/silivri";
    private static final String sisli = "https://www.istanbulnobetcieczaneler.com/sisli";
    private static final String sultanbeyli = "https://www.istanbulnobetcieczaneler.com/sultanbeyli";
    private static final String sultangazi = "https://www.istanbulnobetcieczaneler.com/sultangazi";
    private static final String tuzla = "https://www.istanbulnobetcieczaneler.com/tuzla";
    private static final String umraniye = "https://www.istanbulnobetcieczaneler.com/umraniye";
    private static final String uskudar = "https://www.istanbulnobetcieczaneler.com/uskudar";
    private static final String zeytinburnu = "https://www.istanbulnobetcieczaneler.com/zeytinburnu";
    public EczaneListesi(){


        liste.put("ADALAR",ADALAR);
        liste.put("ARNAVUTKOY",ARNAVUTKOY);
        liste.put("ATASEHIR",ATASEHIR);
        liste.put("AVCILAR",AVCILAR);
        liste.put("BAGCILAR",BAGCILAR);
        liste.put("BAHCELIEVLER",BAHCELIEVLER);
        liste.put("BAKIRKOY",BAKIRKOY);
        liste.put("BASAKSEHIR",BASAKSEHIR);
        liste.put("BAYRAMPASA",BAYRAMPASA);
        liste.put("BESIKTAS",BESIKTAS);
        liste.put("BEYKOZ",BEYKOZ);
        liste.put("BEYOGLU",BEYOGLU);
        liste.put("BEYLIKDUZU",BEYLIKDUZU);
        liste.put("BUYUKCEKMECE",BUYUKCEKMECE);
        liste.put("CATALACA",CATALACA);
        liste.put("CEKMEKOY",CEKMEKOY);
        liste.put("ESENLER",ESENLER);
        liste.put("ESENYURT",ESENYURT);
        liste.put("EYUP",EYUP);
        liste.put("FATIH",FATIH);
        liste.put("GAZIOSMANPASA",GAZIOSMANPASA);
        liste.put("GUNGOREN",GUNGOREN);
        liste.put("kadikoy",kadikoy);
        liste.put("kagithane",kagithane);
        liste.put("kartal",kartal);
        liste.put("kucukcekmece",kucukcekmece);
        liste.put("maltepe",maltepe);
        liste.put("pendik",pendik);
        liste.put("sancaktepe",sancaktepe);
        liste.put("sariyer",sariyer);
        liste.put("sile",sile);
        liste.put("silivri",silivri);
        liste.put("sisli",sisli);
        liste.put("sultanbeyli",sultanbeyli);
        liste.put("sultangazi",sultangazi);
        liste.put("tuzla",tuzla);
        liste.put("umraniye",umraniye);
        liste.put("uskudar",uskudar);
        liste.put("zeytinburnu",zeytinburnu);
    }
    public String getEczaneLinkleri(String ilce){


        return liste.get(ilce);
    }
    public  List<String> getAllLinks(){
        return new ArrayList<String>(liste.values());
    }
}