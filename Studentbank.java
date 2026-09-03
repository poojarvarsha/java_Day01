import java.util.Scanner;

public class Studentbank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Account details
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        double balance;

        // Initial deposit validation
        do {
            System.out.print("Enter Initial Deposit: ");
            balance = sc.nextDouble();

            if (balance <= 0) {
                System.out.println("Initial deposit must be greater than ₹0.");
            }

        } while (balance <= 0);

        System.out.println("Account created successfully!");

        int choice;

        // Menu loop
        do {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Deposit
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Deposit amount must be greater than ₹0.");
                    } else {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                        System.out.println("Current Balance: ₹" + balance);
                    }
                    break;

                case 2:
                    // Withdrawal
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Withdrawal amount must be greater than ₹0.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Current Balance: ₹" + balance);
                    }
                    break;

                case 3:
                    // Check balance
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    // Display account details
                    System.out.println("\n========== ACCOUNT DETAILS ==========");
                    System.out.println("Student Name  : " + studentName);
                    System.out.println("Student ID    : " + studentId);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Balance       : ₹" + balance);
                    break;

                case 5:
                    // Calculate interest
                    System.out.print("Enter number of years: ");
                    int years = sc.nextInt();

                    if (years <= 0) {
                        System.out.println("Years must be greater than 0.");
                    } else {
                        double rate = 5.0;

                        double interest =
                                (balance * rate * years) / 100;

                        double newBalance = balance + interest;

                        System.out.println("Interest Rate: 5%");
                        System.out.println("Interest Earned: ₹" + interest);
                        System.out.println("New Balance: ₹" + newBalance);
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Thank you for using Student Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 6.");
            }

        } while (choice != 6);

        sc.close();
    }
}
    
