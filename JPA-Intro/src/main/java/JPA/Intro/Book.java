package JPA.Intro;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "isbn")
	private int isbnNo;
	
	@Column(name = "title")
	private String Title;
	
	@Column(name = "price")
	private double price;
	
	@ManyToMany(mappedBy="books")
    Set<Author2> authors;
	public int getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int isbnNo, String title, double price) {
		super();
		this.isbnNo = isbnNo;
		Title = title;
		this.price = price;
	}

	public Book(String title, double price) {
		super();
		Title = title;
		this.price = price;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [isbnNo=" + isbnNo + ", Title=" + Title + ", price=" + price + "]";
	}
	
	
}