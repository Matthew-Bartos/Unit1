package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account();

        System.out.println("What is your name?");
        account1.name = input.nextLine();

        System.out.println("What is your starting balance?");
        account1.startingBalance = input.nextInt();

        System.out.println("What passcode do you want?");
        account1.password = input.nextInt();

        System.out.println("Account created, please log in.");

        System.out.println("What is your name?");
        input.nextLine();
        String nameReal = input.nextLine();
        if (nameReal.equals(account1.name)) {
            System.out.println("Enter your passcode.");
            int passcodeReal = input.nextInt();

            if (passcodeReal == account1.password) {
                System.out.println("Access granted, Welcome " + account1.name + ".");
                System.out.println(
                        "What would you like to do? Check your balance by pressing 1, Withdraw money by pressing 2, Change passcode by pressing 3, or you can exit by pressing 4.");
                account1.operator = input.nextInt();
                while (account1.operator <= 3) {
                    if (account1.operator == 1) {
                        System.out.println("You have $" + account1.startingBalance + " in your account.");
                        System.out.println(
                                "What would you like to do? Check your balance by pressing 1, Withdraw money by pressing 2, Change passcode by pressing 3, or you can exit by pressing 4.");
                        account1.operator = input.nextInt();

                    }
                    if (account1.operator == 2) {
                        System.out.println("Enter ammout you want to subtract.");
                        int withdrawl = input.nextInt();
                        System.out.println("Your balance is $" + (account1.startingBalance - withdrawl));
                        account1.startingBalance = (account1.startingBalance - withdrawl);
                        System.out.println(
                                "What would you like to do? Check your balance by pressing 1, Withdraw money by pressing 2, Change passcode by pressing 3, or you can exit by pressing 4.");
                        account1.operator = input.nextInt();

                    }
                    if (account1.operator == 3) {
                        System.out.println("What passcode do you want?");
                        account1.password = input.nextInt();
                        System.out.println("Passcode changed. Please reenter passcode.");
                        int passcodeNew = input.nextInt();
                        if (passcodeNew == account1.password) {
                            System.out.println("Passcode changed");
                            System.out.println(
                                    "What would you like to do? Check your balance by pressing 1, Withdraw money by pressing 2, Change passcode by pressing 3, or you can exit by pressing 4.");

                            account1.operator = input.nextInt();

                        } else {
                            System.out.println("Access denied");

                        }

                    }
                    if (account1.operator == 4) {
                        System.out.println("Thank you and have a nice day!");
                    }
                }
            } else {
                System.out.println("Access denied");

            }

        } else {
            System.out.println("Access denied");
        }

    }
}
