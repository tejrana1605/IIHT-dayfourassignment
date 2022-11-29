@FunctionalInterface
interface A{
    void show();
    String toString();
}
public class FI {
    public static void main(String args[]){
        A a=()->System.out.println("Hello inside main.");
        a.show();
    }
}
