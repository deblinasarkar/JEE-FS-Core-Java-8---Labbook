package LabQ3;

import java.util.Objects;

public abstract class Item {
	private int idenNum;
	private String title;
	private int numOfCopy;
	public Item() {
		super();
	}
	
	public Item(int idenNum, String title, int numOfCopy) {
		super();
		this.idenNum = idenNum;
		this.title = title;
		this.numOfCopy = numOfCopy;
	}

	public int getIdenNum() {
		return idenNum;
	}

	public void setIdenNum(int idenNum) {
		this.idenNum = idenNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopy() {
		return numOfCopy;
	}

	public void setNumOfCopy(int numOfCopy) {
		this.numOfCopy = numOfCopy;
	}
	public void print()
	{
		System.out.println("The book number is:"+idenNum);
		System.out.println("The book title is:"+title);
		System.out.println("the book Number of copies:"+numOfCopy);
	}
	public void AddItems()
	{
		System.out.println("Item are Added");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return idenNum == other.idenNum && numOfCopy == other.numOfCopy && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Item [idenNum=" + idenNum + ", title=" + title + ", numOfCopy=" + numOfCopy + "]";
	}
	
	
	

}