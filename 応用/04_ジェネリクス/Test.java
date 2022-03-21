import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test{
  public static void main(String[] args){
    Set<Integer> set = new LinkedHashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    // set.add("Two");

    for(Integer setchild : set){
      System.out.println(setchild);
    }

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Taro");
    map.put(2, "Tako");
    String Value = map.get(1);
    System.out.println(Value);
  }
}