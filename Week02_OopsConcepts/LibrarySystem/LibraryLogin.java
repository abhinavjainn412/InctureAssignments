package com.incture.LibrarySystem;

import java.util.Scanner;

public class LibraryLogin {

	public static void main(String[] args) throws BookNotFound {
		LibraryService library = new LibraryServicesImplementation();
		Scanner sc = new Scanner(System.in);
		String title;
		String authorName;
		double bookPrice;
		while (true) {
			System.out.println(
					"Enter \n 1: To add Book \n 2: showBookDetails \n 3: RemoveBook \n 4: IssueBook \n 5: check book available");
			int choice = sc.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Enter Book title");
					title = sc.next();
					System.out.println("Enter Book Author");
					authorName = sc.next();
					System.out.println("Enter Book price");
					bookPrice = sc.nextDouble();
					library.addBook(title, authorName, bookPrice);
					break;
				case 2:
					System.out.println("Enter Book title");
					title = sc.next();
					library.showBookDetails(title);
					break;
				case 3:
					System.out.println("Enter Book title");
					title = sc.next();
					library.removeBook(title);
					break;
				case 4:
					System.out.println("Enter Book title");
					title = sc.next();
					library.issueBook(title);
					break;
				case 5:
					System.out.println("Enter Book title");
					title = sc.next();

					library.isBookAvailable(title);
					break;
				default:
					System.out.println("Invalid choice");
					System.exit(1);

				}
			} catch (Exception e) {
				System.out.println(e + " ");
			}
		}
	}

}
