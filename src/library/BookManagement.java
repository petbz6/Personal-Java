package library;

import java.util.ArrayList;

public class BookManagement {

	ArrayList<Books> books = new ArrayList<>();
	
	public BookManagement() {
		addBook("The Hobbit", "J.R.R. Tolkien");
	}
	
	public void addBook(String title, String author) {
		Books newBook = new Books(title, author);
		books.add(newBook);
	}
	
	public ArrayList<Books> getBooks(){
		return books;
	}
	
	
}
