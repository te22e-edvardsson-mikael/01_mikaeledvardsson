import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (6 >= 3) {
            System.out.println("Hello world!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ditt namn: ");
        System.out.print("Ange ditt lösenord: ");

        String namn = scanner.nextLine();
        String losenord = scanner.nextLine();

        while (true) {
            System.out.println("ditt namn är: " + namn);
            System.out.println("ditt lösenord är: " + losenord);

            if (namn.equals("noname") && losenord.equals("nopass")) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("Wrong");
            }

        }

        for (int i = 0; i < 32; i++) {
            System.out.println("hello world!");
        }

    }
}
