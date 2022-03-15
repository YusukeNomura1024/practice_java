import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String args[]){
        List<String> list1 = new ArrayList<String>();

        List<Integer> list2 = new LinkedList<Integer>();

        //要素の追加
        list1.add("消しゴム");
        list1.add("シャーペン");

        // 位置を指定して要素を追加することもできます。
        System.out.println("繰り返し処理ーーーーーーー");
        list1.add(1, "ボールペン");
        for(int i=0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

        //要素の存在チェック
        System.out.println(list1.contains("スティックのり"));
        System.out.println(list1.contains("ボールペン"));

        // 要素を削除する
        list1.remove("テープ");
        list1.remove("ボールペン");
        list1.remove(0);
        for(int i=0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
}