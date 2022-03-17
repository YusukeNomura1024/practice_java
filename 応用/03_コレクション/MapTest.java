import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest{
    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        Map<String, String> map2 = new TreeMap<String,String>();

        map1.put(0, "消しゴム");
        map1.put(2, "ねりけし");

        map1.put(0, "砂けし");
        System.out.println("砂けしで上書きされる:" + map1.get(0));
        System.out.println(map1.get(2));

        System.out.println(map1.containsKey(0));
        System.out.println(map1.containsKey(1));

        System.out.println(map1.size());
        
        System.out.println(map1.remove(0));
        System.out.println(map1.remove(1));

        System.out.println(map1.remove(2, "ねりけし"));
        System.out.println(map1.remove(2, "なし"));
    } 
}