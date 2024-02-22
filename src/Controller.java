public class Controller {
    private MovieCollection movieCollection;

    public Controller() {
        this.movieCollection = new MovieCollection();
    }

    public void tilføjFilm(String title, String director,
                           int yearIsCreated, boolean isInColor, int lengthInMinutes, String genre, int rating) {
        movieCollection.tilføjFilm(title, director, yearIsCreated, isInColor, lengthInMinutes, genre, rating);
    }

    public void printMovieList(){
        movieCollection.printMovieList();
    }
    public void removeMovie(String title){
        movieCollection.removeMovie(title);
    }
    public void changeMovie(String title, String newTitle, String newDirector, int newYearCreated, boolean newIsinColor, int newLengthInMinutes, String newGenre, int newRating){
        movieCollection.changeMovie(title,newTitle,newDirector,newYearCreated,newIsinColor,newLengthInMinutes,newGenre,newRating);
    }
    public void searchThroughMovies(String title){
        movieCollection.searchThroughMovies(title);
    }

}

