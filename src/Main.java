import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (6 >= 3) {
            System.out.println("Hello world!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ditt namn: ");

        String namn = scanner.nextLine();

        System.out.println( "ditt namn är: " + namn);

        if (namn == "noname"){

        }
    }
}
