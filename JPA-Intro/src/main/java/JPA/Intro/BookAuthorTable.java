package JPA.Intro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookAuthorTable implements Serializable{
	@Column(name="author_id")
	int authorId;
	
	@Column(name="isbn")
	int isbnNo;

}
