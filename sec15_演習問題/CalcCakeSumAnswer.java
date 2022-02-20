public class CalcCakeSumAnswer {
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

    final int DISCOUNT_APPLYING_PRICE = 1000; //割引が適用される金額
    final double DISCOUNT_RATE = 0.8;         //割引率
    final double TAX = 1.08;
    //----------支払金額の計算--------------
    String checkCakeName = "";                //処理対象のケーキ名
    int checkCakeCount = 0;
    int totalPrice = 0;
    int payment = 0;

    //合計金額を計算する
    for(int i = 0; i < args.length; i += 2){

      //処理対象のケーキ名と個数を取得
      checkCakeName = args[i];
      checkCakeCount = Integer.parseInt(args[i+1]);

      //合計金額の計算
      //ケーキ名ごとに小計を算出して合計金額に足しこむ
      System.out.println(checkCakeName + checkCakeCount + "個");
      switch(checkCakeName){
        case CAKE_NAME_1:
          totalPrice += PRICE_1 * checkCakeCount;
          break;
        case CAKE_NAME_2:
          totalPrice += PRICE_2 * checkCakeCount;
          break;
        case CAKE_NAME_3:
          totalPrice += PRICE_3 * checkCakeCount;
          break;
        case CAKE_NAME_4:
          totalPrice += PRICE_4 * checkCakeCount;
          break;
        case CAKE_NAME_5:
          totalPrice += PRICE_5 * checkCakeCount;
          break;
        default:
          System.out.println(checkCakeName + "は取り扱いの無い商品です。");
          break;
      }
    }

    //支払額を計算する
    if(totalPrice > DISCOUNT_APPLYING_PRICE){ //合計金額が割引対象である場合
      //割引率を加味した税込み額を計算して支払額とする
      payment = (int)(totalPrice * DISCOUNT_RATE * TAX);
    }else{ //合計金額が割引対象でない場合
      //税込み額を計算して支払い額とする
      payment = (int)(totalPrice * TAX);
    }
    System.out.println("合計金額は" + payment + "円です。");
	}
}
