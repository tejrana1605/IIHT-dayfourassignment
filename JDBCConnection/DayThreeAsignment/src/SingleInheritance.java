//Example of single inheritance
class Project{
    public void description(){
        System.out.println("Banking Finance System.");
    }
}
class Developer extends Project{
    public void development(){
        System.out.println("Development is done.");
    }
}
public class SingleInheritance {
    public static void main(String args[]){
        Developer d=new Developer();
        d.description();
        d.development();
    }
}
