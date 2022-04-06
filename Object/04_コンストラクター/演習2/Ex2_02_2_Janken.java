class Ex2_02_2_Janken {
  public static void main(String[] args) {
    // コマインドライン引数からプレイヤーの名前となる２つの文字列を受け取る

    final Ex2_02_2_Player PLAYER_1 = new Ex2_02_2_Player(args[0]);
    final Ex2_02_2_Player PLAYER_2 = new Ex2_02_2_Player(args[1]);
    final Ex2_02_2_Referee REFEREE = new Ex2_02_2_Referee(args[2]);

    REFEREE.startCall();

    PLAYER_1.makeHandStatus();
    PLAYER_2.makeHandStatus();

    REFEREE.handStatusCall(PLAYER_1, PLAYER_2);

    REFEREE.judge(PLAYER_1, PLAYER_2);
  }

}
