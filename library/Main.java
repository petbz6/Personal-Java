package library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
    	BookManagement bookmanagement = new BookManagement();
    	
    	ArrayList<Books> booksList = bookmanagement.getBooks();
    	
    	System.out.println("Book List");
    	for (Books book : booksList) {
    		System.out.println(book.toString());
    	}
    }
}
