package Exercitiu1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void scriere(Map<Integer,Carti> map) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/CartiAfter.json");
            mapper.writeValue(file,map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer,Carti> citire() {
        try {
            File file=new File("src/main/resources/Carti.json");
            ObjectMapper mapper=new ObjectMapper();
            Map<Integer,Carti> carti = mapper
                    .readValue(file, new TypeReference<Map<Integer,Carti>>(){});
            return carti;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

//        Carti c1 = new Carti("Plansul lui Nitzsche", "Irvin Yalom", 1992);
//        Carti c2 = new Carti("De veghe in lanul de secara", "J.D. SALINGER", 1951);
//        Carti c3 = new Carti("Mitul lui Camus", "Albert Camus", 1942);
//        Carti c4 = new Carti("Scurta istorie a omenirii", "Yuval Noah Harari", 2011);
//        Carti c5 = new Carti("Homo deus - Scurta istorie a viitorului", "Yuval Noah Harari", 2015);
//        Carti c6 = new Carti("21 de lectii pentru secolul XXI", "Yuval Noah Harari", 2018);
//
          Map<Integer,Carti> map=citire();

//        map.put("cheia1",c1);
//        map.put("cheia2",c2);
//        map.put("cheia3",c3);
//        map.put("cheia4",c4);
//        map.put("cheia5",c5);
//        map.put("cheia6",c6);



        System.out.println(map);
        map.putIfAbsent(7,new Carti("Carte Noua","Java",1999));
        System.out.println(map);
        var entry=map.entrySet();
        var it=entry.iterator();

        map.remove(1);

        System.out.println(map);
        scriere(map);
       



        



    }


}
