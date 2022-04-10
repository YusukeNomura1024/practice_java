class Ex2_02_2_Referee {
  //定数
  final String HAND_G = "グー";
  final String HAND_C = "チョキ";
  final String HAND_P = "パー";

  private String name;

  Ex2_02_2_Referee(String nm) {
    this.name = nm;
  }

  public void startCall() {
    messageReferee("じゃんけん・・・ぽん！！！！！");
  }

  public void handStatusCall(Ex2_02_2_Player player) {
    if( player.getHandStatus().equals(HAND_G) || player.getHandStatus().equals(HAND_C) || player.getHandStatus().equals(HAND_P)){
      messageReferee(player.getName() + "さんの手は" + player.getHandStatus() + "でした！");
    } else {
      System.out.println("[error]ジャンケンの判定が不正です");
    }
  }

  public void judge(Ex2_02_2_Player PLAYER_1, Ex2_02_2_Player PLAYER_2) {
    messageReferee("結果は・・・");
    String p1_handstatus = PLAYER_1.getHandStatus();
    String p1_name = PLAYER_1.getName();
    String p2_handstatus = PLAYER_2.getHandStatus();
    String p2_name = PLAYER_2.getName();

    if (p1_handstatus.equals(p2_handstatus)) {
      //文字列の比較はqualsを使う
      //あいこの場合
      messageReferee("あいこ！勝負つかず");

    } else if( (p1_handstatus.equals(HAND_G) && p2_handstatus.equals(HAND_C)) 
            || (p1_handstatus.equals(HAND_C) && p2_handstatus.equals(HAND_P))
            || (p1_handstatus.equals(HAND_P) && p2_handstatus.equals(HAND_G)) ){
      //プレイヤー１が勝利した場合
      messageReferee(p1_name + "さんの勝利");

    } else if( (p2_handstatus.equals(HAND_G) && p1_handstatus.equals(HAND_C)) 
            || (p2_handstatus.equals(HAND_C) && p1_handstatus.equals(HAND_P))
            || (p2_handstatus.equals(HAND_P) && p1_handstatus.equals(HAND_G)) ){
      //プレイヤー2が勝利した場合
      messageReferee(p2_name + "さんの勝利");
    } else {
      messageReferee("[error]ジャンケンの判定が不正です");
    }
  }

  private void messageReferee(String msg){
    System.out.println( this.name + "「" + msg + "」" );
  }

  public String getName(){
    return this.name;
  }
}