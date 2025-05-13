import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        int nbretotaldemot = 0;
        while (scanner.hasNextLine()){
        String ligne = scanner.nextLine();
            String[] mots = ligne.trim().split("");
            nbretotaldemot += mots.length;

        }
        System.out.println("Nombre total de mot est" +nbretotaldemot);
        scanner.close();
    }
}
