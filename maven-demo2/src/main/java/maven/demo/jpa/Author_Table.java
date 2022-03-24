package maven.demo.jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author_table")
public class Author_Table {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToMany(targetEntity = Book_Table.class)
	private List book;

	public Author_Table(int id, String name, List book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}

	public List getBook() {
		return book;
	}

	public void setBook(List book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author_Table(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Author_Table() {
		super();
	}

	@Override
	public String toString() {
		return "Author_Table [id=" + id + ", name=" + name + ", book=" + book + "]";
	}

	
}