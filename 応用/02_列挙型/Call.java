public class Call {
    public static void main(String args[]){
        System.out.println(Dessert.APPLE);
        System.out.println(Dessert.ICE_CREAM);
        System.out.println(Dessert.CAKE);

        Dessert apple = Dessert.APPLE;
        Dessert iceCream = Dessert.ICE_CREAM;
        Dessert cake = Dessert.CAKE;

        System.out.println(apple);
        System.out.println(iceCream);
        System.out.println(cake);

        printDessertName(apple);
        printDessertName(Dessert.APPLE);

        System.out.println(Dessert.APPLE.name()); // .name()は定義された定数名を文字列として返せる
        System.out.println(Dessert.APPLE.ordinal());

        System.out.println(Dessert.APPLE.getPrice());
        System.out.println(Dessert.ICE_CREAM.getPrice());

        System.out.println(Dessert.ICE_CREAM.getRank());

        System.out.println(Dessert.ICE_CREAM.getallergy());
        // System.out.println(Dessert.ICE_CREAM.allergy);　これだと呼び出せない
        // 定数に入れる値は当然定数として使うので、Dessert.ICE_CREAM.allergyとして直接呼び出したり、変更を加えることはできない
        //だから、getallergy()という呼び出しメソッドを作って、間接的に呼び出している。

        Dessert.APPLE.catchCoppy();
    }

    static void printDessertName(Dessert dessert){
    System.out.println(dessert);
}
}