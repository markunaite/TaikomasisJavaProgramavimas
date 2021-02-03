package praktinisDarbas4;

public class Uzd03 {
    public static void main(String[] args) {
        System.out.printf("%3s \t %3s \t %3s \t %3s \n", "a", "a^2", "a^3", "a^4");
        System.out.println("-----------------------------");

        for (int i = 1; i < 5; i++) {

            System.out.printf("%3d \t %3.0f \t %3.0f \t %3.0f \n", i, Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4));
        }

    }
}