import java.sql.SQLOutput;

public class Main {

    public void main(String[] args) {
        Author georgeMartin = new Author("George","Martin");
        Book iceAndFire = new Book("iceAndFire",georgeMartin,1996);
        System.out.println(iceAndFire.getBookName());
        System.out.println(georgeMartin.getName());
        System.out.println(iceAndFire.getPublishingYear());

        Author andrzejSapkowski = new Author("Andrzej","Sapkowski");
        Book witcher = new Book("witcher",andrzejSapkowski,2013);
        System.out.println(witcher.getBookName());
        System.out.println(andrzejSapkowski.getName());
        System.out.println(witcher.getPublishingYear());

        System.out.println(witcher.equals(iceAndFire)) ;

    }


}




