public class Author {
    private String name;
     private String secondName;

    public  Author(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        System.out.println("имя автора " + this.name + " фамилия автора " + this.secondName);

    }
    public String getName(){
        return this.name;
    }
    public String getSecondName(){
        return this.secondName;
    }
}
