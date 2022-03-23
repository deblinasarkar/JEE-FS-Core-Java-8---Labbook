package LabQ3;

import java.util.Objects;

public class Video extends MediaItem {

private String director;
private String genre;
private int year;
public Video() {
	super();
	// TODO Auto-generated constructor stub
}
public Video(int runtime,String director, String genre, int year) {
	super(runtime);
	this.director = director;
	this.genre = genre;
	this.year = year;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Video other = (Video) obj;
	return Objects.equals(director, other.director) && Objects.equals(genre, other.genre) && year == other.year;
}
@Override
public void print() {
	super.print();
	System.out.println("Director name is:"+director);
	System.out.println("Genre is"+genre);
	System.out.println("Year is:"+year);
}
@Override
public String toString() {
	return "Video [director=" + director + ", genre=" + genre + ", year=" + year + "]";
}


}