class Ex2_02_2_Referee {
  String name;
  String handStatus;

  Ex2_02_2_Referee(String nm) {
    this.name = nm;
  }

  void startCall() {
    System.out.println("「じゃんけん・・・ぽん！！！！！」");
  }

  void handStatusCall(Ex2_02_2_Player p1, Ex2_02_2_Player p2) {
    System.out.println("審判" + this.name + "「" + p1.name + "さんの手は" + p1.handStatus + "でした！」");
    System.out.println("審判" + this.name + "「" + p2.name + "さんの手は" + p2.handStatus + "でした！」");
  }

  void judge(Ex2_02_2_Player p1, Ex2_02_2_Player p2) {
    System.out.println("審判" + this.name + "「結果は・・・」");
    Ex2_02_2_Player winner = null;
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
      System.out.println("審判" + this.name + "「" + p1.name + "さんの勝利」");
    } else if (winner == p2) {
      System.out.println("審判" + this.name + "「" + p2.name + "さんの勝利」");
    } else {
      System.out.println("審判" + this.name + "「あいこ！勝負つかず」");
    }
  }
}