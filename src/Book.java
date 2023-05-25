public class Book {
    private String name;
    private int publishingYear;
    private Author author1;

    public Book(String bookName, Author author1, int publishingYear) {

        this.name = bookName;
        this.author1 = author1;
        this.publishingYear = publishingYear;
        System.out.println(author1.equals(name));
    }

    public String getName() {

        return this.name;
    }

    public Author getauthor() {

        return this.author1;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int year) {

        this.publishingYear = year;
    }

    public String toString() {

        return "название книги " + this.name + "имя автора " + this.author1.toString() + " год издания " + this.publishingYear;
    }

    public int hashCode() {

        return java.util.Objects.hash(author1, name, publishingYear);
    }

    public boolean equals(Object Book) {

        if (this.name == Book)

            return true;
        if (name == null || getClass() != Book.getClass())

            return false;
        return false;
    }
}
