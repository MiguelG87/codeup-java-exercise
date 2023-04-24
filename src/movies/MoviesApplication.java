package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean cont = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input sc = new Input();
        while (cont) {
            System.out.println("Please select one of the options: ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            int num = sc.getInt(0, 5);
            switch (num) {
                case (0):
                    System.out.println("Goodbye!");
                    cont = false;
                    break;
                case (1):
                    for (Movie movie : movieArray) {
                        System.out.println("Movie name: " + movie.getName() + "; Movie Category: " + movie.getCategory());
                    }
                    break;
                case (2):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println("Movie name: " + movie.getName() + "; Movie Category: " + movie.getCategory());
                        }
                    }
                    break;
                case (3):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println("Movie name: " + movie.getName() + "; Movie Category: " + movie.getCategory());
                        }
                    }
                    break;
                case (4):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println("Movie name: " + movie.getName() + "; Movie Category: " + movie.getCategory());
                        }
                    }
                    break;
                case (5):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println("Movie name: " + movie.getName() + "; Movie Category: " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    cont = false;
                    System.out.println("This is not an option...");
                    break;
            }
        }
    }
}
