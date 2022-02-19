public class CalcCakeSum {
	public static void main (String[] args) {
    final int PRICE_1 = 320; //ショートケーキの価格
    final int PRICE_2 = 350; //モンブランの価格
    final int PRICE_3 = 370; //チョコレートケーキの価格
    final int PRICE_4 = 400; //いちごのタルトの価格
    final int PRICE_5 = 300; //チーズケーキの価格
    final String CAKE_NAME_1 = "ショートケーキ";
    final String CAKE_NAME_2 = "モンブラン";
    final String CAKE_NAME_3 = "チョコレートケーキ";
    final String CAKE_NAME_4 = "いちごのタルト";
    final String CAKE_NAME_5 = "チーズケーキ";


    int totalCountMoney = 0;
    for(int i = 0; i < args.length; i++){
      int productPrice = 0;
      if(i % 2 == 0 || i == 0){
        String productName = args[i];
        int productCount = Integer.parseInt(args[i+1]);
        System.out.println(productName + productCount + "個");
        switch(productName){
          case CAKE_NAME_1:
            productPrice = PRICE_1;
            break;
          case CAKE_NAME_2:
            productPrice = PRICE_2;
            break;
          case CAKE_NAME_3:
            productPrice = PRICE_3;
            break;
          case CAKE_NAME_4:
            productPrice = PRICE_4;
            break;
          case CAKE_NAME_5:
            productPrice = PRICE_5;
            break;
          default:
            System.out.println(productName + "は取り扱いの内商品です。");
            break;
        }
        int subtotal = productPrice * productCount;
        System.out.println("小計" + subtotal + "円です");
        totalCountMoney += subtotal;
      }
    }
    System.out.println("税抜き" + totalCountMoney + "円です。");
    if(totalCountMoney >= 1000){
      totalCountMoney = totalCountMoney / 10 * 8;
      System.out.println("２割引きで" + totalCountMoney + "円です。");
    }
    int totalCountMoneyAddFix = totalCountMoney * 108 / 100;
    System.out.println("お会計は税込み" + totalCountMoneyAddFix + "円です。");
	}
}
