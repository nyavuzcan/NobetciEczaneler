package com.example.nbetieczaneler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getdata {
    String ilce;
    public List<Eczane> rtEczaneListesi(String ilce) throws Exception{


        if (ilce.equals("TÜM İLÇELER")){
            this.ilce=ilce;
            EczaneListesi eczaneListesi = new EczaneListesi();
            List<String>eczaneAlllist = eczaneListesi.getAllLinks();
            List<Eczane> eczaneList = new ArrayList<>();
            for (String ln: eczaneAlllist){

            Document document = Jsoup.connect(ln).get();
            Elements elements = document.getElementsByClass("table table-condensed table-hover table-bordered");
            for (Element singleElement : elements){
                String eczaneBaslik =  singleElement.getElementsByTag("a").first().attr("title");
                String [] adresVeTelefon = singleElement.getElementsByTag("tbody").text().split("Tel: ");
                String adres = adresVeTelefon[0];
                String tel = adresVeTelefon[1];

                Eczane eczane = new Eczane();
                eczane.setEczaneAdi(eczaneBaslik);
                eczane.setAdres(adres);
                eczane.setTelefonNumari(tel);
                eczaneList.add(eczane);

            }

            }
            return eczaneList;

        }

        this.ilce=ilce;
        EczaneListesi eczaneListesi = new EczaneListesi();
        String eczaneLinki = eczaneListesi.getEczaneLinkleri(ilce);
        List<Eczane> eczaneList = new ArrayList<>();
        Document document = Jsoup.connect(eczaneLinki).get();
        Elements elements = document.getElementsByClass("table table-condensed table-hover table-bordered");
        for (Element singleElement : elements){
            String eczaneBaslik =  singleElement.getElementsByTag("a").first().attr("title");
            String [] adresVeTelefon = singleElement.getElementsByTag("tbody").text().split("Tel: ");
            String adres = adresVeTelefon[0];
            String tel = adresVeTelefon[1];

            Eczane eczane = new Eczane();
            eczane.setEczaneAdi(eczaneBaslik);
            eczane.setAdres(adres);
            eczane.setTelefonNumari(tel);
            eczaneList.add(eczane);
        }
        return eczaneList;
    }
}