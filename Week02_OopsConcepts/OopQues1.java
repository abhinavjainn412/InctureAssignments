import java.util.*;
public class OopQues1 {
Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	try {
		Book b = new Book();
		System.out.println("BookClass");
		b.input();
		b.display();
		}
	catch(Exception e){
		System.out.println("Title- 0");
		System.out.println("Price- 0");
		System.out.println("PageCount- 0 ");
		}
	try{
		System.out.println("TapClass");
		Tap t = new Tap();
		t.input();
		t.display();
		}
	catch(Exception e){
		System.out.println("Title- 0");
		System.out.println("Price- 0");
		System.out.println("Playtime- 0 ");
		}
	
		}
		}
class Publication {
	String title;
	float price;
	Publication() {
	}
	}
class Book extends Publication {
	int pageCount;
	public void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the title- ");
	title = sc.nextLine();
	System.out.println("Enter the price- ");
	price = sc.nextFloat();
	System.out.println("Enter the page count- ");
	pageCount = sc.nextInt();
	}
	public void display () {	
		System.out.println("The title is- " + title);
		System.out.println("The price is- " + price);
		System.out.println("The page count is- " + pageCount);
	}
	}
class Tap extends Publication {
int playTime;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title- ");
		title = sc.nextLine();
		System.out.println("Enter the price- ");
		price = sc.nextFloat();
		System.out.println("Enter the play time- ");
		playTime = sc.nextInt();
		}
	public void display() {
		System.out.println("Title is- " + title);
		System.out.println("Price is- " + price);
		System.out.println("Play time- " + playTime);
		}
}
