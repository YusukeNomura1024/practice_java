class Sample1_14_2 {
	
	//引数が不要なメソッド
	static String getName() {
		
		return "モコ" ;
		
	}
	
	//戻り値なしのメソッド
	//戻り値がない場合は型名を書かずにvoidとする
	//型がvoidの場合はreturnを使うとエラーになってしまう
	static void printName(String name) {
		
		System.out.println("なまえ：" + name);
		
		
	}
	
	//mainメソッドはプログラムが起動されて必ず一番初めに実行される特別なメソッドです。
	//仮にmainメソッドがクラス内にない場合は処理を開始することができないので、エラーになります。
	//プログラムは必ずmainメソッドからはじまる
	public static void main(String[] args) {
		
		String print = getName() ;
		
		printName( print );
		
	}
	
}
