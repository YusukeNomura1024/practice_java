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

        Greeting greeting = (String word) -> {
            System.out.println(word);
            return word;
        };
        Greeting goodbye = (String word) -> {
            System.out.println(word);
            return word;
        };

        greeting.hello("こんにちは");
        goodbye.hello("さようなら");
        
        sayHello(greeting);
        //g.hello()を呼び出すだけで、こんにちはが出力される
        //でさらにsayHelloメソッドでこんにちわが呼び出される
        sayHello(goodbye);

        // Kick lowKick = () -> {
        //     return "ローキック";
        // };
        // actKick(lowKick);
   }
   public static void sayHello(Greeting g){
       System.out.println(g.hello("こんにちは"));
   }
//    public static void actKick(Kick k){
//        System.out.println(k.kick());
//    }
}