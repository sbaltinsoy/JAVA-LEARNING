import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\JavaProject\\files\\students.txt");
        createFile(file);
        getFileInfo(file);
        writeFile(file);
        readFile(file);
    }

    public static void createFile(File file){
        try{
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu !");
            }else{
                System.out.println("Dosya zaten mevcut  !");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void getFileInfo(File file){
        if(file.exists()){
            System.out.println("Dosya adi :" + file.getName());
            System.out.println("Dosya yolu : "+ file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi : "+ file.canWrite());
            System.out.println("Dosya yazilabilir mi : "+ file.canRead());
            System.out.println("Dosya boyutu nedir : "+ file.length() + " Byte");
        }
    }
    public static void readFile(File file){
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true));
            writer.newLine();
            writer.write("\nALTINSOY");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
