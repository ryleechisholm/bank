package com.company;
import java.util.*;

public class Account {
    private final String name;
    private final int accountNo;
    private final int amount;

    Account(String name, int accountNo, int amount) {
        this.name = name;
        this.accountNo = accountNo;
        this.amount = amount;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String action;
        do {
            System.out.println("Would you like to: \n[create] and account \n[check] your balance \n[deposit] money \n[withdraw] money? \n[q] to quit");
            action = in.nextLine();
            switch (action) {
                case "create":
                    System.out.print("Enter your name: ");
                    String aName = in.nextLine();
                    System.out.print("Enter your account number: ");
                    int aNo = in2.nextInt();
                    System.out.print("Enter your starting balance: ");
                    int aBal = in2.nextInt();
                    accounts.add(new Account(aName, aNo, aBal));
                    break;
                case "check":
                    boolean found = false;
                    System.out.println("Enter your name: ");
                     aName = in.nextLine();
                     String aAmount;
                    System.out.print("Enter your account number: ");
                    int num = in2.nextInt();
                    for (Account a : accounts) {
                        if (aName.equals(a.name) && num == a.accountNo) {
                            System.out.println("Your balance is $" + a.amount);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Incorrect name or password");
                    }
                    break;
                case "deposit":
//                    depositIn(in2);
            }
        } while (!action.equals("q"));
    }
