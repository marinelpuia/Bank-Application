package com.marinelp;

import java.util.ArrayList;

public class Customer {

    // Declare the fields.

    private String name;
    private ArrayList<Double> transactions;

    // Create constructor.

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>(); // Initialise the ArrayList
        addTransaction(initialAmount); // Update ArrayList by using adTransaction method

    }

    /**
     * Method to add new amount to the ArrayList and to
     * demonstrate the AUTOBOXING concept.
     */

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    // Create getter.

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
