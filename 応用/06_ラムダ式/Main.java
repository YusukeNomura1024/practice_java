import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Main{
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

        Collections.sort(
            numbers,
            (Integer x, Integer y) -> {
                return Integer.compare(x,y);
            }
        );
        //Comparetorはcompareメソッドしかないため関数型インターフェースとなる、
        //ラムダ式で書き換えた場合、compareメソッドしか存在しないため
        //@Overrideでcompareを上書きする記述をしなくても、自動で上書きされる

        
        System.out.println(numbers);
   }
}