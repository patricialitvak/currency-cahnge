import java.util.Scanner;

public class Main {

    // currency of dollar
    public static final double DOLLAR = 3.5260;
    // currency of euro
    public static final double EURO = 3.6850;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        int option;
        do {
            System.out.println("Press  1 to convert shekels to dollars");
            System.out.println("Press  2 to convert dollars to shekels");
            System.out.println("Press  3 to convert euro to shekels");
            System.out.println("Press  4 to convert shekels to euros");
            System.out.println("Press 0 to exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter the amount in Shekels:");
                    amount = scanner.nextDouble();
                    System.out.println("The amount in Dollars is: " + (amount / DOLLAR) + " USD");
                    break;
                case 2:
                    System.out.println("Please enter the amount in Dollars:");
                    amount = scanner.nextDouble();
                    System.out.println("The amount in Shekels is: " + (amount * DOLLAR) + " ILS");
                    break;
                case 3:
                    System.out.println("Please enter the amount in Euro:");
                    amount = scanner.nextDouble();
                    System.out.println("The amount in Shekels is: " + amount * EURO + " ILS");
                    break;
                case 4:
                    System.out.println("Please enter the amount in Shekels:");
                    amount = scanner.nextDouble();
                    System.out.println("The amount in Euro is: " + amount / EURO + " EUR");
                    break;
                default:
            }
        } while(option != 0);
        System.out.println("goodbye");
    }
}