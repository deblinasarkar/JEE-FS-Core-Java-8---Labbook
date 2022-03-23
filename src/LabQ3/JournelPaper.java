package LabQ3;

import java.util.Objects;

public class JournelPaper extends WrittenItem {
	private int date;

	public JournelPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JournelPaper(int date,String authorName, int idenNum, String title, int numOfCopy) {
		super(authorName, idenNum, title, numOfCopy);
		this.date=date;
		// TODO Auto-generated constructor stub
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JournelPaper other = (JournelPaper) obj;
		return date == other.date;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Date of Publish is:"+date);
	}

	@Override
	public String toString() {
		return "JournelPaper [date=" + date + "]";
	}
	
	
	

}