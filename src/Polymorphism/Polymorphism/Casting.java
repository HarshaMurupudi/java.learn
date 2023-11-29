package Polymorphism.Polymorphism;

public class Casting {

    public static void main(String[] args){
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        //LVTI (Local Variable Type Inference) Java 10
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        //runtime type
        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof SciFi sf){
            sf.watchSciFi();
        }

    }
}
