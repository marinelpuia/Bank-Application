package com.marinelp;

public class Main {


    public static void main(String[] args) {


        // Your job is to create a simple banking application.
        // There should be a Bank class.
        // It should have an ArrayList of Branches.
        // Each Branch should have an ArrayList of Customers
        // The Customer class should have an ArrayList of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch.
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction.
        // Add a transaction for an existing customer for that branch.
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions.
        // Demonstration autoboxing and unboxing in your code.
        // Hint: Transactions.
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions.


        Bank bank = new Bank("National Romanian Bank System");

        // ADD NEW BRANCH TO THE BANK SYSTEM.
        bank.addBranch("Banca Transilvania");
        bank.addBranch("Banca Romaneasca");
        bank.addBranch("Banca Brd");

        // ADD NEW CUSTOMERS TO THE BRANCHES.
        bank.addCustomer("Banca Transilvania", "MARINEL", 100.00);
        bank.addCustomer("Banca Transilvania", "NIKOL", 200.00);
        bank.addCustomer("Banca Transilvania", "AURA", 300.00);

        // CUSTOMERS FOR SECOND BRANCH.
        bank.addCustomer("Banca Romaneasca", "RODICA", 400.00);
        bank.addCustomer("Banca Romaneasca", "NELU", 500);
        bank.addCustomer("Banca Romaneasca", "DORINA", 600);

        // CUSTOMERS FOR THIRD BRANCH.
        bank.addCustomer("Banca Brd", "GIANI", 700);
        bank.addCustomer("Banca Brd", "DARIUS", 800);
        bank.addCustomer("Banca Brd", "RAYAN", 900);

        // ADD MORE TRANSACTIONS TO THE EXISTING CUSTOMERS.
        bank.addCustomerTransaction("Banca Transilvania", "MARINEL", 50.00);
        bank.addCustomerTransaction("Banca Transilvania", "MARINEL", 6000);
        bank.addCustomerTransaction("Banca Transilvania", "NIKOL", 500.00);
        bank.addCustomerTransaction("Banca Transilvania", "AURA", 500.00);
        bank.addCustomerTransaction("Banca Transilvania", "AURA", 10000.00);
        bank.addCustomerTransaction("Banca Transilvania", "AURA", 5000);
        bank.addCustomerTransaction("Banca Romaneasca", "RODICA", 500);

        // PRINT OUT THE CUSTOMERS AND THE TRANSACTIONS FOR EACH BRANCH.
        System.out.println();
        bank.listCustomers("Banca Transilvania", true);
        System.out.println();
        bank.listCustomers("Banca Romaneasca", true);
        System.out.println();
        bank.listCustomers("Banca Brd", true);


        System.out.println();

        // TESTS FOR VALIDATE DIFFERENT SITUATIONS.
        // # CUSTOMER ALREADY EXIST.
        // # BRANCH ALREADY EXIST.
        // # THIS CUSTOMER DOES NOT EXIST.

        if (!bank.addCustomer("Banca Transilvania", "MARINEL", 2000)) {
            System.out.println("ERROR CUSTOMER MARINEL ALREADY EXIST.");
        }

        if (!bank.addBranch("Banca Transilvania")) {
            System.out.println("ERROR THIS BRANCH ALREADY EXIST.");
        }

        if (!bank.addCustomerTransaction("Banca Transilvania", "VASILE", 800)) {
            System.out.println("ERROR THIS CUSTOMER DOES NOT EXIST.");
        }

    }

}
