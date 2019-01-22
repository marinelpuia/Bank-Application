package com.marinelp;

import java.util.ArrayList;

public class Branch {

    // Declare the fields.

    private String name;
    private ArrayList<Customer> customers;

    // Create constructor.

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    /**
     * Method to add new customer to the branch + add new transaction
     */

    public boolean newCustomer(String customerName, double initialAmount) {

        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }
        return false;
    }

    /**
     * Method to add new transaction to the customer
     */

    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;

        }
        return false;
    }

    /**
     * Method to find a customer name in the ArrayList<Customer>
     */

    private Customer findCustomer(String customerName) {

        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    // Create getter.

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
