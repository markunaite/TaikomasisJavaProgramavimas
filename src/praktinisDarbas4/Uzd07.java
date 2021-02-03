package praktinisDarbas4;

import java.util.Scanner;

public class Uzd07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Kiek dalyvavo begiku? ");
        int a = reader.nextInt();
        int min = 0;
        int vid = 0;
        boolean pirmas = true;

        for (int i = 1; i <= a; i++) {
            System.out.println("Iveskite " + i + " begiko laika");
            int b = reader.nextInt();
            if(pirmas){
                min = b;
                pirmas = false;
            }           else   {
                    min = Math.min(b, min);
            }
            vid += b;

        }
        vid = (vid / a) - min;
        System.out.println("Greiciausio begiko laikas: " + min);
        System.out.println("Jis buvo " + vid + " sek geresnis uz vidurki");
    }
}
