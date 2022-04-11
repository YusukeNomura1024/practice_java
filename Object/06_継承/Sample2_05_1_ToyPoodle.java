class Sample2_05_1_ToyPoodle extends Sample2_05_1_Dog {
	
	//---フィールド-------------------------------------
	
	String name  ; //名前
	String skill ; //特技
	
	//---コンストラクタ---------------------------------
	
	Sample2_05_1_ToyPoodle(){
		//super()の明記はしていないが暗黙的に自動で実行されるので、自動で鳴き声に「わんわん」が追加される
		this.name  = "未設定（name）" ;
		this.skill = "未設定（skill）" ;
	}
	
	Sample2_05_1_ToyPoodle(String v){
		super( v );
		this.name  = "未設定（name）" ;
		this.skill = "未設定（skill）" ;
	}
	
	Sample2_05_1_ToyPoodle(String n , String s , String v){
		super( v );
		this.name  = n ;
		this.skill = s ;
	}
	
	//---メソッド---------------------------------------
	
	//特技を実行
	void doSkill(){
		System.out.println( skill ) ;
	}
}
