package section10.intro;

public class Book {
    private String name;
    private String Author;
    private String genre;
    private double rating;

    public Book(String name, String author, String genre, double rating) {
        this.name = name;
        Author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}
