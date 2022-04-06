class Ex2_02_1_Janken {
  public static void main(String[] args) {
    // コマインドライン引数からプレイヤーの名前となる２つの文字列を受け取る

    final Ex2_02_1_Player PLAYER_1 = new Ex2_02_1_Player(args[0]);
    final Ex2_02_1_Player PLAYER_2 = new Ex2_02_1_Player(args[1]);

    System.out.println("じゃんけん・・・ぽん！！！！！");
    PLAYER_1.makeHandStatus();
    PLAYER_2.makeHandStatus();
    System.out.println(PLAYER_1.name + "さんの手:" + PLAYER_1.handStatus);
    System.out.println(PLAYER_2.name + "さんの手:" + PLAYER_2.handStatus);

    judge(PLAYER_1, PLAYER_2);
  }

  public static void judge(Ex2_02_1_Player p1, Ex2_02_1_Player p2) {
    System.out.println("結果は・・・");
    Ex2_02_1_Player winner = null;
    if (p1.handStatus != p2.handStatus) {
      if (p1.handStatus == "パー") {
        if (p2.handStatus == "チョキ") {
          winner = p2;
        } else if (p2.handStatus == "グー") {
          winner = p1;
        }
      }
      if (p1.handStatus == "チョキ") {
        if (p2.handStatus == "グー") {
          winner = p2;
        } else if (p2.handStatus == "パー") {
          winner = p1;
        }
      }
      if (p1.handStatus == "グー") {
        if (p2.handStatus == "パー") {
          winner = p2;
        } else if (p2.handStatus == "チョキ") {
          winner = p1;
        }
      }
    }
    if (winner == p1) {
      System.out.println(p1.name + "さんの勝利");
    } else if (winner == p2) {
      System.out.println(p2.name + "さんの勝利");
    } else {
      System.out.println("あいこ！勝負つかず");
    }
  }
}
