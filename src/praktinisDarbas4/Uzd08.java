package praktinisDarbas4;

import java.util.Scanner;

public class Uzd08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Kiek prekiu: ");
        int a = reader.nextInt();
        double suma = 0;
        double vid;

        for (int i = 1; i <= a; i++) {
            System.out.println("Prekiu kaina");
            double b = reader.nextDouble();
            suma += b;
        }

        vid = suma / a;
        System.out.println("Vidutiniskai viena preke kainavo " + vid + " Eur");
        System.out.println("Per diena pardave prekiu uz " + suma + " Eur");
    }
}
