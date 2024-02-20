import java.util.Scanner;

public class MovieCollection {

    private Movie[] Filmliste;
    private int count;
    public MovieCollection(int size){
        this.Filmliste = new Movie [size];
        this.count = 0;
    }

    public void tilføjFilm(String title, String director,
                           int yearIsCreated, boolean isInColor, int lengthInMinutes, String genre,int rating) {

        Filmliste[count++] = new Movie(title, director, yearIsCreated, isInColor, lengthInMinutes, genre,rating);
    }
    public void printMovieList(){
        for (Movie movie : Filmliste){
            if(movie!=null){
                System.out.println(movie);
            }

        }


    }



}
