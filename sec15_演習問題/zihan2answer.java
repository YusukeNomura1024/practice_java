public class zihan2answer {
	public static void main (String[] args) {
    int coinNum = args.length - 1; //投入された硬貨の枚数
    int coinChk = 0; //チェック対象の硬貨の金額
    int coinSum = 0; //投入された硬貨の合計金額　※使用可能な硬貨のみで算出
    for(int i = 0; i < coinNum; i++){
      coinChk = Integer.parseInt(args[i]);
      if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500){
        //使用可能な硬貨であった場合、coinSumに加算
        coinSum += coinChk;
      }else if(coinChk == 1 || coinChk == 5){
        System.out.println("警告:" + coinChk + "円玉は使えません");
      }else {
        System.out.println("「警告：" + coinChk + "は硬貨として適切ではありません。」");
      }
    }
    //お釣りの計算　（合計金額 - 商品値段）
    int price = Integer.parseInt(args[ args.length - 1 ]); //購入された商品の値段（コマンドライン引数の最後尾要素）
    int change = coinSum - price;
    System.out.println(coinSum + "円のお釣りです。ありがとうございました。");
	}
}
