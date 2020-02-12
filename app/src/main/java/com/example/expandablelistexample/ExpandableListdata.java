package com.example.expandablelistexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListdata {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Das Mehl, Wasser, Hefe, Öl, Zucker sowie 1/4 TL Knoblauchsalz und das normale Salz zu einem Hefeteig ansetzen. Ich mache dies in einem Brotbackautomaten mit dem Knetprogramm in 1,5 Stunden. Aber es geht auch ohne. \nDie passierten Tomaten, das Oregano sowie noch etwas Knoblauchsalz zu einer Soße (Topping) verrühren. \n\nDer Teig kann nun auf einem Backblech ausgerollt und mit Zutaten nach Wunsch belegt werden. Er wird dann im vorgeheizten Backofen bei 220° Grad ca. 20 bis 25 Min gebacken. ");
        cricket.add("Pakistan und");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");
        cricket.add("Das Mehl, Wasser, Hefe, Öl, Zucker sowie 1/4 TL Knoblauchsalz und das normale Salz zu einem Hefeteig ansetzen. Ich mache dies in einem Brotbackautomaten mit dem Knetprogramm in 1,5 Stunden. Aber es geht auch ohne. \nDie passierten Tomaten, das Oregano sowie noch etwas Knoblauchsalz zu einer Soße (Topping) verrühren. \n\nDer Teig kann nun auf einem Backblech ausgerollt und mit Zutaten nach Wunsch belegt werden. Er wird dann im vorgeheizten Backofen bei 220° Grad ca. 20 bis 25 Min gebacken. ");
        cricket.add("Pakistan und");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");
        cricket.add("Das Mehl, Wasser, Hefe, Öl, Zucker sowie 1/4 TL Knoblauchsalz und das normale Salz zu einem Hefeteig ansetzen. Ich mache dies in einem Brotbackautomaten mit dem Knetprogramm in 1,5 Stunden. Aber es geht auch ohne. \nDie passierten Tomaten, das Oregano sowie noch etwas Knoblauchsalz zu einer Soße (Topping) verrühren. \n\nDer Teig kann nun auf einem Backblech ausgerollt und mit Zutaten nach Wunsch belegt werden. Er wird dann im vorgeheizten Backofen bei 220° Grad ca. 20 bis 25 Min gebacken. ");
        cricket.add("Pakistan und");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");

        List<String> football = new ArrayList<String>();
        football.add("Brazil");
        football.add("Spain");
        football.add("Germany");
        football.add("Netherlands");
        football.add("Italy");

        List<String> basketball = new ArrayList<String>();
        basketball.add("United States");
        basketball.add("Spain");
        basketball.add("Argentina");
        basketball.add("France");
        basketball.add("Russia");
        basketball.add("United States");
        basketball.add("Spain");
        basketball.add("Argentina");
        basketball.add("France");
        basketball.add("Russia");

        expandableListDetail.put("CRICKET TEAMS", cricket);
        expandableListDetail.put("FOOTBALL TEAMS", football);
        expandableListDetail.put("BASKETBALL TEAMS", basketball);
        return expandableListDetail;
    }

}
