//Example of Encapsulation inheritance
class Person{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation {
    public static void main(String args[]){
        Person p=new Person();
        p.setName("Naman");
        System.out.println(p.getName());
    }
}
