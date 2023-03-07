package com.incture.LibrarySystem;

public class Library {
	String title;
	String authorName;
	double bookPrice;

	public Library() {
		super();

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return authorName;
	}

	public void setAuthor(String author) {
		this.authorName = author;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Library(String title, String author, double bookPrice) {
		super();
		this.title = title;
		this.authorName = author;
		this.bookPrice = bookPrice;
	}

}
