package domain;

public class Book extends Entity<Long> {
    private String title;
    private String author;
    private String ISBN;
    private int year;
    private Double rating;

    public Book(Long id, String title, String author, String ISBN, int year, Double rating) {
        super.setId(id);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
