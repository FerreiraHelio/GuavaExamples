package br.com.spread.helio;

import com.google.common.base.Predicate;

@SuppressWarnings("rawtypes")
public class FilterByRating implements Predicate{

    public static final FilterByRating _8 = new FilterByRating(8);
    public static final FilterByRating _9 = new FilterByRating(9);
    private double grade;
    
    FilterByRating(double grade) {
        this.grade = grade;
    }

	public boolean apply(Object arg0) {
		return ((Movie) arg0).getRating() >= grade;
	}

}
