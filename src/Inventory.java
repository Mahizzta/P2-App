
public class Inventory {
	private String name;
	private int id;
	private String author;
	private int year;
	private boolean isAvailable;
	private  java.util.Date dateBorrow;
	private  java.util.Date dateReturn;
	private Inventory[] books;


	public Inventory(String name, int id, String author, int year, boolean isAvailable) {
		this.setName(name);
		this.setId(id);
		this.setAuthor(author);
		this.setYear(year);
		this.setAvailable(isAvailable);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public java.util.Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(java.util.Date dateReturn) {
		this.dateReturn = dateReturn;
	}

	public java.util.Date getDateBorrow() {
		return dateBorrow;
	}

	public void setDateBorrow(java.util.Date dateBorrow) {
		this.dateBorrow = dateBorrow;
	}
	public void searchBook() {
		//
	}
	public Inventory[] borrowBook(Inventory book) {
		// Extra code for adding a book to your inventory
		return this.books;
	}
	public void confirmAvailable() {
		
	}
	public void confirmReceipt() {
		
	}
	public void showInformation() {
		
	}
	public void returnBook() {
		
	}
	public void getBook() {
		
	}
}
