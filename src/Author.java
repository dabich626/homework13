public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {

        this.name = name;
        this.secondName = secondName;

    }

    public String getName() {

        return this.name;
    }

    public String getSecondName() {

        return this.secondName;
    }

    public String toString() {

        return "имя " + this.name + " фамилия " + this.secondName;
    }

    public int hashCode() {

        return java.util.Objects.hash(name, secondName);
    }
    public boolean equals(Object Author){

        Author author = (Author) Author;

        if (this.name.equals(getName()) && this.secondName.equals(getSecondName())) {

            return true;

        } else if (name == null || getClass() != Author.getClass()) {

            return false;
        }
        return false;
    }

}
