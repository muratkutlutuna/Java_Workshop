package project_Library;

import java.util.Scanner;

public class LibraryRunner extends LibraryDatabase {
	
	static LibraryDatabase lib = new LibraryRunner();
	static Scanner scan = new Scanner(System.in);
	static boolean exit=true;
	static int inputNo;
	

	
	public static void main(String[] args) {

		headlineFormat("LIBRARY");
		menu();
		headlineFormat("Thanks for your visit :)");
	}

	static void menu() {
		do {

			System.out.println(
							  "Please enter a number given below\n"
							+ "1-Add a book\n"
							+ "2-Show a book with serial number\n"
							+ "3-delete a book with serial number\n"
							+ "4-show the book list\n" 
							+ "5-exit\n" 
							+ "your option is ==> ");
			
			switch (scan.nextLine().replaceAll("\\D", " ").replaceAll("\\s+", " ").charAt(0)) {
			case '1':
				LibraryRunner.addBook();
				break;
			case '2':
				LibraryRunner.showBookByNo();
				break;
			case '3':
				LibraryRunner.delBookWithNo();
				break;
			case '4':
				LibraryRunner.toShowBookList();
				break;
			case '5':
				exit=false;
				break;
			default:
				headlineFormat("Please enter the right number");
				break;
			}
			
		} while (exit);


	}

	static void toShowBookList() {
		headlineFormat("Book list");
		System.out.println("\tNo\tBooks\t\tAuthors\t\tPresses\t\tPrices\n"
				+ "_______________________________________________________________________________");
		for (int i = 0; i < lib.getBookList().size(); i++) {
			System.out.println("\t"+lib.getBookNoList().get(i)+"\t"+
					lib.getBookList().get(i)+"\t"+
					lib.getAuthorList().get(i)+"\t"+
					lib.getPressList().get(i)+"\t"+
					lib.getPriceList().get(i)+"\n");
		}
		System.out.println("menuye donmek icin bir karakter giriniz.");
		scan.nextLine();
		
	}

	static void delBookWithNo() {
		headlineFormat("Delete a book with its number");
		System.out.println("Please enter the serial number of book");
		inputNo=scan.nextInt();
		scan.nextLine();
		int no = lib.getBookNoList().indexOf(inputNo);
		System.out.println("Deleting book name is : "+lib.getBook(no)+"\nwith number : "+inputNo);
		lib.setRemoveBook(inputNo);
		System.out.println("Book has deleted.\n");
	}

	

	static void showBookByNo() {
		headlineFormat("Show book by number");
		System.out.println("Please enter the serial number of book");
		inputNo=lib.getBookNoList().indexOf(scan.nextInt());
		scan.nextLine();
		System.out.println("\tNo\tBooks\t\tAuthors\t\tPresses\t\tPrices\n"
				+ "_______________________________________________________________________________");
		System.out.println("\t"+lib.getBookNo(inputNo)+"\t"+
				lib.getBook(inputNo)+"\t"+
				lib.getAuthor(inputNo)+"\t"+
				lib.getPress(inputNo)+"\t"+
				lib.getPrice(inputNo)+"\n"
				+ "_______________________________________________________________________________");
		}

	static void addBook() {
		headlineFormat("Add Book");
		System.out.println("Please enter the book name");
		String book = scan.nextLine();
		System.out.println("Please enter Author name of the book");
		String author = scan.nextLine();
		System.out.println("Please enter press name of the book");
		String press = scan.nextLine();
		System.out.println("Please enter price of the book");
		double price = scan.nextDouble();
		scan.nextLine();
		lib.setBook(book,author,press,price);
		System.out.println("Kitap eklendi.\n");
		
		
	}
	
	static void headlineFormat(String headline) {
		int t = 50-(headline.length()/2);
		for (int i = 0; i < t; i++) 
			System.out.print("=");
		System.out.print(" "+headline+" ");
		for (int i = 0; i < t; i++) 
			System.out.print("=");
		System.out.println();
		
	}

}
