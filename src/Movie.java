public class Movie {
    private String title = "";
    private String director = "";
    private int yearIsCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre = "";
    private int rating;


    public Movie(String title, String director,
                 int yearIsCreated, boolean isInColor, int lengthInMinutes, String genre, int rating) {
        this.title = title;
        this.director = director;
        this.yearIsCreated = yearIsCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
        this.rating = rating;

    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearIsCreated() {
        return yearIsCreated;
    }

    public boolean getisInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYearCreated(int yearIsCreated) {
        this.yearIsCreated = yearIsCreated;
    }

    public void setIsinColor(boolean isInColor) {
        this.isInColor = isInColor;
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String toString() {
        return "Title: " + title +
                ", Director: " + director +
                ", Year created: " + yearIsCreated +
                ", Color: " + (isInColor ? "Yes" : "No") +
                ", Length: " + lengthInMinutes + " minutes" +
                ", Genre: " + genre +
                ", Rating: " + rating + " out of 10!";


    }
}