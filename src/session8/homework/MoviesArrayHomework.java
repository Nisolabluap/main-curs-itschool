package session8.homework;

public class MoviesArrayHomework {

    public static void main(String[] args) {
        /*8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
        If it does, print out its position in the array.*/
        String[] myMovies = {"Batman", "Lord of the rings", "Game of thrones", "House of the dragons"};
        String myMovie = "Lord of the rings";

        for (int index = 0; index < myMovies.length; index++) {
            if (myMovies[index].equalsIgnoreCase(myMovie)) {
                System.out.println("My movies is found on the position " + index + " from my list.");
            }
        }
    }
}