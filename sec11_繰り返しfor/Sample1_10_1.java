//上から順番に実行するのを　順次　という
//その他に繰り返し　条件分岐　もある
//構造化プログラミング


class Sample1_10_1 {
	public static void main (String[] args) {
		
		//for文のしくみ
		
		int loopCount = 0 ; //何回目のループかを表す数値（初期値0）
		
		System.out.println("▼[開始]for文");
		//for(繰り返し条件){繰り返し処理}
		//int i = 0; 初期設定　for文が始まって最初に行う処理
		//i < 4; 実行条件 trueであれば、繰り返し処理を実行する
		//i++ 継続処理
		for( int i = 0 ; i < 4 ; i++ ){
			System.out.println("  ▼[開始]回分の繰り返し処理");
			
			//loopCountを1上げる
			loopCount += 1 ;  
			
			//loopCountおよびカウンタ変数iの表示
			System.out.println("    loopCount：" + loopCount);
			System.out.println("    i（カウンタ変数）：" + i);
			
			System.out.println("  ▲[終了]1回分の繰り返し処理");
		}
		
		System.out.println("▲[終了]for文");
		
	}
}
