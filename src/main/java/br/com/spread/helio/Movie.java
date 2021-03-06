package br.com.spread.helio;

public class Movie {
	private String name;
	private Genre genre;
	private double rating;

	Movie(String name, Genre genre, double rating) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	public String toString() {
		return name + "(" + genre + ", " + rating + ")";
	}

	public String getName() {
		return name;
	}

	public Genre getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}
}
