//Example of multilevel inheritance
class Project1{
    public void description(){
        System.out.println("Banking Finance System.");
    }
}
class Developer1 extends Project1{
    public void development(){
        System.out.println("Development is done.");
    }
}
class Tester extends Developer1{
    public void testing(){
        System.out.println("Testing is done.");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[]){
        Tester t=new Tester();
        t.description();
        t.development();
        t.testing();
    }
}