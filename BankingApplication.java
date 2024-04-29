import java.util.Scanner;

public class BankingApplication {
    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Banking Application");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Banking Application");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: " + balance);
        }
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}