package LabQ3;

import java.util.Objects;

public abstract class WrittenItem extends Item{
	private String authorName;

	public WrittenItem() {
		super();
	}

	public WrittenItem(String authorName,int idenNum, String title, int numOfCopy) {
		super(idenNum, title, numOfCopy);
		this.authorName=authorName;
		
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		return Objects.equals(authorName, other.authorName);
	}

	@Override
	public String toString() {
		return "WrittenItem [authorName=" + authorName + "]";
	}

	@Override
	public void print() {
		super.print();
		System.out.println("The Book Author is:"+authorName);
	}

}