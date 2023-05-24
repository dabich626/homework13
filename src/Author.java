public class Author {
    private String name2;
     private String secondName;

    public  Author(String name2, String secondName){
        this.name2 = name2;
        this.secondName = secondName;
        System.out.println("имя автора " + this.name2 + " фамилия автора " + this.secondName);

    }
    public String getName2(){
        return this.name2;
    }
    public String getSecondName(){
        return this.secondName;
    }
}
