import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int collectionsize = input.nextInt();

        MovieCollection film = new MovieCollection(collectionsize);


        for (int i = 0; i < collectionsize; i++) {
            System.out.print("Title: ");
            input.nextLine();
             String title = input.nextLine();
            System.out.print("Director: ");
             String director = input.nextLine();
            System.out.print("Creation Date: ");
             int yearIsCreated = input.nextInt();
            input.nextLine();
            System.out.print("True/False, is the movie in color: ");
             boolean isInColor = input.nextBoolean();
            System.out.print("Movie length in minutes: ");
             int lengthInMinutes = input.nextInt();
            System.out.print("Genre: ");
            input.nextLine();
             String genre = input.nextLine();
            System.out.print("Rating from 1/10: ");
            int rating = input.nextInt();


            film.tilføjFilm(title,director,yearIsCreated,isInColor,lengthInMinutes,genre,rating);



        }
        film.printMovieList();
        input.close();


    }
}