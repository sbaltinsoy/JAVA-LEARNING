import Matematik.*;

import java.util.Scanner;
// built-in
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Isminizi giriniz : ");
        String isim = scanner.nextLine().toString();
        System.out.println("Merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}
