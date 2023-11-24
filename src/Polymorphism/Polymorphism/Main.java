package Polymorphism.Polymorphism;

public class Main {
    public static void main(String[] args){
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();
    }
}
