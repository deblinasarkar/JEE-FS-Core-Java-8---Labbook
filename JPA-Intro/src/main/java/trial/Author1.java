package trial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "author")
	public class Author1 {

		@Id
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "author_id")
		private int authorId;
		
		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "middle_name")
		private String middleName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "phone_number")
		private String phoneNumber;

		public int getAuthorId() {
			return authorId;
		}

		public void setAuthorId(int authorId) {
			this.authorId = authorId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Author1(int authorId, String firstName, String middleName, String lastName, String phoneNumber) {
			super();
			this.authorId = authorId;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
		}

		public Author1() {
			super();
		}

		@Override
		public String toString() {
			return "Author1 [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
		}
		
		
		
	}