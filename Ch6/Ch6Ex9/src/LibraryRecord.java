/**
 * File: LibraryRecord.java
 * ------------------------
 * This class creates an instance of a library book.
 * @author perramount
 *
 */

public class LibraryRecord {

	public LibraryRecord(String title, String author, String catalog, String publisher, int year, boolean circulation) {
		this.title = title;
		this.author = author;
		this.catalog_number = catalog;
		this.publisher = publisher;
		this.year = year;
		this.in_circulation = circulation;
	}
	
	public LibraryRecord(String title, String author, String catalog, String publisher, int year) {
		this.title = title;
		this.author = author;
		this.catalog_number = catalog;
		this.publisher = publisher;
		this.year = year;
		this.in_circulation = true;
	}
	
	/* Getter methods */
	public String get_title() {
		return this.title;
	}
	
	public String get_author() {
		return this.author;
	}
	
	public String get_catalog_number() {
		return this.catalog_number;
	}
	
	public String get_publisher() {
		return this.publisher;
	}
	
	public int get_year() {
		return this.year;
	}
	
	public boolean get_circulation() {
		return this.in_circulation;
	}
	
	/* Change the circulation status */
	public void set_circulation(boolean circulation) {
		this.in_circulation = circulation;
	}
	
	public String toString() {
		String circulation_status = "";
		if (this.in_circulation) {
			circulation_status = "yes";
		} else {
			circulation_status = "no";
		}
		return "('" + this.title + "', by " + this.author + ", " + this.year + ") Catalog Number: " + this.catalog_number + ", Published by: " +
			   this.publisher + ", In Circulation: " + circulation_status;
	}
	
	/* Private instance variables */
	private String title;
	private String author;
	private String catalog_number;
	private String publisher;
	private int year;
	private boolean in_circulation;
	
}
