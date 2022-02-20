public class zihan1answer {
	public static void main (String[] args) {
    final String ERRMESSAGE_DEFAULT =        "「警告：入力された値は効果として適切ではありません。」"; //メッセージ（O型）
    int coinNum = args.length; //投入された硬貨の枚数
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
    System.out.println("ただいまの投入金額は" + coinSum + "円です");
	}
}
