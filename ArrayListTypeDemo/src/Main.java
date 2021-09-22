import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Usak");
        sehirler.add("Bursa");

        sehirler.remove("Bursa");
        sehirler.remove(0);

        System.out.println(sehirler);

        sehirler.add("Izmir");

        sehirler.add("Aydin");

        Collections.sort(sehirler);

        for(String sehir: sehirler){
            System.out.println(sehir);
        }



    }
}
