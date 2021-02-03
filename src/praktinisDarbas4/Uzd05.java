package praktinisDarbas4;

import java.util.Scanner;

public class Uzd05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Kiek paskaitu pirmadieni? ");
        int a = reader.nextInt();
        System.out.print("Kiek paskaitu antradieni? ");
        int b = reader.nextInt();
        System.out.print("Kiek paskaitu treciadieni? ");
        int c = reader.nextInt();
        System.out.print("Kiek paskaitu ketvirtadieni? ");
        int d = reader.nextInt();
        System.out.print("Kiek paskaitu penktadieni? ");
        int e = reader.nextInt();
        int suma;
        int min;

        suma = a + b + c + d + e;
        min = suma * 45;

        System.out.println(" ");
        System.out.println("Paskaitu skaicius per savaite - " + suma);
        System.out.println("Tai sudaro " + min + " minuciu");

    }
}
