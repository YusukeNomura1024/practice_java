import java.util.ArrayList;
import java.util.List;

public class test4 {
  public static void main(String[] args){
    List<? extends Fruit> fruits;
    List<Apple> apples = new ArrayList<>();

    fruits = apples;
  }
}
