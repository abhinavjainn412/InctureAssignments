package com.incture.LibrarySystem;

import java.util.ArrayList;

public class LibraryServicesImplementation implements LibraryService {
	ArrayList<Library> Books = new ArrayList<Library>();

	public boolean addBook(String title, String author, double price) {
		Books.add(new Library(title, author, price));
		System.out.println("Book added successfully");
		return true;
	}

	public void showBookDetails(String title) throws BookNotFound {
		for (Library b : Books) {
			if (b.title.equals(title)) {
				System.out.println("Book details are as follow:");
				System.out.println("Author Name : " + b.authorName);
				System.out.println("Book Title: " + b.title);
				System.out.println("Book price is: " + b.bookPrice);
				return;
			}
		}
		throw new BookNotFound("No such book found in Library");
	}

	public boolean removeBook(String title) throws BookNotFound {
		for (Library b : Books) {
			if (b.title.equals(title)) {
				Books.remove(b);
				System.out.println("Book is removed from Library...!");
				return true;
			}
		}
		throw new BookNotFound("No such book found in Library");

	}

	public boolean issueBook(String title) throws BookNotFound {

		for (Library b : Books) {
			if (b.title.equals(title)) {
				System.out.println("Book price is : " + b.bookPrice);
				Books.remove(b);
				System.out.println("Book is sued to you kindly return it within time...!");
				return true;

			}
		}
		throw new BookNotFound("No such book found in Library");

	}

	public boolean isBookAvailable(String title) throws BookNotFound {
		for (Library b : Books) {
			if (b.title.equals(title)) {
				System.out.println("Book is Available");
				return true;
			}
		}
		throw new BookNotFound("No such book found in Library");

	}

}
