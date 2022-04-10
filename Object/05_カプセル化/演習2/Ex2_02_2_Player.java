class Ex2_02_2_Player {

  //定数
  final String HAND_G = "グー";
  final String HAND_C = "チョキ";
  final String HAND_P = "パー";

  private String name;
  private String handStatus;

  Ex2_02_2_Player(String nm) {
    this.name = nm;
  }

  void makeHandStatus() {
    int random1to3 = 1 + (int)(Math.random() * 3.0);

    switch(random1to3){
      case 1:
        this.handStatus = HAND_G;
        break;
      case 2:
        this.handStatus = HAND_C;
        break;
      case 3:
        this.handStatus = HAND_P;
        break;
    }
  }

  public String getName(){
    return this.name;
  }
  public String getHandStatus(){
    return this.handStatus;
  }
}