//Example of Hierarchical inheritance
class Project2{
    public void description(){
        System.out.println("Banking Finance System.");
    }
}
class Developer2 extends Project2{
    public void development(){
        System.out.println("Back end coding part done.");
    }
}
class Developer3 extends Project2{
    public void development(){
        System.out.println("UI coding part done.");
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]){
        Developer2 d1=new Developer2();
        Developer3 d2=new Developer3();
        d1.description();
        d1.development();
        d2.description();
        d2.development();
    }
}