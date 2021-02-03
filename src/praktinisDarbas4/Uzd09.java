package praktinisDarbas4;

public class Uzd09 {
    public static void main(String[] args) {
        int[] skaiciai = {23, 45, 12, 3, 78, 98, 15, -3} ;
        for (int skaicius : skaiciai) {
            if (skaicius % 2 == 0) {
                System.out.print(skaicius);
            }
        }
    }
}
