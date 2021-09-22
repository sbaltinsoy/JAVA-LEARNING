import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("Book","Kitap");
        sozluk.put("Desk","Sira");
        sozluk.put("Computer","Bilgisayar");
        // 1. olan anahtar 2. olan deger gorevini gorur

        for(String item: sozluk.keySet()){
            System.out.println("Eleman-"+item+" Deger-"+sozluk.get(item));
        }

        System.out.println(sozluk.size());
        sozluk.remove("Book");
        System.out.println(sozluk.get("Kitap"));
    }
}
