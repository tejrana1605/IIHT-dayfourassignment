//Example of Stream API java 8.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String args[]){
        List<Integer> l= Arrays.asList(1,2,1,4,3,7,6,9,8);
        Stream<Integer> s=l.stream();
        Stream<Integer> s1=l.stream();
        Stream<Integer> s2=l.stream();
        System.out.println("List Operation : ");
        l.forEach(a->System.out.println(a));
        System.out.println("Count Operations : ");
        System.out.println(s.count());
        System.out.println("Stream Operations : ");
        s1.forEach(sr->System.out.println(sr));

        System.out.println("Sorting Operations : ");
        //s.sorted().forEach(sr->System.out.println(sr)); //giving exception : stream has already been operated upon or closed
        s2.sorted().forEach(sr->System.out.println(sr));
        System.out.println("Pipelined Operations : ");
        l.stream().filter(x->x%2==0).sorted().map(n->n*3).forEach(n->System.out.println(n));
    }
}

