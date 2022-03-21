import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        A a = new A(){
            @Override
            public String hello(){
                return "hello B";
            }
        };
        System.out.println(a.hello());

        B b = new B(){
            @Override
            public String hello(){
                return "hello B";
            }
        };
        System.out.println(b.hello());

        List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

        Collections.sort(
            numbers,
            new Comparator<Integer>(){
                @Override
                public int compare(Integer x, Integer y){
                    return Integer.compare(x, y);
                }
            });

        List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
        Collections.sort(
            animals,
            new Comparator<String>(){
                @Override
                public int compare(String x, String y){
                    return x.compareTo(y);
                }
            }
        );
        
        System.out.println(numbers);
        System.out.println(animals);
    }
}