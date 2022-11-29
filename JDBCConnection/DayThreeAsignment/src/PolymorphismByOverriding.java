//Example of Polymorphism by overriding
class  Animals{

    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Bird extends Animals{
    public void sound(){
        System.out.println("Bird Sound");
    }
}
class Dog extends Animals{
    public void sound(){
        System.out.println("Dog Sound");
    }
}
public class PolymorphismByOverriding {
    public static void main(String args[]){
        Animals an=new Animals();
        Animals br= new Bird();
        Animals dg=new Dog();
        an.sound();
        br.sound();
        dg.sound();
    }
}
