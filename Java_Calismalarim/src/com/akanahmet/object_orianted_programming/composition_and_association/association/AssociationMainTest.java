package com.akanahmet.object_orianted_programming.composition_and_association.association;

public class AssociationMainTest {

    public static void main(String[] args) {
        Customer customer = new Customer("Ahmet","AKAN");
        Bank bank = new Bank("XYZ","Malaysia");

        System.out.printf("Customer:\t"+customer.getCustomerName()+" Association\tBank:"+ bank.getBankName());
    }
}
