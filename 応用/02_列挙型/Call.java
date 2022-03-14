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

    }

    static void printDessertName(Dessert dessert){
    System.out.println(dessert);
}
}