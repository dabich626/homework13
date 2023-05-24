public class Book {
   private String bookName;
    private int publishingYear;
            Author name;
    public  Book(String bookName, Author name, int publishingYear) {
        this.bookName = bookName;
        this.name = name;
        this.publishingYear = publishingYear;
        System.out.println("Название книги " + bookName);
        System.out.println("имя автора " + name);
        System.out.println("год публикации " + publishingYear);
    }
    public String getBookName(){
        return  this.bookName;
    }
    public Author getName(){
        return this.name;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(){
        this.publishingYear = 1999;
    }
}
