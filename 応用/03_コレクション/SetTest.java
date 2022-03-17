import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest{
    public static void main(String[] args){
        Set<String> set1 = new HashSet<String>();
        Set<Integer> set2 = new LinkedHashSet<Integer>();

        System.out.println(set1.add("ボールペン"));
        System.out.println(set1.add("鉛筆"));

        System.out.println(set1.contains("鉛筆"));
        System.out.println(set1.contains("マジック"));

        System.out.println(set1.size());

        System.out.println(set1.remove("鉛筆"));
        System.out.println(set1.remove("消しゴム")); 

    }
}