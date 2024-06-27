package homeAssignWeek1Day2;

public class Library {
public String addBook(String bookTitle) {
	System.out.println("Book added Successfully");
	return bookTitle;
}
public void issueBook() {
	System.out.println("Book issued Successfully");

}
public static void main(String[] args) {
	Library bookStatus = new Library();
	bookStatus.addBook("bookTitle");
	bookStatus.issueBook();
	
}}
