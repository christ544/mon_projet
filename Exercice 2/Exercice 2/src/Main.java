import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
   Random rand = new Random();
   int nbre = (int) (Math.random() * 100);
   Scanner scanner = new Scanner (System.in);
   int nbredessai =0;
   boolean verdict = false;
   System.out.println("Devine un nombre entre 0 et 100");
   
   while (nbredessai<10){
       System.out.println("essaie");
        int valeur = scanner.nextInt();
       if (valeur == nbre){
           verdict = true;
           break;  }
           else if(valeur < nbre){
               System.out.println("le nombre est petit");
           } else {
               System.out.println("le nombre est grand");
           }
       }
   if (verdict){
       System.out.println("bravo le nombre est correct");
   }else{
       System.out.println("dommage");
   }
   }
   } 
    
