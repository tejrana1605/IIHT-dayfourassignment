//Example of Polymorphism by overloading
class  Animal{

    public void sound(){
        System.out.println("Animal Sound");
    }
    public void sound(String name){
        System.out.println(name+" bark.");
    }
}
public class PolymorphismByOverloading {
    public static void main(String args[]){
        Animal an=new Animal();

        an.sound();
        an.sound("Dog");

    }
}