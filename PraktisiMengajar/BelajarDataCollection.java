package PraktisiMengajar;

import java.util.ArrayList;
import java.util.Collection;

public class BelajarDataCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Gibranda");
        names.add("Wedanta");
        names.add("Putri");
        names.addAll(Array.asList("Setiawan", "Bagas"));

        naems.remove("Gibranda");

        System.out.println(names.contains("Gibranda"));

        for(var name: names){
            System.out.println(name);
        }
    }
}
