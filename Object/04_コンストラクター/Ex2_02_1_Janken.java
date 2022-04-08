class Ex2_02_1_Janken {
  public static void main(String[] args) {

    //定数
    final String HAND_G = "グー";
    final String HAND_C = "チョキ";
    final String HAND_P = "パー";
    
    // コマインドライン引数からプレイヤーの名前となる２つの文字列を受け取る

    final Ex2_02_1_Player PLAYER_1 = new Ex2_02_1_Player(args[0]);
    final Ex2_02_1_Player PLAYER_2 = new Ex2_02_1_Player(args[1]);

    System.out.println("じゃんけん・・・ぽん！！！！！");
    PLAYER_1.makeHandStatus();
    PLAYER_2.makeHandStatus();
    System.out.println(PLAYER_1.name + "さんの手:" + PLAYER_1.handStatus);
    System.out.println(PLAYER_2.name + "さんの手:" + PLAYER_2.handStatus);


    System.out.println("結果は・・・");
    //分岐はデータの組み合わせの数だけやるのではなく
    //結果のパターンでまとめて分岐させる
    //今回は結果として、あいこ、P1の勝ち、p2の勝ちの3パターンしかないのでifでは3つだけに分ける
    //ifの条件の中に、組み合わせをまとめる
    if ((PLAYER_1.handStatus).equals(PLAYER_2.handStatus)) {
      //文字列の比較はqualsを使う
      //あいこの場合
      System.out.println("あいこ！勝負つかず");

    } else if( (PLAYER_1.handStatus.equals(HAND_G) && PLAYER_2.handStatus.equals(HAND_C)) 
            || (PLAYER_1.handStatus.equals(HAND_C) && PLAYER_2.handStatus.equals(HAND_P))
            || (PLAYER_1.handStatus.equals(HAND_P) && PLAYER_2.handStatus.equals(HAND_G)) ){
      //プレイヤー１が勝利した場合
      System.out.println(PLAYER_1.name + "さんの勝利");

    } else if( (PLAYER_2.handStatus.equals(HAND_G) && PLAYER_1.handStatus.equals(HAND_C)) 
            || (PLAYER_2.handStatus.equals(HAND_C) && PLAYER_1.handStatus.equals(HAND_P))
            || (PLAYER_2.handStatus.equals(HAND_P) && PLAYER_1.handStatus.equals(HAND_G)) ){
      //プレイヤー2が勝利した場合
      System.out.println(PLAYER_2.name + "さんの勝利");
    } else {
      System.out.println("[error]ジャンケンの判定が不正です");
    }
  }
}
