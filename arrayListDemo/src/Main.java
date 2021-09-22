import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
  /*  int[] sayilar = new int[]{1,2,3};
    sayilar = new int[4];
    System.out.println(sayilar[0]);*/

        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));
        //sayilar.set(0,100);

        //sayilar.remove(0);
        // remove kaldiriyor indexler kayiyor
       // sayilar.clear();
        // Butun elemanlari temizliyor
        System.out.println(sayilar.get(0));

        for(Object sayilar1: sayilar ){
            System.out.println(sayilar1);
        }

    }
}
