package JavaCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample implements Comparator<Movie> {


    public int compare(Movie m1, Movie m2) {

        // Sort by rating in descending order
        return Double.compare(m2.getR(), m1.getR());
    }
}


class CheckComparator {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));

        Collections.sort(list, new ComparatorExample());
        for(Movie m:list){
            System.out.println(m);

    }
    }
}
