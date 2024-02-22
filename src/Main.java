import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller film = new Controller();
        int Navigator = 0;



        while (Navigator != -1) {
            int Sentinel = 0;
            System.out.println("Welcome to your personal Movie Collection Library. " +
                    "\n Enter 1 if you would like to add movies to your collection. " +
                    "\n Enter 2 if you would like to change the movies in your collection " +
                    "\n Enter 3 if you would like to take a look at your library " +
                    "\n Enter 4 if you would like to delete movies from your library "
            );
            Navigator = input.nextInt();
            input.nextLine();

            if (Navigator == 1) {
                while (Sentinel != -1) {
                    System.out.println("Input movie information.");
                    System.out.print("Title: ");
                    String title = input.nextLine();
                    System.out.print("Director: ");
                    String director = input.nextLine();
                    System.out.print("Creation Date: ");
                    int yearIsCreated = input.nextInt();
                    System.out.print("True/False, is the movie in color: ");
                    boolean isInColor = input.nextBoolean();
                    System.out.print("Movie length in minutes: ");
                    int lengthInMinutes = input.nextInt();
                    System.out.print("Genre: ");

                    input.nextLine();
                    String genre = input.nextLine();
                    System.out.print("Rating from 1/10: ");
                    int rating = input.nextInt();


                    film.tilføjFilm(title, director, yearIsCreated, isInColor, lengthInMinutes, genre, rating);

                    System.out.println("Your movie has been added - Type '-1' if your collection is done, or enter 0 to add more to the collection");
                    Sentinel = input.nextInt();
                    input.nextLine();

                }
                System.out.println("Your collection looks like this");

                film.printMovieList();

                System.out.println("You have now added your desired movies. Enter '0' if you would like to go back to the main menu");
                Navigator = input.nextInt();
            }else if (Navigator == 2) {
                while(Sentinel!=-1) {

                    System.out.println("What movie would you like to change?");
                    film.printMovieList();
                    String title = input.nextLine();
                    System.out.println("Input movie information.");
                    System.out.print("Title: ");
                    String newTitle = input.nextLine();
                    System.out.print("Director: ");
                    String newDirector = input.nextLine();
                    System.out.print("Creation Date: ");
                    int newYearIsCreated = input.nextInt();
                    System.out.print("True/False, is the movie in color: ");
                    boolean newIsInColor = input.nextBoolean();
                    System.out.print("Movie length in minutes: ");
                    int newLengthInMinutes = input.nextInt();
                    System.out.print("Genre: ");
                    input.nextLine();
                    String newGenre = input.nextLine();

                    while (true) {
                        System.out.print("Rating from 1/10: ");
                        int newRating = input.nextInt();
                        if (newRating <= 10 && newRating >= 1) {
                            film.changeMovie(title, newTitle, newDirector, newYearIsCreated, newIsInColor, newLengthInMinutes, newGenre, newRating);
                            break;
                        } else {
                            System.out.println("Error! Rating should be between 1 and 10. Try again");
                        }
                    }
                    System.out.println("Your movie "+ title+" has been changed to "+newTitle+".Type -1ifyour collection is done, or enter 0 to keep the collection.");
                    Sentinel= input.nextInt();
                    input.nextLine();
                }




            } else if (Navigator == 3) {

                System.out.println("search for movie by title or letter in title: ");
                String title = input.nextLine();
                film.searchThroughMovies(title);


            }

            else if (Navigator == 4) {

                System.out.println("What movie would you like to remove?");
                film.printMovieList();
                String remove = input.nextLine();
                film.removeMovie(remove);
                film.printMovieList();

                System.out.println("You have now removed the movie " + remove + " from your collection " +
                        "\n enter '4' if you would like to remove another movie, or enter '0' to get back to the main menu");

                Navigator = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Invalid input. Try again");
                Navigator = input.nextInt();
                input.nextLine();
            }




        }
        }
    }
