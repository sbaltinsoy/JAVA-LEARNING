import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String ogrenci1 = "Salih";
        String ogrenci2 = "Murat";
        String ogrenci3 = "Ayse";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Burak";
        ogrenciler[2] = "Ahmet";
        for (int i = 0; i < 3; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        System.out.println("--------------------------------\n Diziler Ornek \n");

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En buyuk Sayi = " + max);

        System.out.println("--------------------------------\nCok Boyutlu Diziler Ornek \n");

        String[][] sehirler = new String[3][2];

        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Sakarya";
        sehirler[1][0] = "Usak";
        sehirler[1][1] = "Afyon";
        sehirler[2][0] = "Antalya";
        sehirler[2][1] = "Burdur";

        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

        System.out.println("--------------------------------\nStringler ile calismak \n");

        String mesaj = "Bugun hava cok guzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sayisi = "+ mesaj.length());

        System.out.println("5.eleman = " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin"));
        System.out.println(mesaj);

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("B"));
        char[] karakterler = new char[5];
        mesaj.getChars( 0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.indexOf('a'));
        // sondan bakiyor ilk buldugu a nin indexini ekrana yazdiriyor
        System.out.println(mesaj.lastIndexOf("a"));

        System.out.println(mesaj.replace(" ","-"));
        String yeniMesaj1 = mesaj.replace(" ","-");
        System.out.println(yeniMesaj1);

        System.out.println(mesaj.substring(2,5));

        for(String yeniMesaj: mesaj.split(" ")){
           System.out.println(yeniMesaj);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String mesaj2 = "       Bu gun hava cok guzel.        ";
        System.out.println(mesaj2);
        System.out.println(mesaj2.trim());
        System.out.println(topla(1,2,3,4,5,6,7));
    }

    public static int topla(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
