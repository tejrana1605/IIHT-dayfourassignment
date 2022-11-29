//Example of Lambda Expression
interface Animal4{
    public void sound();
}
public class LambdaExpression {
    public static void main(String args[]){
        Animal4 a=()->System.out.println("The dog is barking.");
        a.sound();
        Animal4 b=()->System.out.println("The tiger is roaring.");
        b.sound();
    }
}
