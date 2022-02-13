class Sample1_06_1 {
	public static void main (String[] args) {
		
		//算術演算子の活用
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		String stNumberX = "1";
		String stNumberY = "2";
		
		//『 + 』
		int answer1 = numberX + numberY ;
		System.out.println("answer1：" + answer1);
		
		//『 - 』
		int answer2 = numberX - numberY ;
		System.out.println("answer2：" + answer2);
		
		//『 * 』
		int answer3 = numberX * numberY ;
		System.out.println("answer3：" + answer3);
		
		//『 / 』
		int answer4 = numberX / numberY ;
		System.out.println("answer4：" + answer4);
		
		//『 / 』（割り切れない場合）
		//　/スラッシュはたとえdouble型に代入しても小数点以下は切り捨てになる？
		int answer5 = numberX / numberZ ;
		System.out.println("answer5：" + answer5);
		
		//『 % 』
		int answer6 = numberX % numberZ ;
		System.out.println("answer6：" + answer6);
		
		// 符号反転
		int answer7 = -answer6 ;
		System.out.println("answer7：" + answer7);
		
		//『 ○++ 』
		int answer8 = numberX++ ;
		System.out.println("answer8：" + answer8);
		System.out.println("（ numberX：" + numberX + " ）");
		System.out.println("（ numberX：" + numberX + " ）");
		//　変数++の場合は初回の代入時は変数がそのまま入る
		// ２回目以降に変数を呼び出すと、＋１された値になる
		
		//『 ++○ 』
		int answer9 = ++numberY ;
		System.out.println("answer9：" + answer9);
		System.out.println("（ numberY：" + numberY + " ）");
		//変数を代入した時点で+1された値が入る、
		//２回目以降に変数を呼び出しても、代入時と同じ＋１された値になる
		
		//『 +1 』と『 ++ 』の使い分けの注意
		//＋１を使う場合は、変数に変更はされないが、
		//++を使用すると変数自体が変更されてしまう
		int answer10 = numberZ + 1 ;
		System.out.println("answer10：" + answer10);
		System.out.println("（ numberZ：" + numberZ + " ）");
		
		//『 -- 』
		int answer11 = numberZ-- ;
		System.out.println("answer11：" + answer11);
		System.out.println("（ numberZ：" + numberZ + " ）");
		
		//『 + 』（文字の結合）
		String answer12 = stNumberX + stNumberY ;
		System.out.println("answer12：" + answer12);
		
	}
}
