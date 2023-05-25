public class Author {
    private String name1;
    private String secondName;

    public Author(String name1, String secondName) {

        this.name1 = name1;
        this.secondName = secondName;
        System.out.println(name1.equals(secondName));

    }

    public String getName1() {

        return this.name1;
    }

    public String getSecondName() {

        return this.secondName;
    }

    public String toString() {

        return "имя " + this.name1 + " фамилия " + this.secondName;
    }

    public int hashCode() {

        return java.util.Objects.hash(name1, secondName);
    }

}
