class Ex2_02_2_Referee {
  //定数
  final String HAND_G = "グー";
  final String HAND_C = "チョキ";
  final String HAND_P = "パー";

  String name;

  Ex2_02_2_Referee(String nm) {
    this.name = nm;
  }

  void startCall() {
    messageReferee("じゃんけん・・・ぽん！！！！！");
  }

  void handStatusCall(Ex2_02_2_Player player) {
    if( player.handStatus.equals(HAND_G) || player.handStatus.equals(HAND_C) || player.handStatus.equals(HAND_P)){
      messageReferee(player.name + "さんの手は" + player.handStatus + "でした！");
    } else {
      System.out.println("[error]ジャンケンの判定が不正です");
    }
  }

  void judge(Ex2_02_2_Player PLAYER_1, Ex2_02_2_Player PLAYER_2) {
    messageReferee("結果は・・・");

    if ((PLAYER_1.handStatus).equals(PLAYER_2.handStatus)) {
      //文字列の比較はqualsを使う
      //あいこの場合
      messageReferee("あいこ！勝負つかず");

    } else if( (PLAYER_1.handStatus.equals(HAND_G) && PLAYER_2.handStatus.equals(HAND_C)) 
            || (PLAYER_1.handStatus.equals(HAND_C) && PLAYER_2.handStatus.equals(HAND_P))
            || (PLAYER_1.handStatus.equals(HAND_P) && PLAYER_2.handStatus.equals(HAND_G)) ){
      //プレイヤー１が勝利した場合
      messageReferee(PLAYER_1.name + "さんの勝利");

    } else if( (PLAYER_2.handStatus.equals(HAND_G) && PLAYER_1.handStatus.equals(HAND_C)) 
            || (PLAYER_2.handStatus.equals(HAND_C) && PLAYER_1.handStatus.equals(HAND_P))
            || (PLAYER_2.handStatus.equals(HAND_P) && PLAYER_1.handStatus.equals(HAND_G)) ){
      //プレイヤー2が勝利した場合
      messageReferee(PLAYER_2.name + "さんの勝利");
    } else {
      messageReferee("[error]ジャンケンの判定が不正です");
    }
  }

  void messageReferee(String msg){
    System.out.println( this.name + "「" + msg + "」" );
  }
}