public class Book {
    private String name;
    private int published;
    private Author author;

    public Book(String name, int published, Author author) {
        this.name = name;
        this.published = published;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public Author getAuthor() {
        return this.author;
    }
}