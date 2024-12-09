import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        test();

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

        while (true){
        for (int i = 0; i < 5; i++) {
            System.out.print("skriv in ett tal");
            String inp = scanner.nextLine();
            int tal = Integer.parseInt(inp);



        if (tal > 5) {
            System.out.println("högre än 5!");

        }

        }
        }
    }


    public static void test(){

        Scanner scan= new Scanner(System.in);
        boolean cont= true;

        while(true) {
            try {

                System.out.print("Number please: ");
                int num = scan.nextInt();
                scan.nextLine();

                System.out.println("the number is " + num);
                break;
            } catch (Exception error) {
                scan.nextLine();
                System.out.println("that is not a number");

            }
            System.out.println("this will run no matter result of try");
        }

    }
}
