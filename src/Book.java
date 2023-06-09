public class Book {
    private String name;
    private int publishingYear;
    private Author author;

    public Book(String bookName, Author author1, int publishingYear) {

        this.name = bookName;
        this.author = author1;
        this.publishingYear = publishingYear;
    }

    public String getName() {

        return this.name;
    }

    public Author getauthor() {

        return this.author;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int year) {

        this.publishingYear = year;
    }

    public String toString() {

        return "название книги " + this.name + "имя автора " + this.author.toString() + " год издания " + this.publishingYear;
    }

    public int hashCode() {

        return java.util.Objects.hash(author, name, publishingYear);
    }

    public boolean equals(Object Book) {
        Book book = (Book) Book;

        if (this.name.equals(book.getName()) && this.author.equals(book.getauthor()) && this.publishingYear == book.getPublishingYear()) {

            return true;

        } else  if (name == null || getClass() != Book.getClass()) {

            return false;
        }
        return false;
    }
}
