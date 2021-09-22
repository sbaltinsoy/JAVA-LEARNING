public class Main {

    public static void main(String[] args) {
        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Dizi sayisi asimi yapildi HATA !\n" + exception);
        }
        catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch(Exception exception){
            System.out.println("Loglandi ?!" + exception);
        }finally {
            System.out.println("Her turlu calisir!");
        }

    }
}
