class Ex2_02_2_Player {
  String name;
  String handStatus;

  Ex2_02_2_Player(String nm) {
    this.name = nm;
  }

  void makeHandStatus() {
    String[] st = { "グー", "チョキ", "パー" };
    int num = (int) (Math.random() * (st.length));
    this.handStatus = st[num];
  }
}