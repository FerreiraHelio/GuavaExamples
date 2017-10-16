package br.com.spread.helio;

import com.google.common.base.Predicate;

@SuppressWarnings("rawtypes")
public enum FilterByGenre implements Predicate {
	
	DRAMA(Genre.DRAMA), 
    THRILLER(Genre.THRILLER), 
    ROMANTIC(Genre.ROMANTIC), 
    ACTION(Genre.ACTION), 
    HORROR(Genre.HORROR);
	
	FilterByGenre(Genre genre){
		this.genre = genre;
	}

	public boolean apply(Object arg0) {
		// TODO Auto-generated method stub
		return ((Movie) arg0).getGenre() == genre;
		
	}

	private Genre genre;

}
