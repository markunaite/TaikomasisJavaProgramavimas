package praktinisDarbas4;

import java.util.Scanner;

public class Uzd06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta? ");
        int a = reader.nextInt();
        double viso = 0;

        for (int c = 0; c < a; c++) {
            System.out.println("Iveskite eglutes auksti: " );
            int aukstis = reader.nextInt();
            viso = viso + aukstis;
        }

        System.out.println("Vidutinis aukstis: " + viso / a + " cm");
    }
}


