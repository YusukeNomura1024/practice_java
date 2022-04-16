class Sample2_06_1_Dog {
	
	//---定数-------------------------------------------
	public static final String SCIENTIFIC_NAME = "Canis lupus familiaris" ; //学名：カニス・ルプス・ファミリアーリス
	
	//---フィールド-------------------------------------
	private static int    dogsNumber = 0 ; //犬の全頭数（初期値：0）
	private        String breed ;          //犬種
	private        String name  ;          //名前
	
	//---コンストラクタ---------------------------------
	Sample2_06_1_Dog(String br , String nm){
		this.dogsNumber++ ;  //インスタンス化されるたびにdogsNumberの値を＋１する
		this.breed = br ; //犬種はインスタンスごとに設定すべきだが、この変数がクラス変数になっている場合は、インスタンス化の度に上書きされてしまう。
		this.name  = nm ;
	}
	
	//---メソッド---------------------------------------
	//getStatusメソッド
	public String getStatus(){
		return "犬の全頭数:" + this.dogsNumber + " / 名前:" + this.name + " / 犬種:" + this.breed ;
	}
	
	//getter（dogsNumber）
	public static int getDogNumber(){
		return dogsNumber ;
	}
}
