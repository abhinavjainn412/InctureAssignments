package com.incture.LibrarySystem;

public interface LibraryService {

	boolean addBook(String title, String author, double price);

	void showBookDetails(String title) throws BookNotFound;

	boolean removeBook(String title) throws BookNotFound;

	boolean issueBook(String title) throws BookNotFound;

	boolean isBookAvailable(String title) throws BookNotFound;

}
