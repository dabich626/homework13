public class Author {
    private String name;
     private String secondName;

    public  Author(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        System.out.println("имя автора " + this.name + " фамилия автора " + this.secondName);
        System.out.println(name.equals(secondName));

    }
    public String getName(){
        return this.name;
    }
    public String getSecondName(){
        return this.secondName ;
    }
    public String toString(){
        return "имя " + this.name + " фамилия " + this.secondName;
    }
    public int hashCode () {
        return java.util.Objects.hash(name,secondName);
    }
}
