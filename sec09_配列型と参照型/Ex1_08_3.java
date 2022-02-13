/*-< 演習：Ex1_08_3 >---------------------------------
コマンドライン引数として３つの数値を受け取り、その合計値を
表示するプログラムを作成してください。
<例>
コマンドライン入力値：5 8 10
表示される値：23
----------------------------------------------------*/
class Ex1_08_3 {
	public static void main (String[] args) {
		
		int input1 = Integer.parseInt(args[0]);
		int input2 = Integer.parseInt(args[1]);
		int input3 = Integer.parseInt(args[2]);
		System.out.println( input1 + input2 + input3 );    //(15行目)変更しないでください
		
	}
}

