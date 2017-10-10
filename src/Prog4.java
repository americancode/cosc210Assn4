/**
 * COSC 210-001 Assignment 4
 * Prog4.java
 * 
 * This Program tests the three classes of Video, Customer,
 * and Invoice.  It prints 3 invoices for 2 different customers
 * and 2 different videos being rented
 * 
 * @author Nathaniel Churchill
 *
 */
public class Prog4 {

	public static void main(String[] args) {
            Customer clientOne = new Customer("Jason Bourne", 
                    "228 Clarksburg Drive", "Clymer", "FL", "47895", 
                    "8145796666");
            Customer clientTwo = new Customer("Andy Fisch", "987 Aspirin Lane",
                    "Home", "PA", "74832", "7885442536");
            
            Video fishCatcher = new Video("Fish Cather", 1994, 4, 2.23);
            Video tombDiver = new Video("Tomb Diver", 1776, 1, 1.25);
            
            Invoice invoiceOne = new Invoice(clientOne, fishCatcher, 
                    "10/12/2018", 3);
            Invoice invoiceTwo = new Invoice(clientOne, tombDiver, 
                    "10/9/2019", 2);
            Invoice invoiceThree = new Invoice(clientTwo, tombDiver, 
                    "9/11/2011", 3);
            
            invoiceOne.printInvoice();
            invoiceTwo.printInvoice();
            invoiceThree.printInvoice();
	}
}
