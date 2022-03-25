public class Fruit {
    public String name;  //商品名
    public int quantity; //在庫数

    public Fruit(String name, int quantity){
        this.name = name; 
        this.quantity = quantity; 
    }

    //在庫数を増やすメソッド
    public Fruit order(int quantityToAdd){
        return new Fruit(this.name, this.quantity + quantityToAdd);
    }

    //出力用にオーバーライド
    @Override
    public String toString() {
        return name + ": " + quantity + "個";
    }
}