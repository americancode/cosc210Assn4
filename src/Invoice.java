/**
 * COSC 210-001 Assignment 4
 * Invoice.java
 * 
 * This program represents an invoice of a specific video being rented 
 * to a specific customer
 * 
 * @author Nathaniel Churchill
 *
 */
public class Invoice {
	//attributes
	private Customer customerOne;
	private Video videoOne;
	private String date;
	private int daysRented;
	
	//constructors
	public Invoice(Customer customerOne, Video videoOne, String date, 
                int daysRented) {
		super();
		this.customerOne = customerOne;
		this.videoOne = videoOne;
		this.date = date;
		this.daysRented = daysRented;
	}
	
	//getters
	public Customer getCustomerOne() {
		return customerOne;
	}
	public Video getVideoOne() {
		return videoOne;
	}
	public String getDate() {
		return date;
	}
	public int getDaysRented() {
		return daysRented;
	}
	
        //custom methods
        /**
         * this method calculates the subtotal(daily price * days rented)
         * @return total
         */
	private double subtotal(){
		double total = videoOne.getRentalPrice() * daysRented;
                return total;
	}
        /**
         * this methods calculates the tax on a given subtotal
         * @return tax
         */
        private double tax(){
            double tax = subtotal() * 0.06;
            return tax;
        }
        /**
         * this method calculates the total owed, including tax
         * @return total  
         */
        private double total(){
            double total = tax() + subtotal();
            return total;
        }
        /**
         * This method prints the invoice
         */
        public void printInvoice(){
            System.out.println("Customer Information");
            System.out.printf("Name:        %s \n", customerOne.getName());
            System.out.printf("Address:     %s \n", customerOne.getAddress());
            System.out.printf("City:        %s \n", customerOne.getCity());
            System.out.printf("State:       %s\n", customerOne.getState());
            System.out.printf("Zip code:    %s \n", customerOne.getZip());
            System.out.printf("PhoneNumber: %s \n\n", customerOne.getPhoneNumber());
            System.out.println("Video Information");
            System.out.printf("Video Rented:      %s\n", videoOne.getName());
            System.out.printf("Release Year:      %d\n", videoOne.getYear());
            System.out.printf("Video Copy Number: %d\n", videoOne.getCopyNumber());
            System.out.printf("Price per night: $ %.2f\n\n", videoOne.getRentalPrice());
            System.out.println("Billing Information");
            System.out.printf("Subtotal:              $ %.2f\n", subtotal());
            System.out.printf("Tax:                   $ %.2f\n",tax());
            System.out.printf("Total Price Of Rental: $ %.2f\n\n\n\n\n\n", total());
                
        }
}
