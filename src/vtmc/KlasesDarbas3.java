package vtmc;

public class KlasesDarbas3 {
    public static void main(String[] args) {
        int number = 1;
        String name = "Tadas";

        if(number == 1) { // boolean israiska (true arba false)
            System.out.println("Labas");
        } else if (number == 0) {
            System.out.println("Viso");
        } else if (number == 1){
            System.out.println("lala");
        } else {
            System.out.println("...");
        }

        switch(number) {
            case 0:
                System.out.println("Viso");
                break;
            case 1:
                System.out.println("Labas");
                break;
            case 2:
                System.out.println("Kazkas");
                break;
            default:
                System.out.println("...");
        }

        while(true) {
            System.out.println("labas");
            break;
        }

        int counter = 0;
        do {
            counter++;
            System.out.println("Hello");
        } while (counter == 10);

        int count;
        for(count = 0;;) {
            count++;
            if (count == 10 ) {
            System.out.println("Laba");
            break;
        }
        }
    }
}
