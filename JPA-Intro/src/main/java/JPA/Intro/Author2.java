package JPA.Intro;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import JPA.Intro.Book;
@Entity
@Table(name = "author2")
public class Author2 {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "author_id")
	private int authorId;
	
	@Column(name = "author_name")
	private String authorName;
	
	@ManyToMany
	@JoinTable(
			  name = "books", 
			  joinColumns = @JoinColumn(name = "author_id"), 
			  inverseJoinColumns = @JoinColumn(name = "isbn"))
    Set<Book> books;
	
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Author2(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public Author2() {
		super();
	}

	@Override
	public String toString() {
		return "Author2 [authorId=" + authorId + ", authorName=" + authorName + "]";
	}
}