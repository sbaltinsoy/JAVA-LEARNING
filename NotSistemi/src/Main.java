import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Merhaba Java");
        System.out.println("Merhaba Java2");

        int ogrenciSayi = 10;
        String mesaj = "Ogrenci Sayisi = ";
        System.out.println(mesaj + ogrenciSayi++);
        System.out.println(mesaj + ogrenciSayi);

        int sayi1 = 11;
        int sayi2 = 55;
        int sayi3 = 33;
        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println(enBuyuk);

        char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("Mukemmel : Gectiniz !");
                break;
            case 'B':
                System.out.println("Cok guzel : Gectiniz !");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz !");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz !");
                break;
            case 'F':
                System.out.println("Malesef Kaldiniz !");
                break;
            default:
                System.out.println("Gecersiz Not Girdiniz !");
        }
    }
}
