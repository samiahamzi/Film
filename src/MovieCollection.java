import java.util.Scanner;
import java.util.ArrayList;


public class MovieCollection {
    private ArrayList<Movie> movieList;

    private Movie[] Filmliste;
    private int count;
    public MovieCollection(){
        this.movieList = new ArrayList<>();
        count = 0;
    }

    public void tilføjFilm(String title, String director,
                           int yearIsCreated, boolean isInColor, int lengthInMinutes, String genre,int rating) {

        movieList.add(new Movie(title, director, yearIsCreated, isInColor, lengthInMinutes, genre,rating));
        count++;
    }
    public void printMovieList(){
        for (Movie movie : movieList){
            if(movie!=null){
                System.out.println(movie);
            }

        }


    }
    public void removeMovie(String title){
        for (Movie movie : movieList){
            if (movie.getTitle().equals(title)) {
                movieList.remove(movie);
                count--;
                return; //return statement for at komme ud af metoden når titlen er fundet.
            } else {
                System.out.println("Movie with title " + title + " was not found in the collection" );
            }
        }

    }
    public void changeMovie (String title, String newTitle, String newDirector, int newYearCreated, boolean newIsinColor, int newLengthInMinutes, String newGenre, int newRating) {
        for (Movie movie : movieList){
            if (movie.getTitle().equals(title)) {
                movie.setTitle(newTitle);
                movie.setDirector(newDirector);
                movie.setYearCreated(newYearCreated);
                movie.setIsinColor(newIsinColor);
                movie.setLengthInMinutes(newLengthInMinutes);
                movie.setGenre(newGenre);
                movie.setRating(newRating);
                return;
            }
        }
        System.out.println("Error! no movie by that title found.");
    }

    public void searchThroughMovies(String title){
        for(Movie movie : movieList){
            if(movie.getTitle().toLowerCase().contains(title.toLowerCase())||title.equalsIgnoreCase("all")){
                System.out.println(movie.toString());
            }
        }
    }


}
