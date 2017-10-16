package br.com.spread.helio;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

public class PredicateExample {

	private static final PrintMovie PRINT_MOVIE = new PrintMovie();

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[] { m("Green Mile", Genre.DRAMA, 8.5),
				m("Forrest Gump", Genre.DRAMA, 8.8),
				m("A Beautiful Mind", Genre.DRAMA, 8.2),
				m("The Notebook", Genre.ROMANTIC, 7.9),
				m("The Titanic", Genre.ROMANTIC, 7.7),
				m("Pretty Woman", Genre.ROMANTIC, 6.9),
				m("Notting Hill", Genre.ROMANTIC, 7),
				m("Inception", Genre.THRILLER, 8.8),
				m("The Game", Genre.THRILLER, 7.8),
				m("Seven", Genre.THRILLER, 8.7),
				m("The Dark Knight", Genre.THRILLER, 9),
				m("The Exorcist", Genre.HORROR, 8),
				m("The Shinning", Genre.HORROR, 8.5),
				m("The Cabin in the Woods", Genre.HORROR, 7),
				m("Insidious", Genre.HORROR, 6.8),
				m("The Avengers", Genre.ACTION, 8.2),
				m("Die Hard", Genre.ACTION, 8.3),
				m("Casino Royale", Genre.ACTION, 8),
				m("Star Wars", Genre.ACTION, 8.7), m("Thor", Genre.ACTION, 7) };
		List<Movie> movieList = Arrays.asList(movies);

		// Are these movies rated above 8?
		@SuppressWarnings("unchecked")
		boolean ratedAbove8 = Iterables.all(
				Arrays.asList(movies[0], movies[1], movies[2]),
				FilterByRating._8);
		System.out.println("Are these movies " + movies[0] + ", " + movies[1]
				+ ", " + movies[2] + " rated above 8? " + ratedAbove8);
		System.out
		.println("-----------------------------------------------------------------");
		
		
		System.out.println("Filtro sobre genero de filmes, exibindo os THRILLER");
		Iterable<Movie> filmesThriller = Iterables.filter(movieList, new FilterByRating(9));
		filmesThriller.forEach(PRINT_MOVIE);

		System.out
		.println("-----------------------------------------------------------------");
		
		// Filter by Thriller Genre
		System.out.println("Filter action genre from the movies list>>");
		Iterable<Movie> thrillers = Iterables.filter(movieList,
				FilterByGenre.ACTION);
		thrillers.forEach(PRINT_MOVIE);
		System.out
		.println("-----------------------------------------------------------------");		
		
		System.out.println("Filter action movies rated above 8>>");
		Predicate<Movie> actionAbove8Rating = Predicates.and(FilterByGenre.ACTION, FilterByRating._8);
		Iterable<Movie> actionMoviesAbove8 = Iterables.filter(movieList,actionAbove8Rating);
		actionMoviesAbove8.forEach(PRINT_MOVIE);

	}

	private static Movie m(String name, Genre genre, double rating) {
		return new Movie(name, genre, rating);
	}
}
