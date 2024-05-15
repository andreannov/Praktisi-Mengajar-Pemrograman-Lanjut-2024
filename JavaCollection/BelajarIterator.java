package PraktisiMengajar;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class BelajarIterator {
    
    // public static void main(String[] args) {
    //     Iterable<String> names = List.of("Gibranda");
    //     for(var name : names){
    //         System.out.println(name);
    //     }
    // }

    public static void main(String[] args) {
        BelajarIterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
