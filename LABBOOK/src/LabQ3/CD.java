package LabQ3;

import java.util.Objects;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD() {}
	public CD(int runtime,String artist, String genre) {
		super(runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("The artist Name:"+artist);
		System.out.println("The genre is:"+genre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(genre, other.genre);
	}
	
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}
	
	
	

}