import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return published == book.published && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, published, author);
    }

    public String toString() {
        return "Название: " + this.name + ". Год издания: " + this.published + " " + this.author.toString();
    }
}