import java.math.BigDecimal;

public class Test3 {
  public static void main(String[] args){
    Basket<Apple> appleBasket = new Basket<>(new Apple("普通のりんご", new BigDecimal(200)));
    Basket<Peach> peachBasket = new Basket<>(new Peach("普通のもも", new BigDecimal(300)));

    appleBasket.printTotalPrice();
    peachBasket.printTotalPrice();

  }
}
