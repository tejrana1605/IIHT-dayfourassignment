//Example of Abstraction by overloading
abstract class Animal3{
    public abstract void name();
}
class Tiger extends Animal3{
    public void name(){
        System.out.println("I am Tiger");
    }
}
public class Abstraction {
    public static void main(String args[]){
        Animal3 an=new Tiger();
        an.name();
    }
}
