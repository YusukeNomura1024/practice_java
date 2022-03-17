import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExpansionForTest{
    public static void main(String[] args){
        List<String> prefectures = new ArrayList<>();
        prefectures.add("北海道");
        prefectures.add("青森県");
        prefectures.add("秋田県");
        for(String prefecture : prefectures) {
            System.out.println(prefecture);
        }

        Map<Integer, String> classmates = new HashMap<>();
        classmates.put(1, "青木");
        classmates.put(2, "石坂");
        classmates.put(3, "小野田");
        for(Integer key : classmates.keySet()){
            System.out.println(key);
        }

        for(String name : classmates.values()){
            System.out.println(name);
        }

        for(Map.Entry<Integer, String> classmate : classmates.entrySet()){
            System.out.println(classmate.getKey() + "番は" + classmate.getValue());

        }
    }
}