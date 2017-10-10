/**
 * COSC 210-001 Assignment 4
 * Video.java
 * 
 * This class represents a video being rented with associated information
 * of the name, year, copy number, and price per day.
 * 
 * @author Nathaniel Churchill
 *
 */
public class Video {
	//attributes
	private String name;
	private int year;
	private int copyNumber;
	private double rentalPrice;
	
	//constructor
	public Video(String name, int year, int copyNumber,
                double rentalPrice) {
		super();
		this.name = name;
		this.year = year;
		this.copyNumber = copyNumber;
		this.rentalPrice = rentalPrice;
	}
	
	//getters
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getCopyNumber() {
		return copyNumber;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}
}
