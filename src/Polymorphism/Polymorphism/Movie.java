package Polymorphism.Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    //Factory method
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }

}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleaseant Scene", "Scary Music", "Something bad");
    }

    public void watchAdventure() {
        System.out.println("watching adventure");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Funny Scene", "Funny Music", "Happy ending");
    }

    public void watchComedy() {
        System.out.println("watching comedy");
    }
}

class SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Alien Scene", "Alien Music", "Shows the alien");
    }

    public void watchSciFi() {
        System.out.println("watching SciFi");
    }
}


