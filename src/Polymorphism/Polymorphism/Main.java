package Polymorphism.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();


        //factory method invocation
        Movie newMovie = Movie.getMovie("SCIFI", "New Work");
        newMovie.watchMovie();

        //prompt
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adv, C for Comedy, " + "S for SciFi, or Q to quit");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Title");
            String title = s.nextLine();
            Movie movie1 = Movie.getMovie(type, title);
            movie1.watchMovie();
        }
    }
}
