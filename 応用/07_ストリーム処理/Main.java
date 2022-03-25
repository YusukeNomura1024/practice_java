import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("りんご", 7));
        fruits.add(new Fruit("みかん", 15));
        fruits.add(new Fruit("いちご", 4));
        fruits.add(new Fruit("メロン", 8));
        fruits.add(new Fruit("ぶどう", 20));

        List<Fruit> filtered = new ArrayList<>();

        for (Fruit fruit : fruits){
            if(fruit.quantity <= 10){
                //絞り込まれたリストに追加
                filtered.add(fruit);
            }
        }

        //絞り込まれたリストをそれぞれ20個ずつ追加したリストを作成する
        List<Fruit> ordered = new ArrayList<>();
        for(Fruit fruit : filtered){
            ordered.add(fruit.order(20));
        }
        //個数が少ない順に並べ替える
        ordered.sort(new Comparator<Fruit>(){
            @Override
            public int compare(Fruit f1, Fruit f2){
                return f1.quantity - f2.quantity;
            }
        });

        for(Fruit fruit : ordered){
            System.out.println(fruit);
        }
    }
}