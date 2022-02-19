public class zihan2 {
	public static void main (String[] args) {
    final String ERRMESSAGE_1 =        "「警告：１円玉は使えません。」"; //メッセージ（A型）
    final String ERRMESSAGE_5 =        "「警告：５円玉は使えません。」"; //メッセージ（B型）
    final String ERRMESSAGE_DEFAULT =        "「警告：入力された値は効果として適切ではありません。」"; //メッセージ（O型）

    int totalCountMoney = 0;
    int productCost = Integer.parseInt(args[args.length -1]);
    for(int i = 0; i < args.length-1; i++){
      int entryMoney = Integer.parseInt(args[i]);
      if(entryMoney == 10 || entryMoney == 50 || entryMoney == 100 || entryMoney == 500){
        totalCountMoney += entryMoney;
      }else{
        switch(entryMoney){
          case 1:
            System.out.println(ERRMESSAGE_1);
            break;
          case 5:
            System.out.println(ERRMESSAGE_5);
            break;
          default:
            System.out.println("「警告：" + entryMoney + "は硬貨として適切ではありません。」");
            break;
        }
      }
    }
    // System.out.println("ただいまの投入金額は" + totalCountMoney + "円です");
    // System.out.println("商品金額は" + productCost + "円です");
    int change = totalCountMoney - productCost;
    System.out.println( change + "円のお釣りです。ありがとうございました。");

	}
}
