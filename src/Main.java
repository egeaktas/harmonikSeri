// Harmonik fonksiyon programı.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a;
       double toplam = 0;
       a = input.nextInt();

       for(int i = 1; i<=a; i++){
           toplam = toplam + (1.0/i);
       }

        System.out.println(toplam);

    }
}